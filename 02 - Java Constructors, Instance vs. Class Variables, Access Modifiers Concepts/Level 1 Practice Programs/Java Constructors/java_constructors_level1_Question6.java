import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rent;
    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.rent=400;
    }
    public void display(){
        System.out.println("Name of the customer: "+customerName);
        System.out.println("car model: "+carModel);
        System.out.println("Number of rental days: "+rentalDays);
        System.out.println("The total cost of the rent is: "+rentalDays*rent);
    }

    public static void main(String[] args) {
        CarRental carRental1= new CarRental("Abc", "hyundai i10",4);
        CarRental carRental2= new CarRental("Xyz", "i20",2);
        carRental1.display();
        carRental2.display();
    }
}
