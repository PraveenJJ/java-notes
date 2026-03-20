# Packages in Java

## Definition

- Package is a mechanism to group related classes, interfaces, and sub-packages in Java.
- Package must be the first statement in the file.
- Package name usually follows reverse domain convention.

## Syntax

```java
package com.company.project.module;
```

## Example

```java
package com.example.mypackage;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## Compiling and Executing via terminal
- Keep the above class in project root.
- Open terminal in project root
```java
// -d .  will create the folder structure com/example/mypackage 
// places the .class file inside the package
javac -d . MyClass.java

// this command will execute the .class file present inside the package
java com.example.mypackage.MyClass 
```

---

# Imports in Java

## Definition

- An import statement in Java allows a class to use classes or interfaces from another package without writing the fully qualified class name.
- Imports improve readability and convenience.

---

### Example without import:

```java
java.util.ArrayList list = new java.util.ArrayList();
```

### With import:

```java
import java.util.ArrayList;

ArrayList list = new ArrayList();
```

---

### Importing above MyClass example
```java
import com.example.mypackage.MyClass;

public class Driver {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
    }
}

// commands
javac -cp . Driver.java // -cp . will check for .class files for MyClass in current directory
java Driver
```

---

### Types of Imports

#### 1. Single Class Import

```java
import java.util.ArrayList;
```

#### 2. Wildcard Import

```java
import java.util.*;
```

- Imports all classes from the package.
- Wildcard imports do not import sub-packages.

---

# Project structure in Java

- A Java project structure organizes source code, packages, compiled classes, and resources into a standard directory layout to maintain scalability and maintainability.

## Concept Explanation

- In modern Java projects (especially Maven or Gradle projects), the structure is standardized.

## Typical layout:

```
project-name
│
├── src
│   ├── main
│   │   ├── java
│   │   │    └── com
│   │   │        └── company
│   │   │            └── service
│   │   │                └── PaymentService.java
│   │   │
│   │   └── resources
│   │        └── application.properties
│   │
│   └── test
│        └── java
│            └── com
│                └── company
│                    └── service
│                        └── PaymentServiceTest.java
│
├── pom.xml
└── target
```

## Explanation

- **src/main/java**: Contains the main source code.
- **src/main/resources**: Contains resources like configuration files, properties, etc.
- **src/test/java**: Contains test code.
- **pom.xml**: Maven project configuration file.
- **target**: Contains compiled classes and build artifacts.

---