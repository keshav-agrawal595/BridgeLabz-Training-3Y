package Java_Basics;
import java.util.*;

public class dist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int kilometers = scanner.nextInt();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers+ "kilometers is equal to : "+miles+"miles");
        scanner.close();
    }
}
