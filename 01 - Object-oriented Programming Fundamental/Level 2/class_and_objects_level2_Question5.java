import java.util.Scanner;
class CartItem  {
    String itemName="item1";
    double price=20;
    int quantity;
    public int add(int increasedQuantity){
        quantity=quantity+increasedQuantity;
        return quantity;
    }
    public int remove(int decreasedQuantity){
        quantity=quantity-decreasedQuantity;
        return quantity;
    }
    public void display(){
        System.out.println(" the name of the item is: "+itemName);
        System.out.println(" the price per item is: "+price);
        System.out.println(" the total price is: "+price*quantity);
    }
    public static void main(String[] args) {
        CartItem cartItem=new CartItem();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the quantity");
        cartItem.quantity=sc.nextInt();
        System.out.println("to add items enter\"add\" and to remove items enter \" remove\"");
        sc.nextLine();
        String editQuantity= sc.nextLine();
        if(editQuantity.equals("add")){
            System.out.println("Enter the quantity to be increased");
            int increasedQuantity= sc.nextInt();
            cartItem.add( increasedQuantity);
        }
        else if(editQuantity.equals("remove")){
            System.out.println("Enter the quantity to be decresed");
            int decreasedQuantity= sc.nextInt();
            cartItem.remove( decreasedQuantity);
        }
        else{
            System.out.println("No change made to the cart.");
        }
        cartItem.display();
    }
}
