package Java_Basics;
import java.util.*;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time period (in years): ");
        double time = sc.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is :"+simpleInterest);
        
        sc.close();
    }
}
