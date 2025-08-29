import java.util.Scanner;
class Q10_RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        String res = "";
        for (char c : str.toCharArray()) if (c != ch) res += c;
        System.out.println("Modified String: " + res);
    }
}
