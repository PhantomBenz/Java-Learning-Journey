
# Day 20 – Time and Space Complexity Analysis in Java

Today, I revisited essential **time and space complexity** concepts and analyzed how they apply to real-world programs and algorithms in Java. Understanding these complexities helps in writing efficient and scalable code.

---

## 🔹 Time and Space Complexity Refresher

* **Time Complexity**: Describes the amount of time an algorithm takes as input size grows. Measured using Big O notation.
* **Space Complexity**: Represents the memory required by an algorithm to complete its execution.

---

## 🔸 1. Nested Loop Analysis

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        // constant operation
    }
}
```

* **Time Complexity**: O(n \* m)
* **Space Complexity**: O(1) (no extra space used)
* **Explanation**: The outer loop runs `n` times, and for each outer iteration, the inner loop runs `m` times. This creates a total of `n × m` operations.

---

## 🔸 2. Bubble Sort

```java
for (int i = 0; i < n-1; i++) {
    for (int j = 0; j < n-1-i; j++) {
        if (arr[j] > arr[j+1]) {
            // swap
        }
    }
}
```

* **Best Case (sorted)**: O(n)
* **Average/Worst Case**: O(n²)
* **Space Complexity**: O(1)
* **Explanation**: Compares adjacent elements and swaps them. Time increases quadratically as `n` grows unless the array is already sorted and optimized with a flag.

---

## 🔸 3. Binary Search

```java
int binarySearch(int[] arr, int key) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == key) return mid;
        else if (arr[mid] < key) start = mid + 1;
        else end = mid - 1;
    }
    return -1;
}
```

* **Time Complexity**: O(log₂ n)
* **Space Complexity**: O(1)
* **Explanation**: Each iteration halves the search space. Efficient for sorted arrays.

---

## 🔸 4. Factorial (Recursive)

```java
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

* **Time Complexity**: O(n)
* **Space Complexity**: O(n) – due to recursive call stack
* **Explanation**: Each function call waits for the next, stacking up until base case is hit.

---

## 🔸 5. Sum of N Natural Numbers (Recursive)

```java
int sum(int n) {
    if (n == 1) return 1;
    return n + sum(n - 1);
}
```

* **Time Complexity**: O(n)
* **Space Complexity**: O(n)
* **Explanation**: Recursive call stack grows linearly with input `n`.

---

## 🔸 6. Fibonacci (Naive Recursion)

```java
int fib(int n) {
    if (n == 0 || n == 1) return n;
    return fib(n - 1) + fib(n - 2);
}
```

* **Time Complexity**: O(2ⁿ)
* **Space Complexity**: O(n)
* **Explanation**: Multiple overlapping subproblems are re-evaluated, causing exponential growth in calls. Not efficient for large `n`.

✅ **Optimized Approaches**: Use **Memoization (O(n))** or **Bottom-Up DP** to bring time complexity down.

---

## 🔸 7. Merge Sort

```java
void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
}
```

* **Time Complexity**: O(n log n)
* **Space Complexity**: O(n) – for merging phase
* **Explanation**: Divides array into halves until size 1, then merges. Ideal for large datasets due to guaranteed logarithmic splitting.

---
