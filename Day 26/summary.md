# Day 26 – Stacks in Java

Today, I implemented and practiced **stack** data structures using:
- **ArrayList** (`StackAL.java`)
- **LinkedList** (`StackLL.java`)
- **Built-in** `java.util.Stack` (`StackBuiltin.java`)

I also tackled classic stack problems: pushing at the bottom, reversing a stack/string, and the Stock Span problem.

---

## 🔹 Stack Overview
A **stack** is a Last-In-First-Out (LIFO) data structure supporting:
- `push(item)`: add to top  
- `pop()`: remove from top  
- `peek()`: view top element  
- `isEmpty()`: check emptiness  

---

## 🔹 Implementations

### 1. ArrayList-Based Stack (`StackAL.java`)
- Uses an `ArrayList<Integer>` as the backing store.
- `push`: `list.add(data)` → O(1) amortized  
- `pop`: remove last element → O(1)  
- `peek`: get last element → O(1)  

### 2. LinkedList-Based Stack (`StackLL.java`)
- Uses a singly linked list where the head is the top of the stack.
- `push`: insert node at head → O(1)  
- `pop`: remove head node → O(1)  
- `peek`: return head data → O(1)  

### 3. Built-In Stack (`StackBuiltin.java`)
- Leverages Java’s `Stack<E>` class (extends `Vector<E>`)  
- `push`, `pop`, `peek` provided out-of-the-box  

---

## 🔹 Advanced Stack Problems (`StackB.java`)

### Push at Bottom
- Recursively pop all elements, insert new bottom element, then re-push popped items.

### Reverse a Stack
- Uses `pushAtBottom` recursively to reverse element order without extra data structures.

### Reverse a String using Stack
- Push each character, then pop to build reversed string; demonstrates stack for character processing.

### Stock Span Problem
- For each day’s stock price, compute the number of consecutive prior days with price ≤ today’s price.
- Uses a stack of indices to achieve O(n) time:
  - Pop indices with lower prices.
  - Span = current index – top of stack (or current index + 1 if empty).
  - Push current index.

---

## Programs Practiced

| Filename               | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| [`StackAL.java`](./StackAL.java)         | ArrayList-backed stack implementation                                        |
| [`StackLL.java`](./StackLL.java)         | LinkedList-backed stack implementation                                        |
| [`StackBuiltin.java`](./StackBuiltin.java)    | Using Java’s `Stack` class                                                   |
| [`StackB.java`](./StackB.java)          | Advanced problems: push at bottom, reverse stack/string, Stock Span problem  |

---

## Key Takeaways
- Multiple ways to implement stacks—choose based on requirements and underlying data structures.
- Recursive techniques can manipulate stacks (e.g., reverse, push at bottom) without extra collections.
- The Stock Span problem showcases stacks for solving “previous greater element” patterns efficiently.

