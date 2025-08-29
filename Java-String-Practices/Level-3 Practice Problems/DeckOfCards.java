import java.util.*;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        for (int i=0;i<deck.length;i++) {
            int r = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) return new String[0][0];
        int cardsPerPlayer = n/players;
        String[][] res = new String[players][cardsPerPlayer];
        int index=0;
        for (int i=0;i<players;i++) {
            for (int j=0;j<cardsPerPlayer;j++) {
                res[i][j] = deck[index++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distributeCards(deck,n,players);
        if (distributed.length==0) {
            System.out.println("Cannot distribute cards equally");
        } else {
            for (int i=0;i<distributed.length;i++) {
                System.out.println("Player "+(i+1)+":");
                for (String card: distributed[i]) System.out.println(card);
                System.out.println();
            }
        }
    }
}
