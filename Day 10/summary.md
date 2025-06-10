# Day 10 – Arrays Advanced Problems & Optimization

## Topics Covered:
Today I focused on solving **advanced problems using arrays** and practiced optimizing solutions by reducing time complexity.

---

## Key Concepts & Problems Solved:

### Array Reversal
- Reversed the elements of an array.
- Used a two-pointer technique for in-place reversal.

### Pairs in Array
- Printed all possible pairs of elements in an array.
- Time Complexity: O(n²)

### Print Subarrays
- Printed all possible contiguous subarrays.
- Helped understand range-based iterations and boundaries.

### Max Subarray Sum (Brute Force)
- Calculated maximum sum of any subarray.
- Used triple nested loop:  
  **Time Complexity:** O(n³)

### Max Subarray Sum (Optimized)
- Reduced loops to two using prefix sums or partial accumulations.  
  **Time Complexity:** O(n²)

### Kadane’s Algorithm
- Most efficient solution for max subarray sum.  
  **Time Complexity:** O(n)  
  - Maintains a running sum and resets when sum drops below zero.

### Trapping Rainwater
- Solved the classic problem of finding trapped water between bars.
- Calculated leftMax and rightMax arrays for efficient computation.  
  **Time Complexity:** O(n)

### Buy and Sell Stocks
- Solved for max profit from buying and selling once.
- Tracked min price while iterating for max profit potential.  
  **Time Complexity:** O(n)

---

## Programs Practiced:

| Filename                         | Description                                       |
|----------------------------------|---------------------------------------------------|
| [`a_ReverseArray.java`](./a_ReverseArray.java)            | Reversed elements in an array                    |
| [`b_PairsInArrays.java`](./b_PairsInArray.java)          | Printed all possible pairs                       |
| [`c_PrintSubarrays.java`](./c_PrintSubarrays.java)          | Printed all subarrays                            |
| [`d_MaxSubarraySum.java`](./d_MaxSubarraySum.java)          | Brute force subarray sum (O(n³))                 |
| [`e_MaxSubarraySumOptimized.java`](./e_MaxSubarraySumOptimized.java) | Optimized subarray sum (O(n²))                   |
| [`f_Kandane'sAlgorithm.java`](./f_KadanesAlgorithm.java)      | Used Kadane’s Algorithm (O(n))                   |
| [`g_TrappingRainwater.java`](./g_TrappingRainwater.java)       | Solved trapping rainwater problem                |
| [`h_BuyAndSellStocks.java`](./h_BuyAndSellStocks.java)        | Solved max profit from single buy/sell stock     |

---

## Learnings
- Importance of optimizing brute force solutions.
- Improved understanding of problem-solving with arrays.
- Real-world problem patterns like Kadane’s and Trapping Rainwater.

---
