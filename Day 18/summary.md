# Day 18 – Divide & Conquer Algorithms in Java

Today I explored **divide-and-conquer** techniques—powerful strategies that split a problem into subproblems, solve each recursively, and combine results.

---

## What Is Divide and Conquer?
A paradigm that:
1. **Divide** the problem into smaller subproblems.  
2. **Conquer** each subproblem by solving it (often recursively).  
3. **Combine** the subproblem solutions into the final answer.  
   
This approach yields algorithms like Merge Sort and Quick Sort with excellent performance on large datasets.

---

## Merge Sort (`a_MergeSort.java`)
- **Idea**:  
  - Split the array in half until each subarray has one element.  
  - Merge subarrays in sorted order.  
- **Time Complexity**: O(n log n) in all cases.  
- **Space Complexity**:  
  - **Basic**: O(n) extra for temporary arrays.  
  - **Space-Optimized**: Reuses one auxiliary array to limit overhead to O(n) total.  
- **When to Use**: Stable sort; predictable performance on any input.

---

## Quick Sort (`b_QuickSort.java`)
- **Idea**:  
  - Choose a “pivot” element.  
  - Partition the array so that all elements < pivot come before it, ≥ pivot after.  
  - Recursively sort partitions.  
- **Average Time Complexity**: O(n log n)  
- **Worst-Case Complexity**: O(n²) (when pivot is always min/max, e.g., already sorted data)  
- **Space Complexity**: O(log n) recursive stack on average.  
- **Optimizations**:  
  - Randomized pivot selection to avoid worst-case on sorted inputs.  
  - Tail recursion elimination to reduce stack depth.

---

## Search in Sorted & Rotated Array (`c_SearchInRotatedSortedArray.java`)
- **Problem**: Given an array sorted in ascending order but rotated at an unknown pivot, find a target element in O(log n) time.  
- **Idea**:  
  1. Perform a modified binary search by comparing middle element to boundaries.  
  2. Determine which half is properly sorted.  
  3. Recurse into the half that must contain the target.  
- **Time Complexity**: O(log n)  

---

## Programs Practiced

| Filename                              | Description                                                         |
|---------------------------------------|---------------------------------------------------------------------|
| [`a_MergeSort.java`](./a_MergeSort.java)                    | Standard and space‑optimized implementations of Merge Sort         |
| [`b_QuickSort.java`](./b_QuickSort.java)                    | Quick Sort with partitioning logic and discussion of worst case    |
| [`c_SearchInRotatedSortedArray.java`](./c_SearchInRotatedSortedArray.java)   | Modified binary search to handle sorted & rotated arrays           |

---

## Key Takeaways
- **Divide & conquer** breaks problems into manageable pieces with strong performance guarantees.  
- **Merge Sort** is stable and predictable but uses extra space.  
- **Quick Sort** is in‑place and often faster in practice but needs pivot selection care to avoid O(n²).  
- Searching in a **rotated sorted array** leverages binary search logic with minor modifications.

---
