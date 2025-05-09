public class Vehicle {
    static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
    public static void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The object is not a Vehicle.");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Abc", "Car", "TN-01-AB-1234");
        Vehicle vehicle2 = new Vehicle("Xyz", "Bike", "KA-12-XY-5678");
        displayVehicleDetails(vehicle1);
        System.out.println();
        displayVehicleDetails(vehicle2);
        System.out.println();
        updateRegistrationFee(5500.0);
        System.out.println();
        displayVehicleDetails(vehicle1);
        System.out.println();
        String notAVehicle = "string";
        displayVehicleDetails(notAVehicle);
    }
}
