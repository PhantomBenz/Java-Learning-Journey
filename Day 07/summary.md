# Day 07 – Prime Number Functions, Number Conversions & Java Scope

Today, I deepened my understanding of **functions** by solving practical problems such as checking for prime numbers and converting numbers between **binary** and **decimal** formats.  
Additionally, I explored **variable scopes** in Java, learning how the accessibility of variables is defined in different contexts.

---

## Concepts Covered

### Prime Number Check
A number is **prime** if it has only two divisors: `1` and itself.

- **Logic:** Loop from `2` to `n-1` and check if `n` is divisible by any number in the range.
- **More Optimized Logic:** Loop from `2` to `square root of n` and check if `n` is divisible by any number in the range.
- Edge cases like `n <= 1` should be handled (not prime).

### Prime Numbers in a Range
- Used a loop to iterate through a given range and called the `isPrime()` function for each value.

### Number Conversion
1. **Binary to Decimal**
   - Input: binary string or integer
   - Process: multiply each bit by power of 2, from right to left

2. **Decimal to Binary**
   - Input: decimal integer
   - Process: divide by 2 repeatedly and store remainders

---

## Programs Practiced

| Filename | Description |
|----------|-------------|
| [`a_PrimeOrNot.java`](./a_PrimeOrNot.java) | Checked whether a given number is prime using a function |
| [`b_PrimeInRange.java`](./b_PrimeInRange.java) | Printed all prime numbers within a given range |
| [`c_BinaryToDecimal.java`](./c_BinaryToDecimal.java) | Converted binary number to decimal using a custom function |
| [`d_DecimalToBinary.java`](./d_DecimalToBinary.java) | Converted decimal number to binary using a custom function |

---

## Java Scopes Explained

In Java, **scope** determines the visibility and lifecycle of variables. There are mainly three types:

### 1️⃣ **Method Scope**
- Variables declared inside a method.
- Only accessible **within** that method.
- Destroyed once the method call ends.

```java
void greet() {
    String name = "Alice"; // method scope
    System.out.println("Hello " + name);
}
// 'name' cannot be used outside greet()
```

---

### 2️⃣ **Block Scope**

* Variables declared inside any block (`{ }`), including `if`, `for`, `while`, etc.
* Exists **only** within the block where defined.

```java
if (true) {
    int x = 5; // block scope
    System.out.println(x);
}
// x is not accessible here
```

---

### 3️⃣ **Class Scope** *(also known as Instance or Static Scope — not covered deeply today)*

* Variables declared inside a class but outside any method.
* Can be accessed by methods depending on whether they are `static` or instance variables.

---

Understanding scopes is critical for avoiding errors like **variable shadowing**, and writing safe, bug-free functions.

---
