class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order shipped";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderStatus() {
        return "Order delivered";
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderMultilevelInheritance {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder("Order7361", "2025-04-18", "Track 3456", "2025-04-20");
        deliveredOrder.displayInfo();
    }
}







