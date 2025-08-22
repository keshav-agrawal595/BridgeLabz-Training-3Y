import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), power = sc.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1, counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
