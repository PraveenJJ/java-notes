# Loops in Java

## `for` loop
- Executes a logic multiple times until condition becomes false.

**Execution flow:**
- Initialization runs once.
- Condition is checked.
- If true, loop body executes.
- Update expression runs.
- Condition checked again.
- Loop stops when condition becomes false.

**Syntax**
```java
for(initialization; condition; update) {
    // code to execute
}
```

**Example**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

---

## `while` loop
- A while loop keeps running until its condition becomes false.

**Steps of execution:**
- The condition is evaluated first.
- If the condition is true, the loop body executes.
- After execution, the condition is checked again.
- This repeats until the condition becomes false.

**Syntax**
```java
while(condition) {
    // code to execute
}
```

**Example**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

---

## `do-while` loop
- Executes the logic first, and then checks the condition.

**Execution flow:**
- Loop body executes.
- Condition is evaluated.
- If the condition is true, the loop runs again.
- If the condition is false, the loop stops.

**Syntax**
```java
do {
    // code to execute
} while(condition);
```

**Example**
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}
```

---

## `break` and `continue` in loops

- A loop will normally execute all the iterations sequentially.
- In scenarios where we need to stop the loop early or skip certain iterations we use `break` and `continue`.
- `break`
  - Stops the loop completely.
  - Exits the loop.
- `continue`
  - Skips the current iteration.
  - Loop continues with the next iteration.

**Example**
```java
public class BreakExample {
    public static void main(String[] args) {
        // Stop loop when number equals 5
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
        
        // Skip number 5
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

---