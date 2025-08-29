import java.util.*;

public class NumberCheckerPart2 {
    public static int countDigits(int n) {
        int c = 0;
        while(n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
    public static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for(int i = c-1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }
    public static int sumDigits(int[] d) {
        int s = 0;
        for(int x : d) s += x;
        return s;
    }
    public static int sumSquares(int[] d) {
        int s = 0;
        for(int x : d) s += Math.pow(x,2);
        return s;
    }
    public static boolean isHarshad(int n) {
        int[] d = getDigits(n);
        int s = sumDigits(d);
        return n % s == 0;
    }
    public static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2];
        for(int i=0;i<10;i++) freq[i][0] = i;
        for(int x : d) freq[x][1]++;
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = getDigits(n);
        System.out.println("Sum: " + sumDigits(d));
        System.out.println("Sum of Squares: " + sumSquares(d));
        System.out.println("Harshad: " + isHarshad(n));
        int[][] f = digitFrequency(d);
        for(int i=0;i<10;i++) if(f[i][1]>0) System.out.println(f[i][0] + " -> " + f[i][1]);
    }
}
