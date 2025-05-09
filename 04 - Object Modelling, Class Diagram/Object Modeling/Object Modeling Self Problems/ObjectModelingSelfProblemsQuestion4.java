import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name  = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println( name + " "+ price  );
    }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order "+ orderId);
        for (Product p : products) {
            p.display();
        }
        System.out.println();
    }
}
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order " + order.getOrderId());
    }

    public void showOrders() {
        System.out.println("Orders for " + name );
        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}
public class ObjectModelingSelfProblemsQuestion4 {
    public static void main(String[] args) {
        Product phone = new Product("Smartphone", 699.99);
        Product laptop = new Product("Laptop", 999.99);
        Product charger = new Product("Charger", 19.99);
        Customer Abc = new Customer("Abc");
        Order order1 = new Order();
        order1.addProduct(phone);
        order1.addProduct(charger);
        Abc.placeOrder(order1);
        Order order2 = new Order();
        order2.addProduct(laptop);
        Abc.placeOrder(order2);
        System.out.println();
        Abc.showOrders();
    }
}