interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number " + vehicleNumber);
        System.out.println("Type " + type);
        System.out.println("Rental Rate " + rentalRate + " per day");
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 50.0;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy " + maskPolicy();
    }

    private String maskPolicy() {
        return insurancePolicy.substring(insurancePolicy.length() - 4);
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 20.0;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy " + maskPolicy();
    }

    private String maskPolicy() {
        return insurancePolicy.substring(insurancePolicy.length() - 4);
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 100.0;
    }

    public double calculateInsurance() {
        return 100.0;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy " + maskPolicy();
    }

    private String maskPolicy() {
        return insurancePolicy.substring(insurancePolicy.length() - 4);
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion3  {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("C101", 70, "CAR168745678");
        Vehicle vehicle2 = new Bike("B202", 30, "BIKE98765432");
        Vehicle vehicle3 = new Truck("T303", 120, "TRUCK45678901");

        vehicle1.displayDetails();
        System.out.println("Rental Cost 5 days " + vehicle1.calculateRentalCost(5));
        if (vehicle1 instanceof Insurable) {
            Insurable insurance = (Insurable) vehicle1;
            System.out.println("Insurance Cost " + insurance.calculateInsurance());
            System.out.println(insurance.getInsuranceDetails());
        }
        System.out.println();

        vehicle2.displayDetails();
        System.out.println("Rental Cost 3 days " + vehicle2.calculateRentalCost(3));
        if (vehicle2 instanceof Insurable) {
            Insurable insurance = (Insurable) vehicle2;
            System.out.println("Insurance Cost " + insurance.calculateInsurance());
            System.out.println(insurance.getInsuranceDetails());
        }
        System.out.println();

        vehicle3.displayDetails();
        System.out.println("Rental Cost 2 days " + vehicle3.calculateRentalCost(2));
        if (vehicle3 instanceof Insurable) {
            Insurable insurance = (Insurable) vehicle3;
            System.out.println("Insurance Cost " + insurance.calculateInsurance());
            System.out.println(insurance.getInsuranceDetails());
        }
    }
}
