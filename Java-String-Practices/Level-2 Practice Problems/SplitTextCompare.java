import java.util.Scanner;
public class SplitTextCompare {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] splitText(String s) {
        int len = getLength(s);
        int spaces = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces];
        int start = 0, index = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || s.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) w += s.charAt(j);
                words[index++] = w;
                start = i + 1;
            }
        }
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr1 = splitText(s);
        String[] arr2 = s.split(" ");
        System.out.println(compareArrays(arr1, arr2));
    }
}
