import java.util.Scanner;
public class VowelConsonantType {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] classify(String s) {
        String[][] res = new String[s.length()][2];
        for (int i=0;i<s.length();i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = checkChar(s.charAt(i));
        }
        return res;
    }
    public static void display(String[][] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = classify(s);
        display(res);
    }
}
