import java.util.Scanner;
public class SumNaturalCompareFor { 
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        if (n >= 0) {
            int formula = n * (n + 1) / 2;
            int sum = 0;
          
            for (int i = 1; i <= n; i++) sum += i;
          
            System.out.println("Formula sum: " + formula);
            System.out.println("For loop sum: " + sum);
            System.out.println("Both equal? " + (formula == sum));
          
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
