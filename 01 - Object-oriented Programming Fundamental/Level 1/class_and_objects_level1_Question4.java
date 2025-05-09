import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;
    public double calculate(int quantity){
       double totalPrice=price*quantity;
       return totalPrice;
    }
    public void display(double totalPrice){
        System.out.println(" the item code is "+itemCode);
        System.out.println(" the item name is "+itemName);
        System.out.println(" the price of item per unit is "+price);
        System.out.println(" the total price of the item for the given quantity is "+totalPrice);
    }
    public static void main(String[] args){
        Item item= new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item name" );
        item.itemName= sc.nextLine();
        System.out.println("Enter the item code" );
        item.itemCode= sc.nextInt();
        System.out.println("Enter the item price" );
        item.price= sc.nextDouble();
        System.out.println("Enter quantity" );
        int quantity= sc.nextInt();
        double totalPrice= item.calculate(quantity);
        item.display(totalPrice);
    }
}
