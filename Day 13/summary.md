# Day 13 – Strings in Java

Today, I explored the concept of **Strings** in Java — one of the most important classes used for text-based data processing. Strings in Java are objects that represent sequences of characters and offer a wide range of built-in functions for manipulation.

---

## What is a String?

A **String** is a sequence of characters treated as a single data type in Java.  
Strings are immutable, meaning once created, their value cannot be changed.

---

##  Ways to Declare a String

Java allows two primary ways to declare strings:

```java
String str1 = "Hello";                  // String literal (stored in string pool)
String str2 = new String("World");      // Using 'new' keyword (stored in heap)
```

---

## Input and Output Operations

* Input: `Scanner` class is used to read strings.

  * `next()` → reads a single word
  * `nextLine()` → reads the whole line
* Output: Strings can be directly printed using `System.out.println()`.

---

## Common String Functions Practiced

| Function          | Description                            |
| ----------------- | -------------------------------------- |
| `length()`        | Returns length of the string           |
| `charAt(index)`   | Returns character at specified index   |
| `compareTo(str2)` | Compares two strings lexicographically |
| `equals(str2)`    | Compares the content of two strings    |
| `+` or `concat()` | Used for string concatenation          |

---

## Programs Practiced

| Filename                     | Description                                                    |
| ---------------------------- | -------------------------------------------------------------- |
| `a_String.java`              | Basic declaration and initialization                           |
| `b_StringIO.java`            | Input and output of strings using `Scanner`                    |
| `c_StringConcatenation.java` | Using `+` operator to combine strings                          |
| `d_StringCharAt.java`        | Accessing characters using `charAt()`                          |
| `e_CheckPalindrome.java`     | Checking if a string is a palindrome                           |
| `f_ShortestPath.java`        | Simulating path direction (NSEW) and calculating shortest path |
| `g_StringCompare.java`       | Using `.equals()` and `.compareTo()` for comparison            |

---

## Takeaway

* Strings are immutable in Java.
* Java provides rich built-in support for string manipulation.
* Using built-in methods like `.length()`, `.charAt()`, and `.equals()` makes string handling efficient.
* Understanding string comparison methods is important for sorting, searching, and validation.

---