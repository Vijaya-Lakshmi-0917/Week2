public class Product {
    static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount);
    }
    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = (total * discount) / 100;
        return total - discountAmount;
    }
    public static void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Price: " + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Discount: " + discount );
            System.out.println("Total Price After Discount: " + product.calculateTotalPrice());
        } else {
            System.out.println("The object provided is not a Product.");
        }
    }
    public static void main(String[] args) {
        Product product1 = new Product(1001, "Laptop", 100000.0, 1);
        Product product2 = new Product(1002, "Headphones", 200.0, 2);

        displayProductDetails(product1);
        System.out.println();
        displayProductDetails(product2);
        System.out.println();
        updateDiscount(15.0);
        System.out.println();
        displayProductDetails(product1);
        System.out.println();
        String notAProduct = "its a string";
        displayProductDetails(notAProduct);
    }
}