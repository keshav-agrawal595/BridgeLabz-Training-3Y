import java.util.*;

public class BMIProgram {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            double bmi = weight / (height * height);
            String status = "";
            if (bmi < 18.4) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 39.9) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(data);
        display(result);
    }
}
