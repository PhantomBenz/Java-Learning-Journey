# Day 29 – Queues, Deques & Related Problems in Java

Today, I tackled advanced queue-based problems and learned about the **Deque** interface—a powerful double-ended queue allowing insertion/removal at both ends.

---

## 🔹 The Deque Interface

* **Definition**: `Deque<E>` extends `Queue<E>`, supporting insertion, removal, and inspection at **both** head and tail.
* **Implementations**: Commonly `LinkedList` or `ArrayDeque`.
* **Key Methods**:

  ```java
  deque.addFirst(e);     // insert at front
  deque.addLast(e);      // insert at end
  deque.removeFirst();   // remove from front
  deque.removeLast();    // remove from end
  deque.peekFirst();     // view front
  deque.peekLast();      // view end
  ```
* **Use Cases**: Implementing stacks, queues, sliding-window algorithms, and palindrome checks.

---

## 🔹 DequeB Operations (`DequeB.java`)

```java
public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
```

---

## 🔹 Problem 1: First Non-Repeating Character in a Stream

```java
public static void nonRepeating(String str) {
    int freq[] = new int[26],n;
    Queue<Character> q = new LinkedList<>();
    for(int i = 0; i < str.length(); i++) {
        q.add(str.charAt(i));
        n = str.charAt(i) - 'a';
        freq[n]++;
        while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
            q.remove();
        }
        System.out.print(q.peek() + " ");
    }
    System.out.println();
}
```

---

## 🔹 Problem 2: Interleave Two Halves of a Queue

```java
public static void interleave(Queue<Integer> q) {
    Queue<Integer> qf = new LinkedList<>();
    int n = (q.size())/2;
    for(int i = 0; i < n; i++) {
        qf.add(q.remove());
    }
    while (!qf.isEmpty()) {
        q.add(qf.remove());
        q.add(q.remove());
    }
}
```

---

## 🔹 Problem 3: Reverse a Queue

```java
public static void reverse(Queue<Integer> q1) {
    Stack<Integer> s = new Stack<>();
    while(!q1.isEmpty()) {
        s.push(q1.remove());
    }
    while(!s.isEmpty()) {
        q1.add(s.pop());
    }
}
```

---

## 🔹 Problem 4: Queue & Stack via Deque 

* **StackD**: Uses `Deque` to implement LIFO: `push`→`addFirst`, `pop`→`removeFirst`, `peek`→`peekFirst`.

```java
static class StackD {
    Deque<Integer> deque = new LinkedList<>();
    public boolean isEmpty() {
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }
    public void push(int data) {
        deque.addFirst(data);
    }
    public void pop() {
        deque.removeFirst();
    }
    public int peek() {
        return deque.peekFirst();
    }
}
```

* **QueueD**: Uses `Deque` for FIFO: `add`→`addFirst`, `remove`→`removeLast`, `peek`→`peekLast`.

```java
static class QueueD {
    Deque<Integer> deque = new LinkedList<>();
    public boolean isEmpty() {
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(int data) {
        deque.addFirst(data);
    }
    public void remove() {
        deque.removeLast();
    }
    public int peek() {
        return deque.peekLast();
    }
}
```

* **Advantage**: Simple, efficient O(1) operations at both ends.

---

## Programs Practiced

| Filename        | Description                                                                     |
| --------------- | ------------------------------------------------------------------------------- |
| [`DequeB.java`](./DequeB.java)   | Demo of `Deque` operations (add/remove at both ends)                            |
| [`Problems.java`](./Problems.java) | First non-repeating in stream, interleave, reverse queue, stack/queue via deque |

---

## Key Takeaways

* **Deque** is a versatile interface combining stack and queue functionality in O(1) time for both ends.
* Advanced queue problems often leverage auxiliary data structures (stacks or deques) for efficient solutions.
* Understanding both **Queue** and **Deque** deepens mastery of linear data structures and their trade-offs.

---
