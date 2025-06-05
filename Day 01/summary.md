### Day 1 – Java Basics: Boilerplate, I/O, Variables & DataTypes

#### Topics Covered:

* **Boilerplate Code**
  Learned the basic structure of a Java program:

  ```java
  public class FileName {
      public static void main(String[] args) {
          // Code goes here
      }
  }
  ```

  This is the essential skeleton required for any Java program.

* **Output in Java**

  * `System.out.print()` – prints output on the same line.
  * `System.out.println()` – prints and moves to the next line.

* **Identifiers, Variables, and Memory Concepts**

  * Variables or identifiers are **names given to memory locations**.
  * Java is a **typed language**, meaning every variable must have a declared type.

* **Data Types in Java**

  * **Primitive** (e.g., `int`, `char`, `float`, `boolean`) – basic building blocks.
  * **Non-primitive** (like `String`, `Arrays`, etc.) – more advanced types (not deeply covered yet).
  * Understood the size and behavior of primitive data types.

* **Arithmetic Operations**

  * Performed basic operations like addition and multiplication.

* **Comments in Java**

  * Single-line: `// comment`
  * Multi-line:

    ```java
    /* 
       multi-line comment 
    */
    ```

* **Input in Java using Scanner**

  * Learned about importing `Scanner` from `java.util`:

    ```java
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    ```
  * Used to take various types of inputs like integers, strings, etc.

---

#### Programs Practiced:

| Filename | Description |
|----------|-------------|
| [`a_BasicOutput.java`](./a_BasicOutput.java) | Simple output with `System.out.print` |
| [`b_Pattern.java`](./b_Pattern.java) | Printed basic text/patterns without loop|
| [`c_Variable.java`](./c_Variable.java) | Used variables and printed values |
| [`d_DataType.java`](./d_DataType.java) | Demonstrated primitive data types |
| [`e_Sum.java`](./e_Sum.java) | Added two numbers |
| [`f_Input.java`](./f_Input.java) | Took input from user |
| [`g_CalculationByInput.java`](./g_CalculationByInput.java) | Performed arithmetic using user input |

---
