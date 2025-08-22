import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int p = sc.nextInt();
            System.out.print("Chemistry: ");
            int c = sc.nextInt();
            System.out.print("Maths: ");
            int m = sc.nextInt();
            
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Please enter a positive value for all subjects.");
                i--;
                continue;
            }
            
            phy[i] = p;
            chem[i] = c;
            math[i] = m;
            
            percent[i] = (p + c + m) / 3.0;

            if (percent[i] >= 80) {
                grade[i] = "A";
            } else if (percent[i] >= 70) {
                grade[i] = "B";
            } else if (percent[i] >= 60) {
                grade[i] = "C";
            } else if (percent[i] >= 50) {
                grade[i] = "D";
            } else if (percent[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        System.out.println("\n--- Student Results ---");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f%%, Grade=%s%n",
                              (i + 1), phy[i], chem[i], math[i], percent[i], grade[i]);
        }
    }
  
}
