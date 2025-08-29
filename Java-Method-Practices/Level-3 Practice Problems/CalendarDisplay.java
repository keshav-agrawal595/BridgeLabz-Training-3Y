import java.util.*;

public class CalendarDisplay {
    static String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeap(int y) {
        if(y%400==0) return true;
        if(y%100==0) return false;
        return y%4==0;
    }
    public static int getDays(int m,int y) {
        if(m==2 && isLeap(y)) return 29;
        return days[m];
    }
    public static int getFirstDay(int m,int y) {
        int d=1;
        if(m<3) { m+=12; y--; }
        int k=y%100;
        int j=y/100;
        int h=(d + (13*(m+1))/5 + k + k/4 + j/4 + 5*j)%7;
        return (h+6)%7;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("   "+months[m]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd=getFirstDay(m,y);
        for(int i=0;i<fd;i++) System.out.print("    ");
        int nd=getDays(m,y);
        for(int d=1;d<=nd;d++) {
            System.out.printf("%3d ",d);
            if((fd+d)%7==0) System.out.println();
        }
    }
}
