import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        double total = 0, val;
      
        while (true) {
            val = sc.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println(total);
      
    }
}
