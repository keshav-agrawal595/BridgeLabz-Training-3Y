import java.util.Scanner;
public class ShortestLongestWord {
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
    public static String[] findShortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = Integer.parseInt(arr[0][1]);
        String minWord = arr[0][0], maxWord = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) {
                min = len;
                minWord = arr[i][0];
            }
            if (len > max) {
                max = len;
                maxWord = arr[i][0];
            }
        }
        return new String[]{minWord, maxWord};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitText(s);
        String[][] arr = wordWithLengths(words);
        String[] res = findShortestLongest(arr);
        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
}
