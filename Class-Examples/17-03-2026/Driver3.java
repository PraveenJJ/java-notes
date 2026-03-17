class Animal {
    public void sleep() {
        System.out.println("animal - sleep method");
    }

    public Number legsCount() {
        System.out.println("animal - legsCount method");
        return null;
    }

    private void sample1() {

    } 

    public final void sample2() {

    }

    protected void sample3() {

    }
}

class Dog extends Animal {

    @Override
    public void sleep() {
        System.out.println("child - sleep method");
    }

    // specialized method
    public void bark() {
        System.out.println("child - bark method");
    }

    // @Override
    public void swim() {
        System.out.println("child - swim method");
    }

    @Override
    public Integer legsCount() {
        System.out.println("child - legsCount method");
        return null;
    }

    private void sample1() {

    }

    // @Override
    // public final void sample2() {

    // }

    @Override
    public void sample3() {

    }
}

public class Driver3 {
    public static void main(String[] args) {
        
    }
}
