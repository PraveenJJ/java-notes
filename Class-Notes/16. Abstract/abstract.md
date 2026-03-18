# Abstract in Java

## Definition
- `abstract` refers to incomplete.
- `abstract` modifier can be applied to classes and methods, but cannot be applied to variables.
- `abstract` methods will only have signature, but no implementation. This is used in scenarios where we cannot provide implementation right away.
- If a class contains at the least 1 `abstract` method, then it is mandatory to mark the class as `abstract` as well.
- Marking a class as `abstract` means that class is incomplete and cannot be instantiated.
- Marking a class `abstract` doesn't necessarily mean it should have abstract methods, a class can be marked `abstract` just to prevent object creation.
- Any class that inherits an `abstract` class must mandatorily override and provide implementation for all abstract methods. Else that class shall be marked as `abstract`.

```java
abstract class Vehicle {
    public abstract int getNoOfWheels();
}

class Car extends Vehicle {
    public int getNoOfWheels() {
        return 4;
    }
}

abstract class Bike extends Vehicle {
    // no implementation provided for abstract method of parent class
}
```
- Benefit of marking a parent class as abstract is that it provides guidelines to child classes about which methods must be mandatorily implemented.

---

## Difference between `abstract` and `final`

- `abstract`
  - Method marked as `abstract` means, it is incomplete & that child class must provide implementation.
  - Class marked as `abstract` means, it is incomplete & cannot be instantiated.
- `final`
  - Method marked as `final` means, it cannot be overriden
  - Class marked as `final` means, it cannot be extended
  - Variables marked as `final` means, it cannot be modified

---

## Constructor in abstract class
- Though we cannot create objects of an abstract class, we still need constructor to initialize the variables in abstract class.

```java
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
```

---