# Day 25 – Advanced Linked List Techniques in Java

Today, I delved into advanced operations on linked lists, including sorting, reordering, and working with doubly and circular structures.

---

## 🔹 Merge Sort on Singly Linked List (`LinearLL.java`)

* **Goal:** Sort a linked list in **O(n log n)** time without extra array space.
* **Steps:**

  1. **Find Middle** using slow/fast pointers (`findMid`).
  2. **Split List** into two halves at mid.
  3. **Recursively Sort** each half (`mergeSort`).
  4. **Merge** sorted halves using two-pointer technique (`merge`).
* **Space:** O(log n) stack for recursion.

```java
Node mid = findMid(head);
Node rightHead = mid.next;
mid.next = null;
Node leftSorted = mergeSort(head);
Node rightSorted = mergeSort(rightHead);
return merge(leftSorted, rightSorted);
```

---

## 🔹 Zig-Zag Reordering (`LinearLL.java`)

* **Goal:** Rearrange nodes in alternating order from start and end (L0 → Ln → L1 → Ln-1 → ...).
* **Algorithm:**

  1. **Find Mid** of the list.
  2. **Reverse** second half of the list.
  3. **Alternate Merge** nodes from first and reversed second half.
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

```java
// find mid
Node slow = head;
Node fast = head;
while(fast!=null && fast.next!=null){
    slow = slow.next;
    fast = fast.next.next;
}
Node mid = slow;

//reverse 2nd half
Node curr = mid.next;
mid.next = null;
Node prev = null;
Node next;

while(curr != null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}

Node left = head;
Node right = prev;
Node nextL, nextR;

//alt merge 
while(left != null && right != null) {
    nextL = left.next;
    left.next = right;
    nextR = right.next;
    right.next = nextL;

    left = nextL;
    right = nextR;
}
```

---

## 🔹 Doubly Linked List (`DoublyLL.java`)

* **Structure:** Each node has `prev` and `next` pointers and `data`.
* **Key Operations:**

  * **Add First/Last:** Adjust both `head`/`tail` and neighbors’ pointers.
  * **Remove First/Last:** Update `head` or `tail`, set neighbor pointers to `null`.
  * **Reverse:** Swap `next` and `prev` pointers for each node, then swap `head` and `tail`.
* **Usage:** Bi‑directional traversal and O(1) insert/delete at both ends.

```java
while (curr != null) {
  next = curr.next;
  curr.next = prev;
  curr.prev = next;
  prev = curr;
  curr = next;
}
head = prev;
```

---

## 🔹 Circular Linked List (Theory)

* **Definition:** A linked list where `tail.next` points back to `head`, forming a cycle by design.
* **Use Cases:** Buffer management, round‑robin scheduling, game development for continuous play.
* **Key Considerations:** Always maintain a reference to head; careful on traversal to avoid infinite loops by stopping after `n` steps or detecting when `current.next == head`.

---

## Key Takeaways

* **Merge Sort on LL:** Leverages slow/fast pointers and in-place merging for efficient sorting.
* **Zig-Zag Reordering:** Combines splitting, reversing, and alternating merges for pattern transformation.
* **Doubly LL:** Enables two-way traversal and efficient end operations with minimal pointer adjustments.
* **Circular LL:** Conceptual variation for cyclic data structures requiring careful loop control.

---

## Programs Practiced

| Filename             | Description                                       |
| -------------------- | ------------------------------------------------- |
| [`LinearLL.java`](./LinearLL.java)    | Manual linked list with Merge Sort and Zig-Zag Sort |
| [`DoublyLL.java`](./DoublyLL.java) | Manual Doubly Linked List    |

---
