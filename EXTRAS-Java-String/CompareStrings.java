import java.util.Scanner;
class Q8_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int minLen = Math.min(s1.length(), s2.length());
        int res = 0;
        for (int i=0; i<minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                res = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (res == 0) res = s1.length() - s2.length();
        if (res < 0) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (res > 0) System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else System.out.println("Both are equal");
    }
}
