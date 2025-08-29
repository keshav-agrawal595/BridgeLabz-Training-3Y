import java.util.*;

public class FrequencyASCII {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        String[][] res = new String[s.length()][2];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                res[index][0] = String.valueOf(c);
                res[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }
        return Arrays.copyOf(res, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] r : result) System.out.println(r[0] + " " + r[1]);
    }
}
