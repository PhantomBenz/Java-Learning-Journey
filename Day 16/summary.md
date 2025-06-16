# Day 16 – Object-Oriented Programming in Java

Today, I covered core **OOP concepts** and Java-specific features that enable structured, modular, and reusable code.

---

## 🔹 Classes and Objects

* **Class**: Blueprint defining data (fields) and behavior (methods).
* **Object**: Instance of a class containing actual values.
* Example:

  ```java
  class Person { 
    String name; 
    int age; 
  }
  Person p = new Person();
  ```

---

## 🔹 Access Modifiers

* Control visibility of classes, methods, and fields.

  * `public`: accessible anywhere
  * `protected`: accessible within package & subclasses
  * `(default)`: package-private
  * `private`: accessible only within class

---

## 🔹 Getters and Setters

* Methods to **access** and **update** private fields, enforcing encapsulation.

  ```java
  public String getName() { 
    return name; 
  }
  public void setName(String n) { 
    this.name = n; 
  }
  ```

---

## 🔹 Encapsulation

* Bundling data & methods; **hiding** internal state using `private` fields and public getters/setters.
* Promotes data integrity and security.

---

## 🔹 Constructors

* Special methods invoked when creating an object.
* **Types**:

  * **Default constructor**: No args, auto-provided if none defined.
  * **Parameterized constructor**: With arguments to initialize fields.
  * **Copy constructor**: Creates a new object copying another’s fields.

```java
public Person(Person other) { 
    this.name = other.name; 
    this.age = other.age; 
}
```

---

## 🔹 Shallow vs Deep Copy

* **Shallow copy**: Copies object references; nested objects are shared.
* **Deep copy**: Clones nested objects as well; no shared references.

---

## 🔹 Destructors & Garbage Collection

* Java uses an automatic **Garbage Collector**; no explicit destructor needed.
* `finalize()` method deprecated in recent Java versions.

---

## 🔹 Inheritance

* Mechanism to **reuse** and **extend** existing classes.
* **Single level**: A → B
* **Multi level**: A → B → C
* **Hierarchical**: A → B and A → C
* **Hybrid**: Combination of above (using interfaces to simulate multiple inheritance)

---

## 🔹 Polymorphism

* Ability of objects to take **many forms**.
* **Compile-time** (Method Overloading): Same method name, different signatures.
* **Runtime** (Method Overriding): Subclass provides specific implementation.

---

## 🔹 Packages

* Group related classes/interfaces; provide namespace management.
* Use `package` keyword at top of source file.
* Example: `package com.myapp.models;`

---

## 🔹 Abstraction

* Hiding implementation details; exposing only necessary interfaces.
* Achieved via **abstract classes** and **interfaces**.

### Abstract Classes

* Can have both abstract and concrete methods.
* Cannot instantiate directly.

### Interfaces

* Define method signatures; Java 8+ allows **default** and **static** methods.
* Classes can implement multiple interfaces.

---

## 🔹 `static` and `super` Keywords

* `static`: Belongs to class rather than instance (fields or methods).
* `super`: Reference to parent class; used to call parent constructors or methods.

---

## Programs Practiced

| Filename                   | Description                                              |
| -------------------------- | -------------------------------------------------------- |
| [`a_OOP.java`](./a_OOP.java)               | Demonstrated classes, objects, and basic OOP principles  |
| [`b_AccessModifier.java`](./b_AccessModifier.java)    | Illustrated public, private, protected access control    |
| [`c_GetterAndSetters.java`](./c_GettersAndSetters.java)  | Encapsulated fields using getters/setters                |
| [`d_Constructor.java`](./d_Constructor.java)       | Showed default, parameterized, and copy constructors     |
| [`e_Inheritance.java`](./e_Inheritance.java)       | Implemented single, multi, and hierarchical inheritance  |
| [`f_MethodOverloading.java`](./f_MethodOverloading.java) | Demonstrated compile-time polymorphism (overloading)     |
| [`g_MethodOverriding.java`](./g_MethodOverriding.java)  | Demonstrated runtime polymorphism (overriding)           |
| [`h_AbstractClass.java`](./h_AbstractClass.java)     | Used abstract classes with abstract and concrete methods |
| [`i_Interfaces.java`](./i_Interfaces.java)        | Defined and implemented interfaces                       |

---

## Key Takeaways

* OOP in Java is foundational for building modular and maintainable code.
* Encapsulation and access modifiers protect class internals.
* Inheritance and polymorphism enable code reuse and flexibility.
* Abstraction via abstract classes/interfaces defines clear contracts.
* `static` and `super` facilitate class-level operations and parent references.

---
