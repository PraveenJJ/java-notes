public class Driver1 {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1() {
        try {
            System.out.println(10/0); // AE
            return 999;
        } catch (Exception e) { // match found
            return 888; // return called
        } finally { // 1 priority
            return 777;
        }
    }

}

// PaymentController.java
// paymentService.process(..); // NullPointerException --> BusinessException

// PaymentService.java
// process(..); // throwing exception

/// controller, service, exception-> ExceptionHandler -> @ControllerAdvice