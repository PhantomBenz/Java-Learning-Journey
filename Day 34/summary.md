# Day 34 – Balancing BSTs & Introduction to AVL Trees in Java

Today I extended my BST skills by practicing **BST balancing** and studied the theoretical foundations of **AVL (Adelson‑Velsky & Landis) Trees**—a self‑balancing BST variant.

---

## 🔹 Building & Manipulating Balanced BSTs (`BinarySearchTreeB.java`)

### 1. **Creating a Balanced BST from Sorted Array**

Converts a sorted array to a height‑balanced BST in O(n):

```java
public static Node createBalancedBST(int[] arr, int s, int e) {
    if (s > e) return null;
    int mid = (s + e) / 2;
    Node root = new Node(arr[mid]);
    root.left  = createBalancedBST(arr, s, mid-1);
    root.right = createBalancedBST(arr, mid+1, e);
    return root;
}
```

### 2. **Converting an Unbalanced BST**

1. Perform **inorder traversal** to extract sorted values.
2. Rebuild using `createBalancedBST` (above).

```java
public static Node convertToBalancedBST(Node root) {
    ArrayList<Integer> in = new ArrayList<>();
    getInorder(root, in);                // O(n)
    int[] arr = in.stream().mapToInt(i->i).toArray();
    return createBalancedBST(arr, 0, arr.length-1);
}
```

### 3. **Largest BST in a Binary Tree**

Finds the size of the largest BST subtree within any binary tree in O(n) using post‑order info:

```java
static class Info { boolean isBST; int size, min, max; }
public static Info largestBST(Node root) {
    if (root == null)
        return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    Info L = largestBST(root.left), R = largestBST(root.right);
    int size = L.size + R.size + 1;
    int min = Math.min(root.data, Math.min(L.min, R.min));
    int max = Math.max(root.data, Math.max(L.max, R.max));
    boolean isBST = L.isBST && R.isBST && (root.data > L.max) && (root.data < R.min);
    if (isBST) maxsizeBST = Math.max(maxsizeBST, size);
    return new Info(isBST, size, min, max);
}
```

### 4. **Merging Two BSTs**

Merges by flattening both trees to sorted lists and rebuilding a balanced BST:

```java
public static Node mergeBSTs(Node b1, Node b2) {
    ArrayList<Integer> a1 = new ArrayList<>(), a2 = new ArrayList<>(), merged = new ArrayList<>();
    getInorder(b1, a1); getInorder(b2, a2);
    // merge sorted lists
    int i=0,j=0;
    while(i<a1.size()||j<a2.size()) {
        if (j==a2.size() || (i<a1.size() && a1.get(i)<a2.get(j))) merged.add(a1.get(i++));
        else merged.add(a2.get(j++));
    }
    return createBalancedBST(merged, 0, merged.size()-1);
}
```

---

## 🔹 AVL Trees: Theory & Code Snippets fileciteturn8file1

**AVL Tree** is a self‑balancing BST where for every node, the **balance factor** (height(left) – height(right)) is in {−1, 0, 1}. To maintain this, four rotation cases handle imbalance:

1. **Left‑Left (LL)**: Right rotate

```java
Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    // update heights...
    return x;
}
```

2. **Right‑Right (RR)**: Left rotate

```java
Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    // update heights...
    return y;
}
```

3. **Left‑Right (LR)**: Left rotate on left child, then right rotate on root.
4. **Right‑Left (RL)**: Right rotate on right child, then left rotate on root.

**Insertion** in an AVL Tree updates node heights, computes balance factors, and applies appropriate rotations to rebalance in O(log n).

---

## Key Takeaways

* **Balanced BSTs** (AVL or manual rebuild) guarantee O(log n) operations.
* **In‑order flatten & rebuild** is a simple strategy for static trees.
* **AVL rotations** maintain balance dynamically during insert/delete.
* Understanding both **static** (convert‑to‑balanced) and **dynamic** (AVL) approaches deepens mastery of BST variations.

---
