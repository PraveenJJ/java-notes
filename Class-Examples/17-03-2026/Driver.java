class Parent {
    public void assets() { 
        System.out.println("Gold, Silver, Land, House"); 
    }

    public void marry() { 
        System.out.println("Marry only relative girl"); 
    }
}

class Child extends Parent {
    @Override
    public void marry() { 
        System.out.println("I will marry Samantha"); 
    }
}

public class Driver {
    public static void main(String[] args) {
        Child c = new Child();
        c.marry();

        Parent c1 = new Child();
        c1.marry();
    }
}