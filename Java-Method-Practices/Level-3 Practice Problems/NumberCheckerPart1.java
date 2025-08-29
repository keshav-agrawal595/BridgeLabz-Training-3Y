import java.util.*;

public class NumberCheckerPart1 {
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
    public static boolean isDuck(int n) {
        int[] d = getDigits(n);
        for(int x : d) if(x == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int p = d.length;
        int sum = 0;
        for(int x : d) sum += Math.pow(x, p);
        return sum == n;
    }
    public static void findLargestTwo(int[] d) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int x : d) {
            if(x > first) {
                second = first;
                first = x;
            } else if(x > second && x != first) {
                second = x;
            }
        }
        System.out.println("Largest: " + first + " Second Largest: " + second);
    }
    public static void findSmallestTwo(int[] d) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int x : d) {
            if(x < first) {
                second = first;
                first = x;
            } else if(x < second && x != first) {
                second = x;
            }
        }
        System.out.println("Smallest: " + first + " Second Smallest: " + second);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = getDigits(n);
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        findLargestTwo(d);
        findSmallestTwo(d);
    }
}
