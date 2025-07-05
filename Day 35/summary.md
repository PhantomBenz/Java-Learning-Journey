# Day 35 – Heaps & Priority Queues in Java

Today I learned about **Heaps** (binary heap implementation) and Java’s **PriorityQueue** (min/max heaps via JCF), practicing both manual and built‑in versions.

---

## 🔹 Binary Heap Implementation [`HeapA.java`](./HeapA.java)

A **binary heap** is a complete binary tree satisfying the **heap property**: each parent node is **≤** its children for a min‑heap (or ≥ for max‑heap).

### 1. **MinHeap Class**

```java
static class MinHeap {
    ArrayList<Integer> arr = new ArrayList<>();

    private void heapify(int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int minIdx = i;
        if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
            minIdx = left;
        }
        if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
            minIdx = right;
        }
        if (minIdx != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);
            heapify(minIdx);
        }
    }

    public void add(int data) {
        arr.add(data);
        int idx = arr.size() - 1;
        int parent = (idx - 1) / 2;
        while (idx > 0 && arr.get(idx) < arr.get(parent)) {
            int tmp = arr.get(idx);
            arr.set(idx, arr.get(parent));
            arr.set(parent, tmp);
            idx = parent;
            parent = (idx - 1) / 2;
        }
    }

    public int peek() { return arr.get(0); }

    public int remove() {
        int data = arr.get(0);
        int last = arr.size() - 1;
        arr.set(0, arr.get(last));
        arr.remove(last);
        heapify(0);
        return data;
    }

    public boolean isEmpty() { return arr.isEmpty(); }
}
```

**Key Operations**:

* `add`: O(log n) per insertion.
* `peek`: O(1) access to root.
* `remove`: O(log n) to reheapify after removing root.

### 2. **Heap Sort (Descending)**

Transforms an array into a heap, then extracts elements:

```java
public static void heapify(int[] arr, int i, int size) { /* similar to above */ }
public static void heapSort(int[] arr) {
    int n = arr.length;
    for (int i = n/2; i >= 0; i--) heapify(arr, i, n);
    for (int i = n-1; i > 0; i--) {
        int tmp = arr[0]; arr[0] = arr[i]; arr[i] = tmp;
        heapify(arr, 0, i);
    }
}
```

---

## 🔹 Java PriorityQueue [`PriorityQueueA.java`](./PriorityQueueA.java)

Java’s `PriorityQueue<E>` is a min‑heap by default, offering O(log n) insertion/removal and O(1) peek.

### 1. **Basic Usage**

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(3); pq.add(4); pq.add(1); pq.add(7);
while (!pq.isEmpty()) {
    System.out.print(pq.peek() + " "); // O(1)
    pq.remove();                        // O(log n)
}
```

### 2. **Max‑Heap via Comparator**

```java
PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
pqr.add(3); pqr.add(4); pqr.add(1); pqr.add(7);
// Now peek returns the largest element.
```

### 3. **Custom Objects**

Implement `Comparable` in classes:

```java
static class Student implements Comparable<Student> {
    String name; int rank;
    public int compareTo(Student s2) { return this.rank - s2.rank; }
}
// Use pq of Students to sort by rank.
```

### 4. **Typical Problems**

* **Nearby Cars**: Use `Point implements Comparable<Point>` by distance squared to extract k nearest.
* **Connect Ropes**: Merge smallest ropes first via PQ for minimal cost.
* **Weakest Rows**: Custom `Row` comparator to find k weakest rows in a matrix.
* **Sliding Window Maximum**: Use `PriorityQueue<Win>` with reverse order, removing outdated indices.

---

## Key Takeaways

* **Heaps** support efficient priority operations and underlie `PriorityQueue`.
* **Manual heap** reinforces understanding of percolate‑up/down mechanics.
* **PriorityQueue** flexibility via comparators/`Comparable` covers numerous real problems.
* Balancing performance: built‑in PQ vs custom heap for specialized needs.

---
