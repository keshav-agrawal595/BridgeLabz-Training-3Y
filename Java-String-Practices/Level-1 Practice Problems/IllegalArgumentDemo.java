import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }
    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // generateException(s);
        handleException(s);
    }
}
