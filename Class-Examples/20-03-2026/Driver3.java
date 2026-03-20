public class Driver3 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    // @ Retry ( 3 times only )
    public static void m3() {
        System.out.println("Hello World");
        System.out.println(10/0);
        try {

        } catch(Exception e) {
            // refreshToken()
        }
    }
}
