# Control Flow

## `if` statement in Java

- Checks a condition
- If it evaluates to true
- Then the code inside `if` block will execute.

**Syntax**

```java
if (condition) {
    // code executes if condition is true
}
```

**Example**
```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

---

## `if else` statement in Java

- Checks a condition
- If it evaluates to true
- Then the code inside `if` block will execute.
- If it evaluates to false
- Then the code inside `else` block will execute.

**Syntax**

```java
if (condition) {
    // code executes if condition is true
} else {
    // code executes if condition is false
}
```

**Example**
```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

---

## `else-if` statement in Java

- Used to check multiple conditions sequentially after an `if` statement.
- The `if` condition is evaluated first.
- If it is false, the program checks the next `else if`.
- This continues until a condition becomes true.
- Once a match is found, the corresponding block executes & the remaining conditions are skipped.
- If none match, the optional `else` block executes.

**Syntax**

```java
if (condition1) {
    // executes if condition1 is true
} else if (condition2) {
    // executes if condition2 is true
} else if (condition3) {
    // executes if condition3 is true
} else {
    // executes if none of the conditions are true
}
```

**Example**
```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

## `switch` statement in Java

- The `switch` statement evaluates an expression once.
- Compares the output with different case labels.
- If a match is found, the corresponding block executes. 
- If no case matches, the default block executes.
- The `break` statement stops further execution.
- `switch` provides a cleaner & more readable alternative to nested `if-else-if` conditions.

**Syntax**
```java
switch (expression) {
    case value1:
        // code block
        break;

    case value2:
        // code block
        break;

    default:
        // code block if no case matches
}
```

**Example**
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

### Important Concept: Fall-through
- If `break` is not used
- Execution continues into the next case.

**Example**
```java
int num = 2;

switch (num) {
    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}
```

**Output**
```
Two
Three
```

---

## Ternary Operator in Java

- It evaluates a condition
- If the condition is true, the value before `:` is returned.
- If the condition is false, the value after `:` is returned.
- Used as an alternative to simple `if-else` statements.

**Syntax**
```java
condition ? value_if_true : value_if_false;
```

**Example**
```java
int a = 10;
int b = 20;

// using if-else statement
if(a > b) {
    max = a;
} else {
    max = b;
}
System.out.println(max);

// using ternary operator
int max = (a > b) ? a : b;
System.out.println(max);
```

---

