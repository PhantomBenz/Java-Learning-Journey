# Day 17: Introduction to Recursion in Java

Today, I dived deep into **Recursion**—a fundamental programming technique where a function calls itself to solve smaller subproblems of a larger problem. It allows elegant solutions to complex problems, especially those involving divide and conquer.

---

## What is Recursion?
Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem. Each recursive function should have:
- **Base case**: condition to stop recursion.
- **Recursive case**: function calls itself with smaller input.

---

### Concepts Covered & Programs Practiced:

#### 1. Print Numbers in Decreasing Order
- Prints `n` to `1` using recursive calls.
- `b_DecreasingOrder.java`

#### 2. Stack Overflow
- Demonstrated what happens if a recursive function doesn't reach a base case (infinite recursion).

#### 3. Print Numbers in Increasing Order
- Prints `1` to `n` using recursion.
- `c_IncreasingOrder.java`

#### 4. Find Factorial
- Classic recursive example.
- `a_Factorial.java`

#### 5. Print Sum of N Natural Numbers
- Computes sum from `1` to `n` recursively.
- `d_SumOfNaturalNo.java`

#### 6. Fibonacci Series
- Recursively print Fibonacci numbers up to `n`.
- Exponential time complexity (can be optimized).
- `e_Fibonacci.java`

#### 7. Check if Array is Sorted
- Recursively checks if elements follow ascending order.
- `f_CheckArraySorted.java`

#### 8. First Occurrence of an Element
- Finds first position of a key in an array recursively.
- `g_FirstOccurance.java`

#### 9. Last Occurrence of an Element
- Recursively searches for last index of a key.
- `h_LastOccurance.java`

#### 10. Print x^n (O(n))
- Simple recursive exponentiation.
- `i_XPowerN.java`

#### 11. Print x^n (Optimized, O(logn))
- Uses divide-and-conquer:  
  If n is even: xⁿ = (x^(n/2))²  
  If n is odd: xⁿ = x * (x^(n/2))²
- `j_XPowerNOptimized.java`

#### 12. Tiling Problem
- Given a 2 x n floor and tiles of 2 x 1, count the number of ways to tile the floor.
- Subproblem: f(n) = f(n-1) + f(n-2)
- `k_TilingProblem.java`

#### 13. Remove Duplicates in a String
- Uses recursion and a boolean array to track visited characters.
- `l_RemoveDuplicateInString.java`

#### 14. Friends Pairing Problem
- Count the number of ways `n` friends can remain single or pair up.
- Recurrence: f(n) = f(n-1) + (n-1) * f(n-2)
- `m_FriendsPairing.java`

#### 15. Binary Strings Without Consecutive 1's
- Recursively prints all binary strings of length `n` without two consecutive 1s.
- Uses lastPlaced logic (0 or 1).
- `n_BinarySting.java`

---

## Summary

Recursion is a powerful but tricky tool. Today's problems helped me solidify key recursion patterns like:
- Base vs recursive case
- Recursion tree analysis
- Time complexity trade-offs

Understanding recursion is critical for:
- Dynamic Programming
- Backtracking
- Divide & Conquer

---

**Programs Practiced:**
| Filename                   |
| -------------------------- |
| [`a_Factorial.java`](./a_Factorial.java)               |
| [`b_DecreasingOrder.java`](./b_DecreasingOrder.java)    | 
| [`c_IncreasingOrder.java`](./c_IncreasingOrder.java)  | 
| [`d_SumOfNaturalNo.java`](./d_SumOfNaturalNo.java)       | 
| [`e_Fibonacci.java`](./e_Fibonacci.java)       |
| [`f_CheckArraySorted.java`](./f_CheckArraySorted.java) |
| [`g_FirstOccurance.java`](./g_FirstOccurance.java)  |
| [`h_LastOccurance.java`](./h_LastOccurance.java)     |
| [`i_XPowerN.java`](./i_XPowerN.java)        |
| [`j_XPowerNOptimized.java`](./j_XPowerNOptimized.java) |
| [`k_TilingProblem.java`](./k_TilingProblem.java)  |
| [`l_RemoveDuplicateInString.java`](./l_RemoveDuplicateInString.java)     |
| [`m_FriendsPairing.java`](./m_FriendsPairing.java)        |
| [`n_BinarySting.java`](./n_BinaryString.java)        |

---