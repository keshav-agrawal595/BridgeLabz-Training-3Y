import java.util.Scanner;
class Q12_ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        String res = sentence.replaceAll(oldWord, newWord);
        System.out.println("Modified Sentence: " + res);
    }
}
