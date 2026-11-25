import java.util.Random;

public class Deck {
    Card[] cardArray = new Card[52];
    int next = 0; // indeks kartu berikutnya yang akan dibagikan

    Deck() { // constructor
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++)
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(cardCount);
                cardCount++;
            }
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++)
            System.out.println(cardArray[i]);
    }

    // Soal 7a: mengacak deck (Fisher-Yates)
    public void shuffle() {
        Random rand = new Random();
        for (int i = cardArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        next = 0;
    }

    public Card deal() {
        return cardArray[next++];
    }
}