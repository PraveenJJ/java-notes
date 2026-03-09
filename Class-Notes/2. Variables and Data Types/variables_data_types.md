# Variables and Data Types

## Primitive Data Types
- Primitive data types in Java are built-in data types that are used to store values directly in memory and not in objects.
- There are 8 primitive data types in Java, and they are categorized into 3 main groups:
- **Numeric (6)**
  - byte
  - short
  - int
  - long
  - float
  - double
- **Character (1)**
  - char
- **Boolean (1)**
  - boolean

---

## Type Casting
- Type casting in Java is the process of converting a value from one primitive data type to another.
- Java supports 2 types of primitive type casting
  - Implicit Type Casting (Widening)
  - Explicit Type Casting (Narrowing)

### Implicit Type Casting (Widening)
- Implicit Type Casting converts a smaller data type to a larger data type automatically. 
- There is no risk of data loss.

**Hierarchy**
```
byte → short → int → long → float → double
```

**Example**
```
public class Test {
    public static void main(String[] args) {
        int num = 10;
        double value = num; // implicit type casting
        System.out.println(value); // output: 10.0
    }
}
```

### Explicit Type Casting (Narrowing)
- Explicit Type Casting converts a larger data type to a smaller data type 
- It must be done explicitly using a cast operator, because data loss may occur.

**Example**

```
public class Test {
    public static void main(String[] args) {
        double num = 10.75;
        int value = (int) num;   // explicit type casting
        System.out.println(value); // output: 10
    }
}
```

---

## Variable Scope

- It refers to the region of a program where a variable can be accessed.
- There are 3 main scopes in Java
  - Local variables
  - Instance variables
  - Static variables

### Local Variables
- Local variables are declared inside a method, constructor, or block and are accessible only within that block.

### Instance Variables
- Instance variables are declared inside a class but outside methods, and each object of the class gets its own copy.

### Static Variables
- Static variables are declared using the static keyword and belong to the class rather than individual objects.


**Example**
```
public class Example {

    // static variable
    static int staticVar = 10; 

    // instance variable  
    int instanceVar = 20;        

    void display() {

        // local variable
        int localVar = 30;       

        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(staticVar);

    }
}
```

---

## Constants in Java
- A constant is a variable whose value cannot be changed once it is assigned. 
- **final** keyword is used to declare a variable as a constant, which prevents reassignment of the variable after initialization.

```
public class Example {
    public static void main(String[] args) {
        final int MAX_USERS = 100;

        System.out.println(MAX_USERS);

        MAX_USERS = 200;  // Compilation error
    }
}
```

---