# Day 12 Summary - 2D Arrays in Java

Today, I explored **2D arrays in Java**, their syntax, real-world use cases, and how they are stored in memory. I also implemented common operations and algorithms related to 2D matrices.

---

## What I Learned

### What is a 2D Array?
A **2D array** is essentially an array of arrays, useful for storing data in **rows and columns** like a matrix or a grid.

```java
int[][] matrix = new int[3][4];  // 3 rows, 4 columns
```

### Creation and Data Manipulation

* Arrays are created using nested curly braces or with new keyword:

```java
int[][] arr = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};
```

* Access elements using `arr[row][column]`.

### Memory Utilization

* In Java, a 2D array is stored as an array of references to 1D arrays.
* Hence, it’s not mandatory that every row has the same number of columns (jagged arrays are possible).

---

## Programs Practiced

| Program                 | Description                                                            |
| ----------------------- | ---------------------------------------------------------------------- |
| [`a_TwoDArray.java`](./a_TwoDArray.java)      | Basic operations on 2D arrays: input, output, initialization.          |
| [`b_SpiralMatrix.java`](./b_SpiralMatrix.java)   | Printed a matrix in spiral order.                                      |
| [`c_DiagonalSum.java`](./c_DiagonalSum.java)    | Efficiently calculated the sum of primary and secondary diagonals.     |
| [`d_SearchInMatrix.java`](./d_SearchInMatrix.java) | Implemented optimized matrix search (row-wise and column-wise sorted). |

---

## Spiral Matrix

* Printed matrix in spiral order by using boundary variables: `startRow`, `endRow`, `startCol`, and `endCol`.
* Common pattern used in data visualization and robotic path planning.

### Time Complexity: `O(n*m)`

---

## Diagonal Sum

* Calculated primary and secondary diagonal sums.
* For `arr[i][i]` = primary, and `arr[i][n-1-i]` = secondary.

### Optimization:

If `n` is odd, middle element gets counted twice. So subtract once.

### Time Complexity: `O(n)`

---

## 🔍 Search in Sorted Matrix

* Matrix is sorted row-wise and column-wise.
* Started from top-right corner and moved accordingly:

  * If current > key → move left
  * If current < key → move down

### Time Complexity: `O(n + m)` (Better than brute force `O(n*m)`)

---

## Real-World Use Cases of 2D Arrays

* Game boards (like chess)
* Image processing (pixel grid)
* Spreadsheet data
* Graph adjacency matrices
* Maps (coordinates, tiles)

---

## Summary

* Understood creation and access of 2D arrays.
* Explored common algorithms and search strategies.
* Practiced four programs based on different 2D matrix problems.

