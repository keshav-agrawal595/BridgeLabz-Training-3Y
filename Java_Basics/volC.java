package Java_Basics;
import java.util.*;

public class volC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        int radius = scanner.nextInt();
        System.out.print("Enter height of cylinder: ");
        int height = scanner.nextInt();
        
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of cylinder: %.2f cubic units%n", volume);
        
        scanner.close();
    }
}
