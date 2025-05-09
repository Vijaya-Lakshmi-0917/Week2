class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity + " passengers");
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Bike extends Vehicle {
    private String engineType;

    public Bike(int maxSpeed, String fuelType, String engineType) {
        super(maxSpeed, fuelType);
        this.engineType = engineType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car(180, "Petrol", 5);
        Truck truck = new Truck(120, "Diesel", 10);
        Bike bike = new Bike(150, "Petrol", "V-Twin");

        System.out.println("\nCar Info:");
        car.displayInfo();

        System.out.println("\nTruck Info:");
        truck.displayInfo();

        System.out.println("\nMotorcycle Info:");
        bike.displayInfo();
    }
}