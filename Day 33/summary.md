# Day 33 – Binary Search Tree (BST) in Java

Today I delved into the **Binary Search Tree** (BST) data structure, implementing core operations and advanced queries using the provided `BinarySearchTree.java`.

---

## 🔹 What Is a Binary Search Tree?

* A **BST** is a binary tree where for each node:

  * All values in the **left subtree** are **< node.data**
  * All values in the **right subtree** are **> node.data**
* This property enables **efficient** search, insert, and delete in **O(h)** time (where *h* is tree height).

---

## 🔹 Insertion (`insert`)

Recursively places a new value in its proper location:

```java
public static Node insert(Node root, int val) {
    if (root == null) {
        // Empty spot found
        return new Node(val);
    }
    if (root.data > val) {
        root.left = insert(root.left, val);
    } else {
        root.right = insert(root.right, val);
    }
    return root;
}
```

* **Base case**: `root == null` → create a new `Node(val)`.
* **Recursive step**: traverse left or right depending on comparison.

---

## 🔹 Inorder Traversal (`inorder`)

Prints BST in **sorted** order:

```java
public static void inorder(Node root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

* Visits left subtree, node, then right subtree.

---

## 🔹 Search (`searchKey`)

Checks if a value exists in the BST:

```java
public static boolean searchKey(Node root, int k) {
    if (root == null) return false;
    if (root.data == k) return true;
    else if (root.data > k)
        return searchKey(root.left, k);
    else
        return searchKey(root.right, k);
}
```

* **Recursive binary search** leveraging BST ordering.

---

## 🔹 Deletion (`deleteNode`)

Removes a node with a given value, handling three cases:

```java
public static Node deleteNode(Node root, int data) {
    if (root == null) return null;
    if (root.data > data) {
        root.left = deleteNode(root.left, data);
    } else if (root.data < data) {
        root.right = deleteNode(root.right, data);
    } else {
        // Case 1: No children
        if (root.left == null && root.right == null) return null;
        // Case 2: One child
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;
        // Case 3: Two children → replace with inorder successor
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = deleteNode(root.right, IS.data);
    }
    return root;
}
```

* **Inorder Successor** found by:

```java
public static Node findInorderSuccessor(Node root) {
    while (root.left != null) root = root.left;
    return root;
}
```

---

## 🔹 Range Print (`printInRange`)

Prints all node values within `[min, max]` in sorted order:

```java
public static void printInRage(Node root, int min, int max) {
    if (root == null) return;
    if (root.data >= min && root.data <= max) {
        printInRage(root.left, min, max);
        System.out.print(root.data + " ");
        printInRage(root.right, min, max);
    } else if (root.data < min) {
        printInRage(root.right, min, max);
    } else {
        printInRage(root.left, min, max);
    }
}
```

* **Prunes** branches that cannot contain valid values.

---

## 🔹 Root-to-Leaf Paths (`printRoot2Leaf`)

Prints all paths from root down to each leaf:

```java
public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
    if (root == null) return;
    path.add(root.data);
    if (root.left == null && root.right == null) {
        printPath(path);
    }
    printRoot2Leaf(root.left, path);
    printRoot2Leaf(root.right, path);
    path.remove(path.size()-1);
}

public static void printPath(ArrayList<Integer> path) {
    for (int v : path) System.out.print(v + " -> ");
    System.out.println("Null");
}
```

* Uses backtracking to build and remove path elements.

---

## 🔹 Validation (`isValidBST`)

Ensures tree satisfies BST properties via **min/max bounds**:

```java
public static boolean isValidBST(Node root, Node min, Node max) {
    if (root == null) return true;
    if (min != null && root.data <= min.data) return false;
    if (max != null && root.data >= max.data) return false;
    return isValidBST(root.left, min, root)
        && isValidBST(root.right, root, max);
}
```

* **Bounds** propagate down the tree to enforce global ordering.

---

## 🔹 Mirror (`mirror`)

Generates the **mirror image** of the BST by swapping subtrees:

```java
public static Node mirror(Node root) {
    if (root == null) return null;
    Node leftMirror = mirror(root.left);
    Node rightMirror = mirror(root.right);
    root.left = rightMirror;
    root.right = leftMirror;
    return root;
}
```

* **Recursively** swaps left and right children.

---

## Key Takeaways

* **BST** operations combine recursion and the tree’s inherent ordering for efficiency.
* **Deletion** requires careful handling of child cases and inorder successor.
* **Range queries** and **validation** leverage BST pruning to avoid unnecessary visits.
* **Mirror** and **path printing** illustrate versatile tree traversals.

---
[`Program Practiced`](./BinarySearchTree.java)