import java.util.Scanner;
public class StudentVoting {
    public static int[] randomAges(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=(int)(Math.random()*90+10);
        return arr;
    }
    public static String[][] canVote(int[] ages) {
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0) res[i][1]="false";
            else if(ages[i]>=18) res[i][1]="true";
            else res[i][1]="false";
        }
        return res;
    }
    public static void display(String[][] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] ages=randomAges(n);
        String[][] res=canVote(ages);
        display(res);
    }
}
