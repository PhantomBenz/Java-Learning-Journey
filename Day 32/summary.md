# Day 32 – Advanced Binary Tree Operations in Java

Today I practiced several advanced queries on binary trees, including top view, level filtering, lowest common ancestor, distance between nodes, k<sup>th</sup> ancestor, and tree-to-sum transformation.

---

## 🔹 Top View of Binary Tree (`topView`)

Displays nodes visible when the tree is viewed from above, one per horizontal distance (hd).

```java
public static void topView(Node root) {
    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();

    int min = 0, max = 0;
    q.add(new Info(root, 0));
    q.add(null);

    while (!q.isEmpty()) {
        Info curr = q.remove();
        if (curr == null) {
            if (q.isEmpty()) break;
            q.add(null);
        } else {
            if (!map.containsKey(curr.hd))
                map.put(curr.hd, curr.node);
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }
    }
    for (int i = min; i <= max; i++)
        System.out.print(map.get(i).data + " ");
    System.out.println();
}
```

**Key Points**:

* `Info` pairs a node with its horizontal distance.
* `HashMap` ensures the first encountered node at each hd is recorded.

---

## 🔹 Print k<sup>th</sup> Level Nodes (`kLevel`)

Traverse the tree and print nodes whose depth equals `k`.

```java
public static void kLevel(Node root, int level, int k) {
    if (root == null) return;
    if (level == k)
        System.out.print(root.data + " ");
    kLevel(root.left, level + 1, k);
    kLevel(root.right, level + 1, k);
}
```

**Usage**: Called with `level=1` for root and desired `k`.

---

## 🔹 Lowest Common Ancestor

### Approach 1: Path Comparison (`lowestCommonAnsestor1`)

Uses root-to-node paths for both targets and compares.

```java
public static Node lowestCommonAnsestor1(Node root, int d1, int d2) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();
    getPath(path1, root, d1);
    getPath(path2, root, d2);
    int i = 0;
    while (i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i))
        i++;
    return path1.get(i - 1);
}
```

### Approach 2: Single Traversal (`lowestCommonAnsestor2`)

Recursive division to find LCA in one pass.

```java
public static Node lowestCommonAnsestor2(Node root, int d1, int d2) {
    if (root == null || root.data == d1 || root.data == d2) return root;
    Node left = lowestCommonAnsestor2(root.left, d1, d2);
    Node right = lowestCommonAnsestor2(root.right, d1, d2);
    if (left == null) return right;
    if (right == null) return left;
    return root;
}
```

**Time Complexity**: O(n)

---

## 🔹 Distance Between Two Nodes (`distanceBtnNodes`)

Compute distance by finding LCA then summing depths from LCA to each node.

```java
public static int distance(Node root, int d) {
    if (root == null) return -1;
    if (root.data == d) return 0;
    int left = distance(root.left, d);
    int right = distance(root.right, d);
    if (left == -1) return right < 0 ? -1 : right + 1;
    return left + 1;
}

public static int distanceBtnNodes(Node root, int d1, int d2) {
    Node lca = lowestCommonAnsestor2(root, d1, d2);
    return distance(lca, d1) + distance(lca, d2);
}
```

---

## 🔹 k<sup>th</sup> Ancestor of a Node (`kthAncestor`)

Return k<sup>th</sup> ancestor by tracking depth via recursion.

```java
public static int kthAncestor(Node root, int d, int k) {
    if (root == null) return -1;
    if (root.data == d) return 0;
    int left = kthAncestor(root.left, d, k);
    int right = kthAncestor(root.right, d, k);
    if (left == -1 && right == -1) return -1;
    int dist = Math.max(left, right) + 1;
    if (dist == k) System.out.println(root.data);
    return dist;
}
```

---

## 🔹 Transform to Sum Tree (`sumTree`)

Convert each node’s value to the sum of values in its left and right subtrees.

```java
public static int sumTree(Node root) {
    if (root == null) return 0;
    int oldVal = root.data;
    root.data = sumTree(root.left) + sumTree(root.right);
    return oldVal + root.data;
}
```

**After Transformation**: Each node stores sum of its original left & right subtree values.

---

## 🔹 Preorder of Transformed Tree

Print to verify sum tree structure:

```java
public static void preorder(Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```
---
[`Program Practiced`](./BinaryTreeC.java)
