package com.vehicle;

// vehicle.com in the internet
public class Car {

    public int getNoOfWheels() {
        System.out.println("executing getNoOfWheels() inside car");
        return 4;
    }
    
    public static void main(String[] args) {
        System.out.println("inside car main method");
    }

}
