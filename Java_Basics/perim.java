package Java_Basics;
import java.util.*;

public class perim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        
        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();
        
        int perimeter = 2 * (length + width);
        
        System.out.println("Perimeter of rectangle = " + perimeter);
        
        sc.close();
    }
}
