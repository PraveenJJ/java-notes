# Wrapper Classes in Java

## `Primitive` vs `Wrapper`

- Primitive types are basic data types that store values directly in memory.
  - eg: `int, double, char`
- Wrapper classes are object representations of these primitive types
  - eg: `Integer, Double, Character`

### Why do we need Wrapper classes?
- Java being object oriented programming language, it expects objects in all places, since primitive types are not objects, this created a need to wrap them up in objects.
  - eg: Collections like `ArrayList, HashMap` store only objects, primitives cannot be used.
- For every primitive data type we have an object representation in Wrapper classes, thereby solving above problem.

---

## Autoboxing
- Autoboxing in Java is the automatic conversion of a `primitive data type` into its corresponding `wrapper class object` by the `Java compiler`.

**Example**
```java
int num = 10;
Integer obj = num;   // Autoboxing
```

### Why do we need Autoboxing?
- Developers had to manually convert primitive to wrapper objects, this made code verbose.

**Example**
```java
// before autoboxing
Integer obj = Integer.valueOf(10);

// after autoboxing
Integer obj = 10; // java compiler will internally call the valueOf() method for us.

```

## Unboxing
- Unboxing in Java is the automatic conversion of a `wrapper class object` into its corresponding `primitive data type` by the `java compiler`.

**Example**
```java
Integer obj = 10;
int num = obj;   // Unboxing
```

### Why do we need Unboxing?
- Java collections and APIs often use wrapper classes, but many operations require primitive values.
- Without unboxing, developers would need to manually extract the primitive value every time.

**Example**
```java
// before autoboxing
Integer obj = 10;
int value = obj.intValue();

// after autoboxing
Integer obj = 10;
int value = obj; // java compiler will internally call the intValue() method for us.
```

---

## Parsing Values
- Converting a `String` representation of a `number` into its corresponding `primitive data type`.
- We use static methods present in wrapper classes such as `Integer.parseInt()`, `Double.parseDouble()` etc...


**Example**
```java
// Without parsing
String a = "10";
String b = "20";
System.out.println(a + b); // 1020


// With parsing
int c = Integer.parseInt(a);
int d = Integer.parseInt(b);
System.out.println(c + d); // 30
```

---