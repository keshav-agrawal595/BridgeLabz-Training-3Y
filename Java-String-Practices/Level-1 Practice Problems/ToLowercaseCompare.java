import java.util.Scanner;
public class ToLowercaseCompare {
    public static String toLowerCustom(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') res += (char)(c + 32);
            else res += c;
        }
        return res;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res1 = toLowerCustom(s);
        String res2 = s.toLowerCase();
        System.out.println(compareStrings(res1, res2));
    }
}
