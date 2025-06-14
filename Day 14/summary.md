# Day 14 Summary - Java Strings (Advanced)

Today, I explored more advanced concepts of **Java Strings**. I learned about `substring()`, immutability of Strings, and the `StringBuilder` class, including practical programs like finding the largest string, converting the first letter to uppercase, and compressing strings.

---

## Topics Covered:

### 1. **`substring()` Function**
- Extracts a portion of a string from a specified starting index to an optional ending index (exclusive).
- **Syntax:**  
  `String sub = str.substring(startIndex);`  
  `String sub = str.substring(startIndex, endIndex);`
- Example:  
  `"HelloWorld".substring(0, 5)` → `"Hello"`

---

### 2. **Largest String Program**
- Compares strings **lexicographically** using `compareTo()`.
- Returns the largest (dictionary-wise) among a set of strings.

---

### 3. **Why are Strings Immutable in Java?**
- **Immutability** means once created, string content cannot be changed.
- **Reasons:**
  - **Security:** Strings are often used in network connections, file paths, database URLs etc.
  - **Thread-safety:** No synchronization needed.
  - **String Pooling:** Allows reuse of common strings to save memory.

---

### 4. **`StringBuilder` Class**
- A mutable version of String.
- Used when frequent string modifications are required.
- Efficient for large operations like concatenations inside loops.

#### Key Functions:
| Function | Description |
|----------|-------------|
| `append()` | Add string to the end |
| `insert()` | Insert string at a position |
| `setCharAt()` | Modify a specific character |
| `reverse()` | Reverses the string |

**Example:**
```java
StringBuilder sb = new StringBuilder("hello");
sb.setCharAt(0, 'H'); // Output: Hello
```

---

## Programs Practiced:

### [`a_Substring.java`](./a_Substring.java)

* Demonstrates the use of substring with single and dual arguments.

### [`b_LargestString.java`](./b_LargestString.java)

* Compares array of strings to print the largest lexicographically.

### [`c_StringBuilder.java`](./c_StringBuilder.java)

* Demonstrates initialization, character mutation, appending, and reversing strings.

### [`d_FirstLetterToUpperCase.java`](./d_FirstLetterToUpperCase.java)

* Converts the **first character of each word** to uppercase.
* Takes sentence input → outputs with capitalized first letters.
* **Logic:**

  * Traverse the string.
  * After space, capitalize the next character.

### [`e_StringCompression.java`](./e_StringCompression.java)

* Compresses repeated characters in a string.
* Example: `aaabbcccdd` → `a3b2c3d2`
* **Logic:**

  * Traverse string with index.
  * Count consecutive repeating characters.
  * Append character + count.

---

## Key Takeaways:

* Use `StringBuilder` for better performance when modifying strings frequently.
* Understand Java's string immutability for writing secure and memory-efficient code.
* Learn to break down string problems like compression and capitalization using traversal logic and conditions.

---

