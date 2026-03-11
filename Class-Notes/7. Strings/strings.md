# Strings in Java

## Creating strings
### Using literal
```java
String str = "Java";
```

### Using `new` keyword
```java
String str = new String("Java");
```

---

## Common methods in strings

```java
public class CommonMethods {
    public static void main(String[] args) {
        String str = "Programming";
        String data = "Programming";
        String sample = "  Java  ";

        // find the length of a string
        System.out.println(str.length());

        // find the character at a specific index
        System.out.println(str.charAt(1));

        // Compare two strings
        System.out.println(str.equals(data));

        // Compare two strings ignoring case
        System.out.println(str.equalsIgnoreCase(data));

        // Extract part of a string
        System.out.println(str.substring(3)); // starting from index 3, return the rest of the string
        System.out.println(str.substring(3,7)); // starting from index 3, return the rest of the string till index 7

        // Convert the string to uppercase or lowercase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // Removes leading and trailing spaces
        System.out.println(str.trim());

        // Checks if a string contains a substring
        System.out.println(sample.contains("Java"));

        // Replace a character or substring
        System.out.println(sample.replace('J','K'));
    }
}
```

---

## `equals()` vs `==` with strings

- `equals()` compares the values of the strings.
  - whether the characters inside the strings are the same.
- `==` compares memory addresses of the strings.
  - whether both variables refer to the same object in memory


**Example**
```java
public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2); // true - since same object in String Constant Pool
        System.out.println(s1.equals(s2)); // true - since same value


        String s3 = new String("Coding");
        String s4 = new String("Coding");

        System.out.println(s3 == s4); // false - two separate objects in heap, so memory address will be different
        System.out.println(s3.equals(s4)); // true - since same value
    }
}
```

---

## String Constant Pool
- Strings that are created using `literals` gets stored in a space in heap called String Constant Pool.
- Java reuses these strings in the pool to optimize memory.
- Meaning, when a string literal is created, java checks the pool first for the same value & if found, itreuses the existing object else creates a new object.

### Why do we need String Constant Pool?
- Strings are heavily used in Java programs such as:
  - File paths
  - Database queries
  - Configuration values
  - Logging messages

- Without optimization, the JVM would create many duplicate String objects, wasting memory.

- String Constant Pool solves this by reusing identical String literals, which improves:
  - Memory efficiency
  - Performance
  - String comparison speed

---

## Immutability of Strings
- Strings are immutable in java.
- Meaning once a String object is created, its value cannot be changed.
- Any modifications to a string will create a new string object.

**Example**
```java
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str = "Hello";

        // Attempt to modify the string
        str.concat(" World");

        // Printing the string
        System.out.println("Concat without reassignment: " + str);

        // Reassigning the result
        str = str.concat(" World");

        System.out.println("Concat with reassignment: " + str);
    }
}
```

### What is the benefit of String immutability?

- `Security`
  - Strings are used in sensitive areas like:
    - File paths
    - Network connections
    - Database URLs
  - Immutability prevents malicious modification.
- `String Pool Optimization`
  - Java stores Strings in a String Pool to save memory.
- `Thread Safety`
  - Multiple threads can safely share the same String object without synchronization.
- `Hashing`
  - Strings are widely used as keys in HashMap and HashSet.
  - If Strings were mutable, their hash values could change, causing incorrect behavior in hash-based collections.

---

## StringBuilder

- It is mutable, meaning modifications can be done without having to create a new object.
- In scenarios that involve repeated modifications, using Strings will create new object for every modification, causing performance issues. 
- StringBuilder being mutable, solves exactly that, it improves memory efficiency & performance.

**Example**
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming");

System.out.println(sb); // Java Programming
```

---

## Common methods in StringBuilder

```java
public class CommonMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        
        // Append data to a string
        sb.append(" Programming");
        System.out.println(sb); // Java Programming

        // Insert data at a specific index
        sb.insert(4, " Language");
        System.out.println(sb); // Java Language Programming

        // Delete data from a string
        sb.delete(4, 16);
        System.out.println(sb); // Java Programming

        // Replace data in a string
        sb.replace(5, 16, "Language");
        System.out.println(sb); // Java Language

        // Reverse a string
        sb.reverse();
        System.out.println(sb); // egaugnal avaJ
    }
}
```

---

## StringBuffer
- It is mutable, meaning modifications can be done without having to create a new object.
- In scenarios that involve repeated modifications, using Strings will create new object for every modification, causing performance issues. 
- StringBuffer being mutable, solves exactly that, it improves memory efficiency & performance.

**Important Note:** StringBuffer is thread-safe because its methods are `synchronized`.
- Meaning it is safe for multiple threads to modify the same object.

**Example**
```java
public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append data to a string
        sb.append(" World");

        // Insert data at a specific index
        sb.insert(5, ",");

        System.out.println(sb); // Hello, World
    }
}
```

---