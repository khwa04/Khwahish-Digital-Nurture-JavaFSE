# Exercise 1: Singleton Pattern Example

## Objective

Implement the Singleton Design Pattern.

Singleton ensures that only one object of a class is created and provides a global point of access to that object.

---

## Characteristics

• Private constructor

• Static instance variable

• Public static method to obtain the instance

• Prevents multiple object creation

---

## Advantages

- Memory efficient
- Controlled access
- Global accessibility

---

## Use Cases

• Logger

• Database Connection

• Configuration Manager

• Cache Manager

---

## Time Complexity

getInstance()

O(1)

---

## UML Representation

Singleton

------------------

-instance : Singleton

+getInstance()

+display()