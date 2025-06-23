# Day 23 – Singly Linked List in Java

Today I learned about **singly linked lists**: a fundamental data structure consisting of nodes connected in sequence. I implemented operations from insertion to advanced manipulations.

---

## 🔹 Introduction to Linked List

* A **Linked List** is a linear data structure where each element (node) holds a value and a reference (pointer) to the next node.
* Unlike arrays, linked lists allow **dynamic** memory allocation and efficient insertions/deletions at arbitrary positions.

## 🔹 Head & Tail

* **Head**: reference to the first node in the list.
* **Tail**: reference to the last node.
* Maintaining both enables O(1) insertions at both ends.

---

## 🔹 Basic Operations

### 1. **Add First** (`addFirst`)

Inserts a new node at the **beginning**:

* Create new node.
* Point its `next` to current head.
* Update `head` to new node.
* If list was empty, also set `tail` to this node.

### 2. **Add Last** (`addLast`)

Appends a node at the **end**:

* Create new node.
* Point current `tail.next` to new node.
* Update `tail`.
* If list was empty, set `head` as well.

### 3. **Add in Middle** (`addMid`)

Inserts after a given index:

* Traverse to node at `idx-1`.
* Adjust pointers to include new node.
* Handles `idx=0` as `addFirst`.

### 4. **Print List** (`printList`)

Traverses from `head` to `null`, printing each node’s data.

### 5. **Size Tracking**

* A `size` variable tracks the number of nodes.
* Incremented on insertions, decremented on removals.

---

## 🔹 Removal Operations

### 6. **Remove First** (`removeFirst`)

* Remove `head` node by moving `head` to `head.next`.
* Decrement `size`.
* If list becomes empty, set `tail` to `null`.

### 7. **Remove Last** (`removeLast`)

* Traverse to node before `tail`.
* Set its `next` to `null` and update `tail`.
* Decrement `size`.

---

## 🔹 Search Operations

### 8. **Iterative Search** (`searchInteratively`)

* Traverse nodes, comparing `data` to key.
* Return index on match or `-1` if not found.

### 9. **Recursive Search** (`searchRecursively`)

* Base case: `head` is `null` or matches key.
* Recursively search in `head.next`, adding `1` to index if found.

---

## 🔹 Advanced Manipulations

### 10. **Reverse Linked List** (`reverse`)

* Iteratively reverse `next` pointers using three pointers: `prev`, `current`, `next`.
* Swap `head` and `tail` at end.

### 11. **Remove Nth Node from End** (`removeNthNodeFromEnd`)

* If removing first (`idx==size`), call `removeFirst`.
* Else traverse to node at `(size-idx-1)`, bypass next node.
* Decrement `size`.

### 12. **Check Palindrome** (`palindrome`)

* Find middle node via slow/fast pointers.
* Reverse second half of list.
* Compare nodes from `head` and from reversed mid.
* Restore list if needed (optional).

---

## Program Practiced

* [`a_LinkedList.java`](./a_LinkedList.java) – manual implementation of all above operations in one class.

---

## Key Takeaways

* Linked lists offer dynamic insert/delete capabilities.
* Maintaining `head`, `tail`, and `size` streamlines operations.
* Two-pointer techniques (slow/fast) enable efficient middle-find and palindrome checks.
* Iterative and recursive approaches complement different use cases.
