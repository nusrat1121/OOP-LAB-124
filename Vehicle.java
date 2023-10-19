package com.mycompany.mavenproject2;
// Vehicle.java
// Parent class Vehicle

public class Vehicle {
   
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
} 

package com.mycompany.mavenproject2;

  // Car.java
// Child class Car
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

package com.mycompany.mavenproject2;

    // Main.java
// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive(); // Output: Repairing a vehicle
        car.drive(); // Output: Repairing a car
    }
}





