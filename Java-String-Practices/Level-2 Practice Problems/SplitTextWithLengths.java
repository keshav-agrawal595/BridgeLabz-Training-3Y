import java.util.Scanner;
public class SplitTextWithLengths {
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
    public static String[][] wordWithLengths(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitText(s);
        String[][] result = wordWithLengths(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}
