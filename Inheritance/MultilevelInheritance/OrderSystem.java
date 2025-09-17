package Inheritance.MultilevelInheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String trackingNumber) {
        super(id, date);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order shipped. Tracking No: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String trackingNumber, String deliveryDate) {
        super(id, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "15-Sep-2025", "TR12345", "17-Sep-2025");
        System.out.println(order.getOrderStatus());
    }
}
