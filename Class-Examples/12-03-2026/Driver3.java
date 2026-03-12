public class Driver3 {

    String name;

    static String company;

    static {
        System.out.println("Inside static block");
        company = "NTT";
    }

    {
        System.out.println("Inside instance block");
    }

    Driver3() {
        System.out.println("Inside constructor");
    }

    public void driveInnova() {
        System.out.println("Inside Driver Innova method");
        driveCreta();
    }

    public void driveCreta() {
        System.out.println("Inside Driver Creta method");
    }

    public static void main(String[] args) {
        System.out.println(company);
        company = "UPS";
        System.out.println(company);
        System.out.println("Inside main method");
        System.out.println("Before creating object");
        Driver3 d3 = new Driver3();
        System.out.println("After creating object");
        d3.driveInnova();
    }
}
