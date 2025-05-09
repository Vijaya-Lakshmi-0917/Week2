import java.util.Scanner;
class MobilePhone {
    String brand;
    String model;
    double price;
    public void  details(String brand, String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void display() {
        System.out.println("The brand of the mobile is "+brand);
        System.out.println("The model of the mobile is "+model);
        System.out.println("The price of the mobile is "+price);
    }
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand of the mobile");
        String brand = sc.nextLine();
        System.out.println("Enter the model of the mobile");
        String model = sc.nextLine();
        System.out.println("Enter the price of the mobile");
        double price = sc.nextDouble();
        mobilePhone.details(brand, model, price);
        mobilePhone.display();
    }
}
