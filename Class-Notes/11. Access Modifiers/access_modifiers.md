# Access Modifiers

## Definition
- Access modifiers in Java control the visibility and accessibility of classes, variables, methods, and constructors.
- They define where a member can be accessed from, such as within the same class, package, subclass, or from anywhere.
- Java provides four access modifiers: `public`, `protected`, `default`, `private`.

---

| Modifier      | Same Class | Same Package | Subclass (Different Package) | Other Classes |
| ------------- | ---------- | ------------ | ---------------------------- | ------------- |
| **public**    | Yes        | Yes          | Yes                          | Yes           |
| **protected** | Yes        | Yes          | Yes                          | No            |
| **default**   | Yes        | Yes          | No                           | No            |
| **private**   | Yes        | No           | No                           | No            |

---

## `static` usage in Java
- `static` keyword is used to indicate that a member belongs to the class rather than to individual objects. 
- Members can be variable, method, block, nested class.
- Static members are shared among all instances of the class & can be accessed without creating an object.

---

### static variables

- `static variable` belongs to the class, not the object. 
- All objects share the same value.

**Example**
```java
class Employee {
    static String company = "Google";
}

// Usage
System.out.println(Employee.company); // accessed using class name
```

---

### static methods
- `static method` belongs to the class.
- They can be called without creating an object.

**Example**
```java
class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

// Usage
System.out.println(MathUtil.square(5)); // accessed using class name
```

---

### static block
- static block is executed once when the class is loaded into memory.
- It is used to initialize static variables

**Example**
```java
class Demo {
    static {
        System.out.println("Static block executed");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}

// Output
Static block executed

```

---

### Static vs Non-Static Members
| Feature         | Static           | Non-Static               |
| --------------- | ---------------- | ------------------------ |
| Belongs to      | Class            | Object                   |
| Memory          | One shared copy  | Separate copy per object |
| Access          | ClassName.member | object.member            |
| Object required | No               | Yes                      |

---

## Accessibility Rules

### static access
- `static block` can access `static variables`
- `static method` can access `static variables`
- `static block` cannot access `non-static variables`
- `static method` cannot access `non-static variables`

### non-static access
- `non-static block` can access `static variables`
- `non-static method` can access `static variables`
- `non-static block` can access `non-static variables`
- `non-static method` can access `non-static variables`

---

## Control flow

### Static control flow
- Initializing static variables to default values
- Assigning values to static variables
- Execution of static block
- Execution of main method

**Example**
```java
class Test {

    static int x = 10;

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

}
```

**Explanation**
```
Class loading
   ↓
x initialized
   ↓
Static Block
   ↓
main()
```

---

### Non-static control flow
- Initializing non-static variables to default values
- Assigning values to non-static variables
- Execution of non-static block
- Execution of constructor

**Example**
```java
class Test {
    int x = 10;

    {
        System.out.println("Instance Block");
    }

    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test();
    }
}
```

**Explanation**
```
Class loading (static control flow happens first)
   ↓
Object creation (instance control flow starts here)
   ↓
Memory is allocated   
   ↓
x initialized
   ↓
Instance Block
   ↓
Constructor
```

---