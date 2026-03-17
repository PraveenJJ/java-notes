class Animal {

}

class Dog extends Animal {

}

public class Driver2 {
    public void eat(Animal a) { 
        System.out.println("eat method with animal arg");
    }
    public void eat(Dog d) {
        System.out.println("eat method with dog arg");
    }

    public static void main(String[] args) {
        Driver2 demo = new Driver2();

        Animal a1 = new Animal();
        demo.eat(a1); // Animal arg method
        System.out.println();
        Dog d1 = new Dog();
        demo.eat(d1); // Dog arg method
        System.out.println();
        Animal a2 = new Dog();
        demo.eat(a2); // Animal arg method
    }

}