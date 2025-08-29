import java.util.*;

public class FrequencyUnique {
    public static char[] uniqueChars(String s) {
        char[] arr = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) if (s.charAt(i) == s.charAt(j)) unique = false;
            if (unique) arr[index++] = s.charAt(i);
        }
        return Arrays.copyOf(arr, index);
    }

    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] r : result) System.out.println(r[0] + " " + r[1]);
    }
}
