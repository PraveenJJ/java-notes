# Java Platform Fundamentals

## Java
- Java is an **object Oriented programming language** 
- It is used to build **enterprise applications, web services & cloud-based systems**
- Some of the features of Java are
  - Platform Independent
  - Object Oriented
  - Multi-threaded

---

## Platform Independent
- When you compile a java code, we get bytecode.
- This bytecode can run on any OS that has JVM installed.
- Therefore, same compiled code can be executed on multiple OS without any modifications.
- Hence, proving Write Once Run Anywhere (WORA)

---

## Object Oriented
- Java programs are designed using Classes & Objects.
- These Objects represent real-world entities, that contain state (fields) & behavior (methods).

---

## Multi-Threaded
- Java programs can run multiple threads simultaneously
- Allowing concurrent execution of tasks.

---

## JDK, JRE, JVM

```
(JDK)
  └── (JRE + Development Tools)
        └── (JVM + Java libraries)
```

- **JDK** - JRE + Development Tools - JDK is a suite which has JRE & several tools like compiler, debugger.
- **JRE** - JVM + Java libraries - JRE is the runtime environment required to run Java applications
- **JVM** - JVM is a virtual machine that converts bytecode to machine code, also takes care of garbage collection, memory management.

---

## Compilation & Execution

- **Compilation**
  - Java compiler will take the Java source file `(.java)` & compile it to platform-independent byte code `(.class)`.
- **Execution**
  - JVM will convert the byte code to machine code and then execute it.

---

## Basic structure of a Java program

```
// Optional
package com.example;     

// Optional
import java.util.*;      

// Class declaration
public class HelloWorld {   

    // Instance variable
    int number;

    // Method
    void display() {
        System.out.println("Hello");
    }

    // Main method (entry point)
    public static void main(String[] args) {
        System.out.println("Program starts here");
    }
}
```

## Main method signature
```
public static void main(String[] args)
```
- `public` - JVM can access from anywhere.
- `static` - JVM can call the method without creating an object.
- `void` - JVM will not expect any return.     
- `main` - JVM only recognizes this method name.
- `String[] args` - Command-line arguments are passed to the program through this variable.

---