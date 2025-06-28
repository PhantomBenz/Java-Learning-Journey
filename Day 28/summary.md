# Day 28 – Queues in Java

Today, I implemented various **Queue** data structures and variations, understanding their FIFO behavior and practical applications.

---

## 🔹 What Is a Queue?

* A **Queue** is a First-In-First-Out (FIFO) data structure.
* **Main operations**:

  * `enqueue(item)`: add to rear
  * `dequeue()`: remove from front
  * `peek()`: view front element
  * `isEmpty()`: check emptiness

---

## 🔸 1. Linear Queue Using Array (`LinearQueueArray.java`)

* **Structure**: Fixed-size array with `front` and `rear` indices.
* **Enqueue**: Insert at `rear++` if not full.
* **Dequeue**: Remove at `front++` if not empty.
* **Limitation**: Wastes space after multiple dequeues as front moves forward.
* **Time Complexity**: O(1) for enqueue/dequeue.

---

## 🔸 2. Circular Queue Using Array (`CircularQueueArray.java`)

* **Enhancement**: Treat array as circular by using modulo arithmetic.
* **Indices**: `rear = (rear + 1) % capacity`, `front = (front + 1) % capacity`.
* **Advantage**: Reuses array slots, avoids wasted space.
* **Space Complexity**: O(n) array size.

---

## 🔸 3. Queue Using Linked List (`LinearQueueLL.java`)

* **Structure**: Singly linked list with `head` as front and `tail` as rear.
* **Enqueue**: Insert at tail → O(1).
* **Dequeue**: Remove head → O(1).
* **Space Complexity**: O(n) nodes.

---

## 🔹 Java Collections Framework Queue (`QueueJCF.java`)

* **Interface**: `Queue<E>` in JCF, implementations include `LinkedList` and `PriorityQueue`.
* **Example**:

  ```java
  Queue<Integer> q = new LinkedList<>();
  // Queue<Integer> q = new ArrayDeque<>();
  q.add(1);   // enqueue
  q.remove();     // dequeue
  q.peek();     // view front
  ```
* **Benefit**: Ready-made, flexible, and supports generics.

---

## 🔸 5. Queue via Two Stacks (`QueueUsing2Stack.java`)

* **Concept**: Implement FIFO using two LIFO stacks (`inStack`, `outStack`).
* **Enqueue**: Push to `inStack`.
* **Dequeue**: If `outStack` is empty, transfer all elements from `inStack` to `outStack`, then pop.
* **Amortized Complexity**: O(1) per operation.

---

## 🔹 6. Stack via Two Queues (`StackUsing2Queue.java`)

* **Concept**: Implement LIFO using two FIFO queues (`q1`, `q2`).
* **Push**: Enqueue to `q2`, then move all elements from `q1` to `q2`, swap `q1` and `q2`.
* **Pop**: Dequeue from `q1` → most recent element.
* **Time Complexity**: O(n) for push, O(1) for pop.

---

## Programs Practiced

| Filename                  | Description                              |
| ------------------------- | ---------------------------------------- |
| [`LinearQueueArray.java`](./LinearQueueArray.java)   | Fixed-size array-based queue             |
| [`CircularQueueArray.java`](./CircularQueueArray.java) | Circular buffer implementation           |
| [`LinearQueueLL.java`](./LinearQueueLL.java)      | Linked list-based queue                  |
| [`QueueJCF.java`](./QueueJCF.java)           | JCF `Queue` interface using `LinkedList` |
| [`QueueUsing2Stack.java`](./QueueUsing2Stack.java)   | FIFO queue using two stacks              |
| [`StackUsing2Queue.java`](./StackUsing2Queue.java)   | LIFO stack using two queues              |

---

## Key Takeaways

* **Queue implementations** vary by use-case: arrays for simplicity, linked lists for dynamic size.
* **Circular queues** solve space inefficiencies of linear arrays.
* **Ad-hoc implementations** via two stacks/queues illustrate how core structures can simulate each other.
* Understanding trade-offs in **time** and **space complexity** guides data structure choice.

---
