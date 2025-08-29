import java.util.*;

public class PalindromeCheck {
    public static boolean checkIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean checkRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return checkRecursive(s, i + 1, j - 1);
    }

    public static boolean checkArray(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = s.charAt(arr.length - 1 - i);
        return Arrays.equals(arr, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(checkIterative(text));
        System.out.println(checkRecursive(text, 0, text.length() - 1));
        System.out.println(checkArray(text));
    }
}
