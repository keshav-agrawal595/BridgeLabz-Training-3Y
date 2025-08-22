import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0;
        int index = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            arr[index++] = num;
        }
        for (int i = 0; i < index; i++) total += arr[i];
        System.out.println("The total value is " + total);
    }
}
