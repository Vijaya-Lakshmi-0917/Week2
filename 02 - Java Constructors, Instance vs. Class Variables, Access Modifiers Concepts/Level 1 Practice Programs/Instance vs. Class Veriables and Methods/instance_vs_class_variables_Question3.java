class Vehicle {
    private String ownerName;
    private String vehicleType;
    static double registrationFee=3500;
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(registrationFee);
    }
    public static void updateRegistrationFee(double updatedRegistrationFee){
        registrationFee= updatedRegistrationFee;
    }
    public static void main(String[] args) {
        Vehicle vehicle1= new Vehicle("Abc", "Scooter");
        Vehicle vehicle2= new Vehicle("Xyz", "Car");
        System.out.println("Vehicle registration fee before fee updation");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(4000);
        System.out.println("Vehicle registration fee after fee updation");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}