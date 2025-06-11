# Day 11 – Array Sorting Algorithms

Today, I explored various sorting algorithms and implemented them in Java. Below is a summary of the sorting techniques learned, including their core logic, time complexities, and practical considerations.

---

## Sorting Algorithms Practiced

### 1. Bubble Sort – `a_BubbleSort.java`
- **Idea**: Repeatedly swap adjacent elements if they are in the wrong order. Largest elements “bubble” to the end.
- **Time Complexity**:
  - Best: O(n) *(already sorted)*
  - Average/Worst: O(n²)
- **Stable Sort**: ✅ Yes
- **Use When**: List is small and mostly sorted

---

### 2. Selection Sort – `b_SelectionSort.java`
- **Idea**: Find the minimum element from the unsorted part and place it at the beginning.
- **Time Complexity**:
  - Best/Average/Worst: O(n²)
- **Stable Sort**: ❌ No
- **Use When**: Simplicity matters more than performance

---

### 3. Insertion Sort – `c_InsertionSort.java`
- **Idea**: Build the final sorted array one element at a time by inserting elements into their correct position.
- **Time Complexity**:
  - Best: O(n)
  - Average/Worst: O(n²)
- **Stable Sort**: ✅ Yes
- **Use When**: Data is nearly sorted or for small datasets

---

### 4. Inbuilt Java Sort – `d_InbuiltSort.java`
- **Idea**: Uses Dual-Pivot QuickSort for primitives and TimSort (hybrid of Merge + Insertion Sort) for objects.
- **Time Complexity**:
  - Generally O(n log n)
- **Use When**: You want optimized, fast, and ready-to-use sorting

---

### 5. Counting Sort – `e_CountingSort.java`
- **Idea**: Count the frequency of each element and place them in correct sorted positions based on cumulative counts.
- **Time Complexity**:
  - Best/Average/Worst: O(n + k) where `k` = range of input
- **Stable Sort**: ✅ Yes
- **Use When**:
  - Elements are **non-negative integers**
  - **Range is not significantly larger** than number of elements
- **Do Not Use When**:
  - You have large numbers with a huge range (e.g., [1, 10⁶]) as it uses extra space (O(k))
  - For floating-point, negative, or complex data types

---

## Learning Outcome
- Developed deeper understanding of how sorting affects performance.
- Learned when to use specific sorting techniques depending on input size and data characteristics.
- Realized the power of optimized inbuilt sort functions and the limitations of naive methods like bubble sort.

---

## Programs Practiced

 Filename                         | 
|----------------------------------|
| [`a_BubbleSort.java`](./a_BubbleSort.java) | 
| [`b_SelectionSort.java`](./b_SelectionSort.java)|
| [`c_InsertionSort.java`](./c_InsertionSort.java)|
| [`d_InbuiltSort.java`](./d_InbuiltSort.java)|
| [`e_CountingSort.java`](./e_CountingSort.java)|

---