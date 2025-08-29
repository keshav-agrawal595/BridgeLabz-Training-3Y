import java.util.*;

public class UniqueCharacters {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static char[] getUniqueChars(String s) {
        int n = getLength(s);
        char[] result = new char[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = c;
        }
        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = getUniqueChars(text);
        for (char c : unique) System.out.print(c + " ");
    }
}
