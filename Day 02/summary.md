### 🗓️ Day 02 – Java: Data Types, Type Conversion, Operators, and Execution Flow

---

#### 📌 Topics Covered:

---

### **📐 Float vs Double**
- Decimal values like `1.40` are treated as `double` by default.
- To declare a `float`, append `f` like `1.40f`.

---

### **🔄 Type Conversion in Java**

#### 🟢 Widening (Implicit Conversion)
- Automatically done when:
  1. Types are compatible.
  2. Destination type > Source type.
- Conversion hierarchy:
  ```text
  byte → short → int → long → float → double
  ```

#### 🔴 Type Casting (Explicit Conversion)

* Manual conversion using casting operator.
* Might lead to **loss of precision** (called *lossy* conversion).
* Example:

  ```java
  int marks = (int) 99.99f;  // marks = 99
  ```

---

### **📈 Type Promotion in Expressions**

* `byte`, `short`, and `char` → promoted to `int` in expressions.
* If one operand is `long`, `float`, or `double`, the whole expression is promoted accordingly.
* Highest data type determines result:

  * Example: `long` + `double` → promoted to `double`.

---

### **⚙️ Java Program Execution Flow**

#### Diagram:

```text
Source Code (.java)
      ↓ (Compilation by compiler)
  Bytecode (.class)
      ↓ (Execution)
Java Virtual Machine (JVM)
      ↓
Native Machine Code
```

#### Environment Structure:

```text
JDK
├── JRE
│   ├── JVM
│   └── Libraries
├── Compiler
└── Dev Tools
```

* Java is **portable** because bytecode can run on any platform with a JVM.
* "Write Once, Run Anywhere" – key Java philosophy.

---

### **➕ Operators in Java**

Operators instruct the compiler to perform operations on data.

---

#### 1. **Arithmetic Operators**

* **Binary:** `+`, `-`, `*`, `/`, `%`
* **Unary:** `+`, `-`, `++`, `--`

| Pre/Post | Description                 |
| -------- | --------------------------- |
| Pre      | Changes value, then uses it |
| Post     | Uses value, then changes it |

```java
int a = 5;
System.out.println(++a);  // prints 6 (pre-increment)
a = 5;
System.out.println(a--);  // prints 5, then a becomes 4 (post-decrement)
```

> 📌 *Ternary operator will be learned later during conditionals statements.*

---

#### 2. **Relational Operators**

* Compare two values:

  * `==`, `!=`, `>`, `<`, `>=`, `<=`
* Return `true` or `false`.

---

#### 3. **Logical Operators**

* Used for conditional logic:

  * `&&` → Logical AND
  * `||` → Logical OR
  * `!` → Logical NOT

---

#### 4. **Assignment Operators**

* Assign and operate:

  * `=`, `+=`, `-=`, `*=`, `/=`, `%=` etc.
* Example:

  ```java
  A += B;  // Faster than A = A + B
  ```

---

#### 5. **Bitwise Operators**

> *Bitwise operator will be learned later.*

---

📁 **Programs Practiced:** 

| Filename | Description |
|----------|-------------|
| [`a_TypeConversion.java`](./a_TypeConversion.java) | Implicit Conversion (Automatic) |
| [`b_TypeCasting.java`](./b_TypeCasting.java) | Explicit Conversion (Manual) |
| [`c_TypePromotion.java`](./c_TypePromotion.java) | type conversion in an expression |
| [`d_ArithmeticOperation.java`](./d_ArithmeticOperations.java) | Demonstrated different Arithmetic operators and operations |
| [`e_RelationalOperators.java`](./e_RelationalOperators.java) | Demonstrated different Relational operators and operations |
| [`f_LogicalOperators.java`](./f_LogicalOperators.java) | Demonstrated different Logical operators |
| [`g_AssignmentOperators.java`](./g_AssignmentOperators.java) | Demonstrated different Assignment operators and operations |

---