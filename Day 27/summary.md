# Day 27 – Advanced Stack Problems in Java

Today I tackled several advanced problems using **Stacks**, reinforcing my understanding of this powerful linear data structure. These problems are frequently asked in coding interviews and help build core logic and pattern recognition.

---

## 🔸 Problem 1: Next Greater Element

**Concept**:  
For each element in the array, find the next greater element to its right. If no such element exists, store -1.

**Approach**:
* Use a `Stack<Integer>` to keep track of potential next greater elements.
* Traverse the array from **right to left**.
* For each element:

  * Pop elements from the stack **smaller than or equal** to the current element.
  * If the stack is empty → no greater element → `-1`.
  * Else → top of stack is the next greater element.
  * Push the current element onto the stack for future comparisons.

**Key Learning**:
- Stack helps efficiently manage the monotonic decreasing order needed for comparison.
- This reduces the brute-force O(n²) to a more efficient O(n) solution.
- This is a classic example of a monotonic stack pattern, used in various interview problems.

📄 `NextGreaterElement.java`

## 🔸 Problem 2: Valid Parentheses

**Concept**:  
Check if a given string has valid pairs and nesting of `()`, `{}`, and `[]`.

**Approach**:
- Use a `Stack<Character>`.
- Push opening brackets.
- On encountering closing bracket, check if it matches the top of stack.
- If not matched or stack is unbalanced at the end → invalid.

**Key Learning**:
- Stack is ideal for maintaining order of last-in-first-out (LIFO).
- Complexity: O(n)

📄 `ValidParentheses.java`

---

## 🔸 Problem 3: Duplicate Parentheses

**Concept**:  
Detect if an expression contains **redundant or duplicate parentheses**.  
Example: `((a+b))` → Duplicate, `(a+b)` → Valid.

**Approach**:
- Use a `Stack<Character>`.
- On encountering a `)`, count the elements popped until `(` is found.
- If count is zero → duplicate.

**Key Learning**:
- Great for practicing use of stack for parsing expression structure.
- Helps optimize compiled code by flagging unnecessary groupings.

📄 `CheckDuplicateParentheses.java`

---

## 🔸 Problem 4: Maximum Area in Histogram

**Problem**:  
Given an array representing heights of bars in a histogram, find the largest rectangular area under the histogram.

**Concept**:
- For each bar, calculate:
  - The nearest smaller bar on the left.
  - The nearest smaller bar on the right.
- Area = `(rightIndex - leftIndex - 1) * height`.

**Approach**:
- Use two passes with stacks to build `left[]` and `right[]`.
- Use these to compute area for each bar and track maximum.

**Key Learning**:
- Classic **stack-based monotonic approach**.
- Complexity: O(n)

📄 `MaxAreaHistogram.java`

---

## Programs Practiced

| Filename                    | Description                                      |
|----------------------------|--------------------------------------------------|
| [`NextGreaterElement.java`](./NextGreaterElement.java)    | Find the next greater element to its right        |
| [`ValidParentheses.java`](./ValidParentheses.java)    | Checks if brackets in a string are valid         |
| [`CheckDuplicateParentheses.java`](./CheckDuplicateParentheses.java) | Detects redundant parentheses              |
| [`MaxAreaHistogram.java`](./MaxAreaHistogram.java)    | Finds largest rectangle area in a histogram      |

---

## Key Takeaways

- Stacks are powerful tools for problems that involve **reversals**, **bracket matching**, **area calculations**, and **sequence-based conditions**.
- Efficient use of stack reduces time complexity significantly compared to brute-force solutions.
- Knowing when to apply **monotonic stack** patterns is crucial in complex problems like histogram or stock span.

---