package ObjectModelling.SelfProblems;

import java.util.*;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println("- " + p.productName + " : " + p.price);
        }
        System.out.println();
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order.");
        o.showOrder();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 700);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        Customer c = new Customer("Keshav");
        c.placeOrder(order);
    }
}
