import java.util.Scanner;

class Q9_BasicCalculator {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) { return (double)a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println(add(a, b)); break;
            case 2: System.out.println(subtract(a, b)); break;
            case 3: System.out.println(multiply(a, b)); break;
            case 4: System.out.println(divide(a, b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
