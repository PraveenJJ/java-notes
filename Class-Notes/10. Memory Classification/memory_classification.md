# Memory Classification in Java

## Definition
- Memory classification in Java refers to how the JVM organizes and manages memory during program execution. 
- The JVM divides memory into different runtime areas such as 
  - Heap Area
  - Stack Area
  - Method Area

---

## Heap Area
- Heap memory is the runtime memory area where `objects` and `instance variables` are stored.
- Objects created using `new` keyword are stored here.
- String constant pool is also stored here (This was in Method area until Java 7).

---

## Stack Area
- Stack memory stores method execution information such as 
  - Local variables
  - Method calls
  - References to heap objects.

---

## Method Area
- The Method Area stores class-level information such as 
  - Class metadata, 
  - Static variables

---