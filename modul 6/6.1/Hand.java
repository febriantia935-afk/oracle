// Soal 7b dan 7c: Hand berisi array 5 referensi Card
public class Hand {
    Card[] cards = new Card[5];
    int count = 0;

    void add(Card c) {
        if (count < cards.length) {
            cards[count] = c;
            count++;
        }
    }

    // Soal 7c: Ace dihitung 11, jika total > 21 maka Ace diturunkan menjadi 1
    int getPoints() {
        int total = 0;
        int aces = 0;
        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].isAce()) aces++;
        }
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }
        return total;
    }

    boolean isFull() {
        return count == cards.length;
    }

    void print() {
        for (int i = 0; i < count; i++)
            System.out.println("  " + cards[i]);
    }
}

// Defines Card for this exercise if Card.java is not present in the project.
class Card {
    int points;
    private final boolean ace;

    Card(int points) {
        this.points = points;
        this.ace = points == 11;
    }

    Card(String rank) {
        this.ace = rank.equalsIgnoreCase("A") || rank.equalsIgnoreCase("Ace");
        if (this.ace) {
            this.points = 11;
        } else if (rank.equalsIgnoreCase("J") || rank.equalsIgnoreCase("Q")
                || rank.equalsIgnoreCase("K") || rank.equalsIgnoreCase("10")) {
            this.points = 10;
        } else {
            this.points = Integer.parseInt(rank);
        }
    }

    boolean isAce() {
        return ace;
    }
}