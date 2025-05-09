interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - discount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    private double discountRate;

    public Electronics(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    public double calculateTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "Tax rate for Electronics: 15";
    }
}

class Clothing extends Product implements Taxable {
    private double discountRate;

    public Clothing(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    public double calculateTax() {
        return getPrice() * 0.10;
    }

    public String getTaxDetails() {
        return "Tax rate for Clothing: 10";
    }
}

class Groceries extends Product {
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion2 {
    public static void main(String[] args) {
        Product product1 = new Electronics(1, "Smartphone", 800, 0.10);
        Product product2 = new Clothing(2, "shirt", 25, 0.15);
        Product product3 = new Groceries(3, "Milk", 3, 0.05);

        product1.displayProductDetails();
        System.out.println("Final Price: " + product1.calculateFinalPrice());
        if (product1 instanceof Taxable) {
            System.out.println(((Taxable) product1).getTaxDetails());
        }
        System.out.println();

        product2.displayProductDetails();
        System.out.println("Final Price: " + product2.calculateFinalPrice());
        if (product2 instanceof Taxable) {
            System.out.println(((Taxable) product2).getTaxDetails());
        }
        System.out.println();

        product3.displayProductDetails();
        System.out.println("Final Price: " + product3.calculateFinalPrice());
        if (product3 instanceof Taxable) {
            System.out.println(((Taxable) product3).getTaxDetails());
        }
        System.out.println();
    }
}