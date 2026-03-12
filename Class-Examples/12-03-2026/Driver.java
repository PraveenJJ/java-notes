class Employee {
    int id;          // field
    String name;     // field

    Employee(int id, String name) {   // constructor
        this.id = id;
        this.name = name;
    }

    void display() {   // method
        System.out.println(id + " " + name);
    }
}

public class Driver {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "John"); // object creation
        e1.display();
        
    }
}