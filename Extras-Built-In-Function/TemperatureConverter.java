import java.util.Scanner;

class Q8_TemperatureConverter {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for F->C or 2 for C->F:");
        int choice = sc.nextInt();
        double temp = sc.nextDouble();
        if (choice == 1) System.out.println("Celsius: " + toCelsius(temp));
        else System.out.println("Fahrenheit: " + toFahrenheit(temp));
    }
}
