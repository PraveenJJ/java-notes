interface Sample {
    void m1();

    default void m2() {
        System.out.println("default method from interface");
        m3();
    }

    private void m3() {
        System.out.println("Private implementation for m3 method");
    }
}

class SampleImpl implements Sample {
    @Override
    public void m1() {
        System.out.println("Implementation for m1 method");
    }
}

public class Driver1 {
    public static void main(String[] args) {
        Sample sample = new SampleImpl();

        sample.m1(); // Implementation for m1 method

        sample.m2(); // Calls m3() internally
    }
}

