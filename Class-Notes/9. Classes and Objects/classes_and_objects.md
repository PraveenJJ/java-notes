# Classes and Objects in Java

## Definition
- Class is a blueprint that defines properties and behaviors.
- Object is an instance of a class.
- Objects represent real-world entity that contain actual values for class properties.
- Classes & Objects are the foundation of Object Oriented Programming.

**Syntax**
```java
class ClassName {
    // variables

    // Constructors

    // Methods
}
```

### Fields/Properties/Variables
- Fields are variables declared inside a class but outside methods
- Used to store the state or properties of an object.
- Example real-world properties:
  - Student → id, name, grade
  - Car → brand, speed, color


### Methods/Functions
- Methods are functions defined inside a class that represent the behavior of an object.
- Example real-world behaviors:
  - Car → accelerate(), brake()
  - Student → study(), attendClass()

### Constructors
- A constructor is a `special method` used to `initialize objects` when they are created. 
- It has the same name as the class.
- Does not have a return type.

---

## Putting Everything Together (Full Example)

```java
class Employee {
    int id;          // field
    String name;     // field

    Employee(int id, String name) {   // constructor
        this.id = id;
        this.name = name;
    }

    void display() {   // method
        System.out.println(id + " " + name);
    }
}

public class Driver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John"); // object creation
        e1.display();
    }
}
```

---

## Methods in Java (Deep dive)

- Method is a block of code that performs a specific task & is executed when it is called. 
- Methods help achieve code reusability, modularity, and maintainability in a program.
- Method signature defines how a method is identified & invoked.

**Syntax**
```java
accessModifier returnType methodName(parameterList) {
    // method body
}
```

**Example**
```java
public int add(int a, int b) {
    int result = a + b;
    return result;
}
```

---

## Constructors in Java (Deep dive)
- Constructor is a special method used to initialize objects when they are created. 
- It has the same name as the class.
- Does not have a return type.

**Syntax**
```java
class ClassName {
    ClassName() {
        // constructor body
    }
}
```

**Example**
```java
class Car {
    String brand;

    Car() {
        brand = "Toyota";
        System.out.println("Car object created");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car(); // object creation
        System.out.println(c.brand); // output: Toyota
    }
}
```
---

## Types of Constructors

### Default Constructor
- A default constructor is provided automatically by the Java compiler if no constructor is defined.

**Example**
```java
// Before compilation
class Student {
    int id;
    String name;
}

// After compilation
class Student {
    int id;
    String name;

    // default constructor added by compiler
    Student() {

    }
}
```

### No-Argument Constructor
- A constructor defined explicitly without parameters.

**Example**
```java
class Student {
    // no-argument constructor
    Student() {
        System.out.println("Student created");
    }
}
```

### Parameterized Constructor
- A constructor defined with parameters.
- Used to initialize object properties.

**Example**
```java
class Student {
    int id;
    String name;

    // parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

---

## `this` keyword in Constructors
- Used to differentiate between instance variables and parameters.

**Example**
```java
class Employee {
    // instance variable
    int id;

    // parameterized constructor
    Employee(int id) {
        this.id = id;
    }
}
```

---

## Constructor overloading
- A class can have multiple constructors with different parameter lists.
- Java decides which constructor to call based on parameters.

**Example**
```java
class Employee {
    int id;
    String name;

    Employee() {
        System.out.println("No-argument constructor");
    }

    Employee(int id) {
        this.id = id;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

---

## Constructor Chaining
- Constructor chaining is the process where one constructor calls another constructor in the same class or parent class.
- Constructor chaining within the same class is achieved via `this()`
- Constructor chaining within different classes is achieved via `super()`

**Example**
```java
class Student {
    int id;
    String name;

    Student() {
        this(100, "Sample Student");
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

new Student() // calls No arg constructor -> invokes parameterized constructor
```

### Constructor Chaining Rules
- `this()` calls another constructor within the same class.
- `super()` calls the parent class constructor.
- Both must be the `first statement` in the constructor.
- Only `one` of them can appear in a constructor.
- If `super()` is not written, Java inserts it automatically.

---

## instance block 
- `instance` block is a block of code that executes every time an object of a class is created, before the constructor runs. 
- It is used to perform common initialization logic for all constructors.

**Example**
```java
class Demo {
    {
        System.out.println("Instance block executed");
    }
    Demo() {
        System.out.println("Constructor executed");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}

// Output
Instance block executed
Constructor executed
Instance block executed
Constructor executed
```

---