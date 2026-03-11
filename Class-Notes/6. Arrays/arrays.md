# Arrays in Java

## Definition
- Arrays are fixed-size data structures 
- They can store multiple values of the same data type and 
- Data can be accessed zero-based indexing.

## Ways to create an array

### Declaration with memory
```java
int[] numbers = new int[5];
```

### Declaration with Initialization
```java
int[] numbers = {1, 2, 3, 4, 5};
```

## Using new with Initialization
```java
int[] numbers = new int[] {1, 2, 3, 4, 5};
```

---

## Traversing an array

```java
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```

---