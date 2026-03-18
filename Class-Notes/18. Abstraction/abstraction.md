# Abstraction in Java

## Definition
- Abstraction in Java is the concept of hiding implementation details and exposing only essential functionality to the user. 
- It allows developers to focus on what an object does rather than how it does it. 
- In Java, abstraction is primarily achieved using abstract classes and interfaces.

---

## Why Abstraction Exists
- Reduces complexity
    - Users interact with simple interfaces rather than internal logic.
- Improves maintainability
    - Internal implementation can change without affecting users.
- Promotes loose coupling
    - Code depends on contracts (interfaces) rather than implementations.

---

## Example

```java
interface PaymentGateway {
    void processPayment(double amount);
}

class VisaGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Visa");
    }
}

class MastercardGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using Mastercard");
    }
}

class GatewayFactory {
    public static PaymentGateway getGateway() {
        String type = Config.getPaymentGatewayType();

        if (type.equals("visa")) {
            return new VisaGateway();
        } else if (type.equals("mastercard")) {
            return new MastercardGateway();
        } else {
            throw new IllegalArgumentException("Invalid gateway type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = GatewayFactory.getGateway();
        // calling via interface - 100% abstraction
        paymentGateway.processPayment(100);
    }
}
```

---