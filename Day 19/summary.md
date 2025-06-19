# Day 19 – Time & Space Complexity

Today, I learned how to **analyze algorithm performance** in terms of time and space, using formal notations and practical examples.

---

##  What Is Time Complexity?  
Time complexity measures how the **running time** of an algorithm grows with input size (n). It abstracts away hardware and language details to focus on algorithmic efficiency.

---

## Constant Time – O(1)  
An operation that takes the **same time** regardless of input size.  
```java
int peek(int[] arr) {
    return arr[0]; // Always one step
}
```

---

## Big O Notation (Upper Bound)

Describes the **worst-case** growth rate of an algorithm. It gives an upper limit on the time required.

* **O(1)** – constant
* **O(log n)** – logarithmic
* **O(n)** – linear
* **O(n log n)** – linearithmic
* **O(n²)** – quadratic
* **O(2ⁿ)** – exponential

---

## Big Ω & Θ Notations

* **Big Ω (Omega)**: **Best-case** lower bound.
* **Big Θ (Theta)**: **Tight bound** (both upper and lower) when best, average, and worst cases grow similarly.

---

## Common Time Complexities

| Notation   | Example                                 | Growth       |
| ---------- | --------------------------------------- | ------------ |
| O(1)       | Array access `arr[i]`                   | Constant     |
| O(log n)   | Binary search                           | Logarithmic  |
| O(n)       | Single loop                             | Linear       |
| O(n log n) | Merge Sort, Quick Sort average          | Linearithmic |
| O(n²)      | Nested loops                            | Quadratic    |
| O(2ⁿ)      | Recursive Fibonacci without memoization | Exponential  |

---

## Space Complexity

Measures the **extra memory** an algorithm needs beyond input storage.

* **Auxiliary space**: Temp space used by the algorithm.
* **Total space**: Auxiliary space + input space.

| Notation | Example                    |
| -------- | -------------------------- |
| O(1)     | In-place swap              |
| O(n)     | Auxiliary array of size n  |
| O(n²)    | 2D DP table for matrix ops |

---

## Simple Loop Analysis

Understanding how loops contribute to time and space complexity is foundational. Let’s break down a simple loop step by step:

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

1. **Initialization (`int i = 0`):**
   Executed **once** before the loop starts → **O(1)** time.

2. **Condition Check (`i < n`):**
   Evaluated **n + 1 times** (the extra check when `i == n`) → **O(n)** time.

3. **Body Execution (`System.out.println(i)`):**
   Runs **n times**, each an O(1) operation → **O(n)** time.

4. **Increment (`i++`):**
   Executed **n times** after each iteration → **O(n)** time.

**Total Time Complexity:**
O(1) + O(n) + O(n) + O(n) = **O(n)** (we drop lower-order terms).

---

### Key Takeaways

* Time & space complexity guide algorithm selection for scalability.
* Big O focuses on worst-case; Big Ω and Θ provide best-case and tight bounds.
* Practice analyzing loops and recursive calls to internalize these concepts.

---
<br>

![Time Complexity](../.image/Day%2019_1.png)

---
<br>

![Common Complexity and Space Complexity](../.image/Day%2019_2.png)

---