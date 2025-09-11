package StaticFinalKeywords;

class Product {
    static double discount = 5.0;   // shared discount %
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + " | Price: " + price + " | Qty: " + quantity + " | Discount: " + discount + "%");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        p1.display();
        Product.updateDiscount(10);
        p1.display();
    }
}
