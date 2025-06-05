# Day 05 – Pattern Printing with Nested Loops

Today I explored how to use **nested `for` loops** in Java to print various simple yet structured patterns. This helped strengthen my understanding of loop control, iteration levels, and row-column logic.

---

### Concepts Covered:

- Basics of **nested `for` loops**
- Controlling rows and columns using loop counters
- Printing characters (`*`, numbers, letters) in specific shapes

---

### Patterns Practiced:

#### 🔹 1. Left-aligned right-angle triangle of stars:

\* <br>
\*\* <br>
\*\*\* <br>
\*\*\*\* 
---

#### 🔹 2. Inverted triangle of stars:

\*\*\*\* <br>
\*\*\* <br>
\*\* <br>
\*
---

#### 🔹 3. Triangle of numbers:

1 <br>
12 <br>
123 <br>
1234
---

#### 🔹 4. Sequential characters in triangle form:

A <br>
BC <br>
DEF <br>
GHIJ
---

#### 🔹 5. Hollow rectangle pattern:

<p>
****** <br>
*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*  <br>
*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* <br>
******
</p>


---

### Programs Practiced:

| Filename                  | Description                          |
|---------------------------|--------------------------------------|
| [`a_NestedLoop.java`](./a_NestedLoop.java)         | Right-angled triangle using `*`      |
| [`b_InvertedStar.java`](./b_InvertedStar.java)         | Inverted triangle using `*`          |
| [`c_HalfPyramid.java`](./c_HalfPyramid.java)         | Number triangle                      |
| [`d_CharPattern.java`](./d_CharPattern.java)         | Sequential characters in triangle    |
| [`e_HollowRectangle.java`](e_HollowRectangle.java)  | Hollow rectangle using `*`           |
---

### Key Takeaway:

- Nested loops allow structured and scalable logic for pattern generation.
- Tracking row/column positions helps map characters and whitespace precisely.
---