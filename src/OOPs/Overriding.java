package OOPs;

// Creating a parent class.
class Vehicle {
    // Defining a method
   void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike extends Vehicle {
    // Defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        Vehicle bike2 = new Bike();
        bike2.run();
    }
}
