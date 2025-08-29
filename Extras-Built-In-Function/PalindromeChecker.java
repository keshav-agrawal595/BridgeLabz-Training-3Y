import java.util.Scanner;

class Q5_PalindromeChecker {
    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
