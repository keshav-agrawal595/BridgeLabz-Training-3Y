import java.util.Scanner;
public class Friends3AgeHeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        int ageAmar = sc.nextInt(), heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt(), heightAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt(), heightAnthony = sc.nextInt();
      
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) System.out.println("Amar is youngest");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");
      
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) System.out.println("Amar is tallest");
        else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
      
    }
}
