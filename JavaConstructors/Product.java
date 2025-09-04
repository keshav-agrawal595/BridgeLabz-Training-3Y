// Program to manage product inventory
class Product {
    String productName;
    double price;
    static int totalProducts = 0;   // shared among all products

    Product(String p, double pr) {
        productName = p;
        price = pr;
        totalProducts++;   // increase count whenever a product is created
    }

    // instance method
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
