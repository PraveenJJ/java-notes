# Encapsulation in Java

## Definition
- Encapsulation in Java is the process of wrapping data (variables) and methods (functions) together into a single unit (class)
- Thereby restricting direct access to the data.
- This is achieved by 
  - Declaring variables as `private`
  - Providing public `getter` methods to read values
  - Providing public `setter` methods to modify values
- Encapsulation helps achieve data hiding and improves security and maintainability of code.

**Example**
```java
class Employee {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Praveen");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
```

**Real-world example**
```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {

        if(amount > 0) {
            balance += amount;
        }

    }

    public double getBalance() {
        return balance;
    }
}

// Usage
BankAccount acc = new BankAccount();
acc.balance = -1000; // Before encapsulation
acc.deposit(500); // After encapsulation

```

---