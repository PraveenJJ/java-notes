# Inheritance in Java

## Definition
- Inheritance is a concept where one class acquires the properties (fields) and behaviors (methods) of another class. 
- The class that inherits is called the child (subclass).
- The class being inherited is called the parent (superclass). 
- Inheritance promotes code reusability.
- `extends` keyword is used to achieve inheritance.

**Syntax**
```java
class ChildClass extends ParentClass {

}
```

**Example**
```java
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat(); // Animal eats
        d.bark(); // Dog barks
    }
}
```

---

## Types of Inheritances in Java

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- Multiple Inheritance

---

### Single Inheritance
- One child class inherits from one parent class

**Example**
```java
class A {
    void display() { }
}

class B extends A {

}
```

---

### Multilevel Inheritance
- A class inherits from a class that is already a `subclass`.

**Example**
```java
class A {
    void display() { }
}

class B extends A {

}

class C extends B {

}
```

---

### Hierarchical Inheritance
- Multiple classes inherit from one parent class.

**Example**
```java
class Animal {
    void eat() { }
}

class Dog extends Animal { 

}

class Cat extends Animal { 

}
```

---

### Multiple Inheritance
- Java does not support multiple inheritance using `classes` to `avoid ambiguity problems`.
- However, Java allows multiple inheritance using `interfaces`.

**Example**
```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}
```

---

## `super` keyword usage
- Used to
  - Access parent methods
  - Access parent variables

**Example**
```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();
        System.out.println("Dog eats");
    }
}

// Output
Animal eats
Dog eats
```

---

## `super()` call usage - constructor chaining
- When a subclass object is created, the parent class constructor is executed first, followed by the child class constructor. 
- This chaining is achieved using the `super()`.

**Example**
```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

// Output
Animal constructor
Dog constructor
```

---

### Constructor Chaining with Parameterized Constructors
- If the parent class has only parameterized constructors, the child must explicitly call super(parameters).
- If super(parameters) is not written, the program will not compile.
- Java cannot call a default constructor that does not exist.

**Example**
```java
class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
        System.out.println("Dog constructor");
    }
}

// Main method
Dog d = new Dog();

// Output
Animal type: Dog
Dog constructor
```

---