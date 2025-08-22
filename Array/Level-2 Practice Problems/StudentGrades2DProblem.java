import java.util.Scanner;

public class StudentGrades2DProblem{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Please enter a positive value for all subjects.");
                i--;
                continue;
            }
            
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
