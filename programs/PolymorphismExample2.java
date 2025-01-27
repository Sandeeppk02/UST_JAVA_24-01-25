class Vehicle {
    void fuelEfficiency() {
        System.out.println("Generic Vehicle Efficiency");
    }
}

class Car extends Vehicle {
    void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 15 km/l");
    }
}

class Bike extends Vehicle {
    void fuelEfficiency() {
        System.out.println("Bike Fuel Efficiency: 40 km/l");
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.fuelEfficiency();

        vehicle = new Bike();
        vehicle.fuelEfficiency();
    }
}
