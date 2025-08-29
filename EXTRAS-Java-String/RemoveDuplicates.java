import java.util.Scanner;
class Q4_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (res.indexOf(c) == -1) res += c;
        }
        System.out.println("Modified: " + res);
    }
}
