import java.util.*;

public class BonusCalculation {
    public static int[][] generateData(int n) {
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++) {
            arr[i][0]=10000+(int)(Math.random()*90000);
            arr[i][1]=1+(int)(Math.random()*10);
        }
        return arr;
    }
    public static double[][] calculate(int[][] arr) {
        double[][] res=new double[arr.length][2];
        for(int i=0;i<arr.length;i++) {
            double bonus=arr[i][1]>5?0.05*arr[i][0]:0.02*arr[i][0];
            res[i][0]=arr[i][0]+bonus;
            res[i][1]=bonus;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr=generateData(10);
        double[][] res=calculate(arr);
        double sumOld=0,sumNew=0,totalBonus=0;
        System.out.println("Salary\tYears\tNewSalary\tBonus");
        for(int i=0;i<arr.length;i++) {
            sumOld+=arr[i][0];
            sumNew+=res[i][0];
            totalBonus+=res[i][1];
            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+res[i][0]+"\t"+res[i][1]);
        }
        System.out.println("Old Sum: "+sumOld+" New Sum: "+sumNew+" Total Bonus: "+totalBonus);
    }
}
