# Day 09: Arrays in Java

Today I learned and practiced how to use **arrays** in Java — from basic operations to search algorithms.

---

## Topics Covered:

### 🔸 Arrays
- A **list of elements** of the same type.
- Stored in **contiguous memory** locations.
- Can be created in two ways:
  ```java
  int arr[] = new int[20];           // Creating with size
  int arr[] = {1, 2, 3};             // Initializing with values
  ```

---

### 🔸 Basic Array Operations:

* **Input**: Taking elements using loops and Scanner.
* **Output**: Printing elements using loop.
* **Update**: Changing value at a particular index.

---

### 🔸 Passing Arrays as Arguments

* Arrays are **passed by reference**.
* Any changes made in the function **affects the original array**.
* Example syntax:

  ```java
  public static void updateArray(int[] arr) {
      arr[0] = 100;  // Changes original
  }

  public static void main(String[] args) {
      int[] myArr = {1, 2, 3};
      updateArray(myArr);
  }
  ```

---

### 🔸 Linear Search

* Check each element one-by-one.
* **Time Complexity**: `O(n)`
* Implemented in a program.

---

### 🔸 Finding Largest Number in Array

* Traverse and update the max value.
* **Time Complexity**: `O(n)`
* Implemented in a program.

---

### 🔸 Binary Search

* Efficient searching **only in sorted arrays**.
* Repeatedly divide search space in half.
* **Time Complexity**: `O(log₂ n)`
* Implemented in a program.

---

## Programs Practiced

| Filename                         | Description                               |
| -------------------------------- | ----------------------------------------- |
| [`a_Array.java`](./a_Array.java)                   | Array creation, input/output, update      |
| [`b_PassingArrayAsArguments.java`](b_PassingArrayAsArguments.java) | Demonstrated passing array to function    |
| [`c_LinearSearch.java`](./c_LinearSearch.java)            | Performed linear search                   |
| [`d_LargestNumber.java`](./d_LargestNumber.java)           | Found largest number in array             |
| [`e_BinarySearch.java`](./e_BinarySearch.java)            | Implemented binary search in sorted array |

---

## Key Takeaways

* Arrays are a powerful way to store and manipulate lists.
* Function calls on arrays affect the original data.
* Binary Search is **faster** than Linear Search but requires sorting.

---