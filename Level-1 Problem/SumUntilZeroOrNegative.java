import java.util.Scanner;
public class SumUntilZeroOrNegative{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        double total = 0, value;
      
        while (true) {
            value = sc.nextDouble();
            if (value <= 0) break;
            total += value;
        }
        System.out.println(total);
      
    }
}
