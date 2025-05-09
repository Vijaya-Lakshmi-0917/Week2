interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle1 {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle1(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

class Car1 extends Vehicle1 implements GPS {
    private String currentLocation;

    public Car1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Bike1 extends Vehicle1 implements GPS {
    private String currentLocation;

    public Bike1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Auto1 extends Vehicle1 implements GPS {
    private String currentLocation;

    public Auto1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion8 {
    public static void calculateFareForVehicle(Vehicle1 vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            gpsVehicle.updateLocation("Location: Chennai");
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
        }
    }

    public static void main(String[] args) {
        Vehicle1 car = new Car1("C001", "Abc", 10);
        Vehicle1 bike = new Bike1("B001", "Abx", 5);
        Vehicle1 auto = new Auto1("A001", "Xyz", 7);

        calculateFareForVehicle(car, 15);
        calculateFareForVehicle(bike, 10);
        calculateFareForVehicle(auto, 20);
    }
}