# Day 31 – Binary Trees in Java

Today I explored the **Binary Tree** data structure and implemented key operations—construction, traversals, metrics, and advanced queries like diameter and subtree checking.

---

## 🔹 Building a Binary Tree from Preorder Input

* **Representation**: Use `-1` to denote `null` nodes in a preorder array.
* **Recursive `buildTree(int[] nodes)`** increments an index and:

  1. Returns `null` if value is `-1`.
  2. Otherwise, creates a `Node`, then recursively builds its `left` and `right` subtrees.

```java
static int idx = -1;
public Node buildTree(int[] nodes) {
    idx++;
    if (nodes[idx] == -1) return null;
    Node node = new Node(nodes[idx]);
    node.left  = buildTree(nodes);
    node.right = buildTree(nodes);
    return node;
}
```

---

## 🔹 Tree Traversals (O(n))

* **Preorder** (Root, Left, Right): `printPreorder(Node root)`
* **Inorder**  (Left, Root, Right): `printInorder(Node root)`
* **Postorder**(Left, Right, Root): `printPostorder(Node root)`
* **Level Order**: Uses a `Queue<Node>` with `null` markers for line breaks.

```java
// Example: Preorder
public void printPreorder(Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    printPreorder(root.left);
    printPreorder(root.right);
}
```

---

## 🔹 Basic Metrics

* **Height** (`height(Node root)`): Max depth, `O(n)` via recursion.
* **Count Nodes** (`countNode(Node root)`): Total nodes, sum of left and right counts + 1.
* **Sum of Nodes** (`sumNode(Node root)`): Sum of all `data` values, `O(n)`.

---

## 🔹 Diameter of a Tree

* **Definition**: Longest path between any two nodes.

### Approach 1 – `diameter1(Node root)` (O(n²))

* For each node, compute:`max(left diam, right diam, lh + rh + 1)` where `lh`, `rh` are heights of subtrees.

### Approach 2 – `diameter2(Node root)` (O(n))

* Returns an `Info` object containing both height and diameter in one traversal.

```java
static class Info { int diam, ht; }
public static Info diameter2(Node root) {
    if (root == null) return new Info(0, 0);
    Info li = diameter2(root.left);
    Info ri = diameter2(root.right);
    int height = Math.max(li.ht, ri.ht) + 1;
    int diam   = Math.max(Math.max(li.diam, ri.diam), li.ht + ri.ht + 1);
    return new Info(diam, height);
}
```

---

## 🔹 Subtree Check

* **Goal**: Determine if one tree is a subtree of another.
* **`isSubtree(root, subroot)`**:

  1. If `root` is `null`, return `false`.
  2. If `root.data == subroot.data` and `isIdentical(root, subroot)` is `true`, return `true`.
  3. Otherwise, recurse on `root.left` or `root.right`.

```java
public static boolean isIdentical(Node a, Node b) {
    if (a == null && b == null) return true;
    if (a == null || b == null || a.data != b.data) return false;
    return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
}
```

---

## Key Takeaways

* Binary trees support **multiple traversal orders** and level-order printing with a queue.
* Height, node count, and node-sum metrics are simple recursive functions.
* **Diameter** can be optimized from O(n²) to O(n) by combining height and diameter in one pass.
* **Subtree checking** leverages both traversal and structure comparison.

---
