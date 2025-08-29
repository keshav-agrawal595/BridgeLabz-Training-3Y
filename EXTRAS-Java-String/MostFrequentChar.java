import java.util.Scanner;
class Q9_MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0; char res = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) { max = freq[c]; res = c; }
        }
        System.out.println("Most Frequent Character: " + res);
    }
}
