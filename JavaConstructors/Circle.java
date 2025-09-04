// Program to create a Circle class using constructor chaining
class Circle {
    double radius;

    Circle() {
        this(1.0);  // calling parameterized constructor
    }

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Default Circle Area: " + c1.area());
        System.out.println("Circle with radius 5 Area: " + c2.area());
    }
}
