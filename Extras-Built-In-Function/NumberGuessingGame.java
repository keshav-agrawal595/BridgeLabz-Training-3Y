import java.util.*;

class Q1_NumberGuessingGame {
    static int generateGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess, feedback;
        System.out.println("Think of a number between 1 and 100.");
        do {
            guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.println("Enter 1 if high, 2 if low, 3 if correct");
            feedback = sc.nextInt();
            if (feedback == 1) high = guess - 1;
            else if (feedback == 2) low = guess + 1;
        } while (feedback != 3);
        System.out.println("Computer guessed correctly!");
    }
}
