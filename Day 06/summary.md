# Day 06 – Java Functions & Function Overloading

## Topics Covered:

### Functions / Methods:
- Block of code designed to perform a particular task.
- Helps avoid code duplication and increases modularity.
- Functions can have:
  - No parameters
  - Parameters
- **Syntax (no parameter):**
  ```java
  returnType functionName() {
      // code
  }
  ```

* **Syntax (with parameter):**

  ```java
  returnType functionName(type param1, type param2) {
      // code
  }
  ```

### Method Types:

* **User-defined methods:** Created by the programmer for custom functionality.
* **Inbuilt methods:** Provided by Java (e.g., `Math.sqrt()`, `System.out.println()`).

### Function Overloading:

* Multiple functions with the **same name** but **different parameters**.
* Two ways to overload:

  1. **By number of parameters**

     ```java
     int sum(int a, int b) { return a + b; }
     int sum(int a, int b, int c) { return a + b + c; }
     ```
  2. **By data types**

     ```java
     float sum(float a, float b) { return a + b; }
     int sum(int a, int b) { return a + b; }
     ```

---

## Programs Practiced:

| Filename                                                                 | Description                                     |
| ------------------------------------------------------------------------ | ----------------------------------------------- |
| [`a_Functions.java`](./a_Functions.java)                                 | Function to calculate sum of 2 numbers          |
| [`b_SwapValue.java`](./b_SwapValue.java)                                 | Swap values using a function                    |
| [`c_Product.java`](./c_Product.java)                                     | Function to multiply two numbers                |
| [`d_Factorial.java`](./d_Factorial.java)                                 | Calculate factorial using function              |
| [`e_BinomialCoefficient.java`](./e_BinomialCoefficient.java)             | Compute binomial coefficient using factorial    |
| [`f_SumByFunctionOverloading.java`](./f_SumByFunctionOverloading.java)   | Function overloading using number of parameters |
| [`f_SumByFunctionOverloading2.java`](./f_SumByFunctionOverloading2.java) | Function overloading using data types           |

---

