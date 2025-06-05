# Day 03 – Conditional Statements in Java

### What I Learned:

Today was all about mastering **conditional statements** in Java – tools that help control the flow of logic based on conditions. Here's what I explored:

---

### `if-else` Statement

* **Purpose:** Execute a block of code if a condition is true, else run alternative code.
* **Syntax:**

```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

* **Programs Practiced:**

  * Check if a number is **even or odd**
  * Find the **largest number among two integers**

---

### `else-if` Ladder

* **Purpose:** Handle multiple conditions sequentially.
* **Syntax:**

```java
if (condition1) {
    // block1
} else if (condition2) {
    // block2
} else {
    // fallback block
}
```

* **Programs Practiced:**

  * **Tax Calculator** based on income brackets
  * Find the **largest among three integers**

---

### Ternary Operator

* **Purpose:** Write a concise single-line `if-else` expression.
* **Syntax:**

```java
result = condition ? valueIfTrue : valueIfFalse;
```

* **Program Practiced:**

  * Determine if a **student is pass or fail** based on marks

---

### `switch` Statement

* **Purpose:** Execute different code blocks based on variable value
* **Syntax:**

```java
switch (variable) {
    case value1:
        // block1
        break;
    case value2:
        // block2
        break;
    ...
    default:
        // fallback block
}
```

* **Important Note:** If `break;` is **omitted**, all cases **below the matched case** will also execute (fall-through behavior).

* **Program Practiced:**

  * **Arithmetic Calculator** for two variables using `+`, `-`, `*`, `/`, `%`

---

### Programs Practiced:

| Filename                                               | Description                                            |
| ------------------------------------------------------ | -------------------------------------------------------|
| [`a_IfElse.java`](./a_IfElse.java)                     | if-else introduction                                   |
| [`b_Problem1.java`](./b_Problem1.java)                 | Check if number is odd or even using if-else           |
| [`c_Problem2.java`](./c_Problem2.java)                 | Find largest between two numbers using if-else         |
| [`d_ElseIf.java`](./d_ElseIf.java)                     | else if introduction                                   |
| [`e_Problem3.java`](./e_Problem3.java)                 | Tax calculation using else-if ladder                   |
| [`f_Problem4.java`](./f_Problem4.java)                 | Largest among three numbers using else-if ladder       |
| [`g_TernaryOperator.java`](./g_TernaryOperator.java)   | Ternary Operator introduction                          |
| [`h_Problem5.java`](./h_Problem5.java)                 | Pass/Fail using ternary operator                       |
| [`i_SwitchOperator.java`](./i_SwitchOperator.java)     | Introdcution to Switch Operator                        |
| [`j_Calculator.java`](./j_Calculator.java)             | Simple two variable arithmetic calculator using Switch |

---
