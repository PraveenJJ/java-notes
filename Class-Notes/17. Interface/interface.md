# Interface in Java

## Definition
- Interface is nothing but a `Software Requirement Specification`.
- It is a `contract` between the `client` & `service provider`.
- 100% Abstraction can be achieved using Interfaces.
- Interface defines only method signatures (abstract methods), child class should `implement` the interface and provide the implementation for all the abstract methods.
- Interface specifies what a class should do, but not how it should do.
- `Methods` inside interface are `public` & `abstract`
- `Variables` inside interface are `public` & `static` & `final`

```java
interface Sample {
    void methodOne(); // public & abstract
}

class SampleImpl implements Sample {
    @Override
    public void methodOne() { // public
        System.out.println("Method One Implementation");
    }
}

// Inside main method
Sample sample = new SampleImpl();
sample.methodOne();
```

---

## `extends` and `implements`

```java
// 1 class extends 1 class
class A extends B {

}

// 1 interface extends 1 interface
interface X extends Y {

}

// 1 interface extends multiple interfaces
interface X extends Y, Z {

}

// 1 class implements 1 interface
class A implements X {

}

// 1 class implements multiple interfaces
class A implements X, Y {

}

// 1 class extends 1 class & implements 1 interface
class A extends B implements X, Z {

}
```

---

## Variables inside Interface

- Variable declaration inside interface is permitted
- Variables inside interface are by default public, static, final

```java
interface Remote {
    int MIN_VOLUME = 0; // public, static, final
    int MAX_VOLUME = 100; // public, static, final
}

class Television implements Remote {
    void methodOne {
        MIN_VOLUME = 45; // CE: cannot assign a value to final variable MIN_VOLUME
    }
}
```

---

## Method Name Conflicts in Interfaces

```java
interface A {
    void methodOne();
}

interface B {
    void methodOne();
}

class X implements A, B {
    @Override
    oid methodOne() { // Compilation successful
    }
}

// ----------------------------------------

interface A {
    void methodOne();
}

interface B {
    void methodOne(int i);
}

class X implements A, B {
    @Override 
    void methodOne() { // Compilation Successful - Method overloading for class X

    }

    @Override
    void methodOne(int i) { // Compilation Successful - Method overloading for class X
        
    }
}

// ----------------------------------------

interface A {
    void methodOne();
}

interface B {
    int methodOne();
}

class X implements A, B {
    @Override 
    int methodOne() { // Compilation Error

    }
}

```

---

## Variable conflicts in Interfaces

```java
interface A {
    int MIN_VOLUME = 0;
}

interface B {
    int MIN_VOLUME = 100;
}

public class Demo implements A, B {
    public static void main(String[] args) {
        System.out.println(MIN_VOLUME); // CE: Ambigous call

        // Legal way to access variables - using Interface names
        System.out.println(A.MIN_VOLUME);
        System.out.println(B.MIN_VOLUME);
    }
}
```

---

## Marker Interface

- An interface without any abstract methods is called `Marker` Interface.
- Class implementing such interfaces will get special ability.
- This special ability is given by `JVM` to the class objects during runtime. 
- This is because `JVM` is customized to provide that ability to any class that implements such `Marker` Interfaces.
- Eg: Cloneable
  - Class implementing Cloneable interface, will get the ability of cloning
- Eg: Serializable
  - Class implementing Serializable interface, will get the ability to serialize the objects over the network.

---

## Adapter Class

- A simple java class which implements an interface and gives empty implementation for all the abstract methods.
- Any class that directly implements an interface will have to take the burden of providing implementation for all abstract methods. This is solved by using adapter class.
- Instead of giving implementation for all methods, through adapter class we give implementation only for the required methods.
- This promotes readability and maintainability.
- Adapter classes are made abstract, since it provides empty implementation for all methods, it would no sense to create objects for it.

```java
interface Sample {
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
    void m6();
    void m7();
}

abstract class AdapterX implements Sample {
    void m1() {}
    void m2() {}
    void m3() {}
    void m4() {}
    void m5() {}
    void m6() {}
    void m7() {}
}

class SampleImpl extends AdapterX {
    @Override
    void m1() {
        System.out.println("Implementation for m1 method");
    }
}
```

---

## Thumb rule
```
interface (specification)
   |
abstract (partial implementation)
   |
 class (full implementation)
```

---

## Constructor in interface

- Interfaces do not have constructors
- All variables inside interface are public, static, final. 
- There are no instance variables that would need initialization.
- Hence no need for a constructor.

---

## Java 8 Features in Interface

### Default Methods in Interface

- Introduced in Java 8
- Used to provide default implementation for a method in an interface
- Can be overridden by the implementing class

```java
interface Sample {
    void m1();

    default void m2() {
        System.out.println("Default implementation for m2 method");
    }
}

class SampleImpl implements Sample {
    @Override
    void m1() {
        System.out.println("Implementation for m1 method");
    }
}
```

---

### Static Methods in Interface

- Introduced in Java 8
- Used to provide utility methods in an interface
- Cannot be overridden by the implementing class

```java
interface Sample {
    void m1();

    static void m2() {
        System.out.println("Static implementation for m2 method");
    }
}

class SampleImpl implements Sample {
    @Override
    void m1() {
        System.out.println("Implementation for m1 method");
    }
}

public static void main(String[] args) {
    Sample sample = new SampleImpl();
    sample.m1(); // Implementation for m1 method

    // Call static method using interface name
    Sample.m2(); // Static implementation for m2 method
}
```

---

### Private Methods in Interface

- Introduced in Java 9
- Used to provide utility methods in an interface
- Cannot be overridden by the implementing class

```java
interface Sample {
    void m1();

    default void m2() {
        m3();
    }

    private void m3() {
        System.out.println("Private implementation for m3 method");
    }
}

class SampleImpl implements Sample {
    @Override
    void m1() {
        System.out.println("Implementation for m1 method");
    }
}

public static void main(String[] args) {
    Sample sample = new SampleImpl();
    sample.m1(); // Implementation for m1 method
    sample.m2(); // Calls m3() internally
}
```

---