interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public void applyDiscount(double percent) {
        discount = percent;
        double discountedPrice = getPrice() - (getPrice() * percent / 100);
        setPrice(discountedPrice);
    }

    public String getDiscountDetails() {
        return "Veg Discount: " + discount + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        return baseTotal + (baseTotal * 0.10);
    }

    public void applyDiscount(double percent) {
        discount = percent;
        double discountedPrice = getPrice() - (getPrice() * percent / 100);
        setPrice(discountedPrice);
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount + "%";
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion6 {
    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());
        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            discountable.applyDiscount(10);
            System.out.println(discountable.getDiscountDetails());
            System.out.println("Total after discount: " + item.calculateTotalPrice());
        }
        System.out.println("----");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Vegetable Biryani", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}