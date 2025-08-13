package Java_Basics;

import java.util.Scanner;

public class areaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle is: %.2f", area);
        sc.close();
    }
}
