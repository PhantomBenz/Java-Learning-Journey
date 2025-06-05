# Day 04 – Loops & Control Flow

Today I explored **loops** in Java to execute repetitive tasks efficiently. I also learned how to use control flow statements to influence loop behavior.

---

### Topics Covered:

#### **While Loop**

* Syntax:

```java
while (condition) {
    // code block
}
```

* Runs **as long as** the condition is true.

#### **For Loop**

* Syntax:

```java
for (initialization; condition; updation) {
    // code block
}
```

* Best for known iteration counts.

#### **Do-While Loop**

* Syntax:

```java
do {
    // code block
} while (condition);
```

* Ensures the code runs **at least once**.

#### **Break Statement**

* Used to **exit a loop** immediately.

#### **Continue Statement**

* Used to **skip the current iteration** and continue with the next.

---

### Summary:

Loops are essential for automation and repetition in code. Each type of loop serves different scenarios:

* `while` for unknown repetitions
* `for` for definite repetitions
* `do-while` when **at least one execution** is needed

Control statements like `break` and `continue` help **fine-tune** loop behavior and avoid unnecessary iterations.

---

### Programs Practiced:

| Filename                                                 | Description                                   |
| -------------------------------------------------------- | --------------------------------------------- |
| [`a_WhileLoop.java`](./a_WhileLoop.java)                 | Introduced the `while` loop                   |
| [`b_Problem1.java`](./b_Problem1.java)                   | Print numbers from 1 to 10                    |
| [`c_Problem2.java`](./c_Problem2.java)                   | Print numbers from 1 to n (user input)        |
| [`d_Problem3.java`](./d_Problem3.java)                   | Sum of first n natural numbers                |
| [`e_ForLoop.java`](./e_ForLoop.java)                     | Introduced the `for` loop                     |
| [`f_Problem4.java`](./f_Problem4.java)                   | Printed 4x4 `*` pattern                       |
| [`g_Problem5.java`](./g_Problem5.java)                   | Reverse a given number                        |
| [`h_DoWhileLoop.java`](./h_DoWhileLoop.java)             | Introduced the `do-while` loop                |
| [`i_BreakStatement.java`](./i_BreakStatement.java)       | Took input until 0 was entered using `break`  |
| [`j_ContinueStatement.java`](./j_ContinueStatement.java) | Skipped 5 and 6 while printing numbers 1-10   |
| [`k_Problem6.java`](./k_Problem6.java)                   | Checked if a number is prime using `for` loop |

---

### Key Takeaways:

* Loops simplify repetitive code
* Control statements (`break`, `continue`) enhance loop control
* Each loop structure has its own ideal use case

---

✨ Moving forward, these looping concepts will serve as the foundation for solving more complex logic problems in Java!
