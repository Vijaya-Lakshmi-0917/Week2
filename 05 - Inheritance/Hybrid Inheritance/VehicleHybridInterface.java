interface Refuelable {
    void refuel();
}

class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }
}

public class VehicleHybridInterface {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle petrolVehicle = new PetrolVehicle(180, "Toyota Corolla");

        electricVehicle.displayInfo();
        electricVehicle.charge();
        System.out.println();

        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
    }
}
