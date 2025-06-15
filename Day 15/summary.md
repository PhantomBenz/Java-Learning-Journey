# Day 15: Bit Manipulation in Java

Today, I explored the powerful world of **Bit Manipulation**—an essential technique for optimizing performance in competitive programming, embedded systems, cryptography, and more.

---

## Topics Covered

### 🔹 Binary Number System
- A **base-2 number system** consisting of only 0s and 1s.
- Computers store and manipulate all data in binary.

### 🔹 Bitwise Operators
Java provides several **bitwise operators** for direct bit-level operations:

| Operator | Name            | Description                                |
|----------|-----------------|--------------------------------------------|
| `&`      | AND             | 1 only if both bits are 1                  |
|  `\|`      | OR              | 1 if at least one bit is 1                 |
| `^`      | XOR             | 1 if bits are different                    |
| `~`      | One's Complement| Inverts all bits (0→1, 1→0)                |
| `<<`     | Left Shift      | Shifts bits to the left (multiply by 2ⁿ)   |
| `>>`     | Right Shift     | Shifts bits to the right (divide by 2ⁿ)    |

---

## Bitwise Tricks Practiced

### 🔹 Check if a Number is Odd or Even
- `n & 1` → if 1, then **odd**; if 0, then **even**.
- Efficient alternative to using `% 2`.

### 🔹 Get i-th Bit
- Use: `(n >> i) & 1`
- Extracts the value of the bit at index `i`.

### 🔹 Set i-th Bit
- Use: `n | (1 << i)`
- Sets the bit at index `i` to 1.

### 🔹 Clear i-th Bit
- Use: `n & ~(1 << i)`
- Clears the bit at index `i` to 0.

### 🔹 Update i-th Bit
- Step 1: Clear the i-th bit.
- Step 2: Set it to desired value using:  
  `n = (n & ~(1 << i)) | (newBit << i)`

### 🔹 Clear Last i Bits
- Use: `n & (~0 << i)`
- Sets the last `i` bits to 0.

### 🔹 Clear Range of Bits (i to j)
- Create mask using:  
  `mask = (~0 << (j+1)) | ((1 << i) - 1)`  
  Then apply: `n & mask`

---

## Bit Manipulation Applications

### 🔸 Check if Number is Power of 2
- A number `n` is power of 2 if `n & (n-1) == 0`  
  (only one set bit)

### 🔸 Count Set Bits in a Number
- Use loop: `count += n & 1; n >>= 1;`
- Efficient implementation via Brian Kernighan’s Algorithm.

### 🔸 Fast Exponentiation (Binary Exponentiation)
- Computes `a^n` in **O(log n)** time.
- Strategy:
  - If `n` is even: `a^n = (a²)^(n/2)`
  - If `n` is odd: `a^n = a × a^(n-1)`

---

## Programs Practiced

| Filename                     | Description                                 |
|------------------------------|---------------------------------------------|
| [`a_BitManipulation.java`](./a_BitManipulation.java)       | Demo of bitwise operators                   |
| [`b_OddOrEven.java`](./b_OddOrEven.java)             | Check odd/even using bitwise                |
| [`c_GetIthBit.java`](./c_GetIthBit.java)             | Extract the i-th bit                        |
| [`d_SetIthBit.java`](./d_SetIthBit.java)             | Set i-th bit to 1                           |
| [`e_ClearIthBit.java`](./e_ClearIthBit.java)           | Clear i-th bit                              |
| [`f_UpdateIthBit.java`](./f_UpdateIthBit.java)          | Update i-th bit to 0 or 1                   |
| [`g_ClearLastIBits.java`](./g_ClearLastIBits.java)        | Clear last i bits                           |
| [`h_ClearRangeOfBits.java`](./h_ClearRangeOfBits.java)      | Clear bits between two positions            |
| [`i_PowerOf2OrNot.java`](./i_PowerOf2OrNot.java)         | Verify if a number is power of 2            |
| [`j_CountSetBits.java`](./j_CountSetBits.java)          | Count number of 1s in binary representation |
| [`k_FastExponentiation.java`](./k_FastExponentiation.java)    | Calculate a^n in O(log n)                   |

---

## Takeaway

Bit manipulation unlocks a deeper understanding of low-level operations and offers efficient solutions where speed and memory are critical. It is especially important in **competitive programming**, **embedded systems**, and **hardware-level optimizations**.

