import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) digits[i] = numStr.charAt(i) - '0';
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) reversed[i] = digits[digits.length - 1 - i];
        for (int d : reversed) System.out.print(d);
    }
}
