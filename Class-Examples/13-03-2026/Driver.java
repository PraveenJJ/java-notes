class Animal {
    String color = "blue";

    Animal(String color) {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal - eat() method");
    }
}

class Dog extends Animal {

    Dog() {
        // super();
        super("red");
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println(super.color);
        super.eat();
        System.out.println("Dog - bark() method");
    }
}

public class Driver {
    public static void main(String[] args) {
       Dog d = new Dog();
    //    d.bark();
    }
}