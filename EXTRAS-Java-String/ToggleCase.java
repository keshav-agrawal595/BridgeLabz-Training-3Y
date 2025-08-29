import java.util.Scanner;
class Q7_ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) res += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) res += Character.toUpperCase(c);
            else res += c;
        }
        System.out.println("Toggled: " + res);
    }
}
