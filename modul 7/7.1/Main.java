import java.util.Scanner;

public class Main {
    static class Card {
        int suit;
        int face;
        int points;

        Card(int suit, int face) {
            this.suit = suit;
            this.face = face;
            if (face == 1) {
                this.points = 11;
            } else if (face >= 10) {
                this.points = 10;
            } else {
                this.points = face;
            }
        }

        @Override
        public String toString() {
            String suitName;
            switch (suit) {
                case 1:
                    suitName = "Spade";
                    break;
                case 2:
                    suitName = "Heart";
                    break;
                case 3:
                    suitName = "Diamond";
                    break;
                default:
                    suitName = "Club";
            }

            String faceName;
            if (face == 1) {
                faceName = "Ace";
            } else if (face == 11) {
                faceName = "Jack";
            } else if (face == 12) {
                faceName = "Queen";
            } else if (face == 13) {
                faceName = "King";
            } else {
                faceName = Integer.toString(face);
            }
            return faceName + " of " + suitName;
        }
    }

    static Card kartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        Card[] hand = new Card[5];
        int jumlah = 0;
        int total = 0;

        // Soal 7: dua kartu acak
        hand[jumlah++] = kartuAcak();
        hand[jumlah++] = kartuAcak();
        System.out.println(hand[0]);
        System.out.println(hand[1]);

        // Soal 8a: total poin dua kartu
        total = hand[0].points + hand[1].points;
        System.out.println("Total poin: " + total);

        // Soal 8b dan 8c: tambah kartu sampai > 21, pengguna berhenti, atau 5 kartu
        while (total <= 21 && jumlah < 5) {
            System.out.print("Ambil kartu lagi? (y/n): ");
            String jawab = reader.next();
            if (!jawab.equalsIgnoreCase("y")) {
                break;
            }
            hand[jumlah] = kartuAcak();
            total += hand[jumlah].points;
            jumlah++;

            System.out.println("Kartu di tangan Anda:");
            for (int i = 0; i < jumlah; i++) {
                System.out.println("  " + hand[i]);
            }
            System.out.println("Total poin: " + total);
        }

        if (total > 21) {
            System.out.println("Poin melebihi 21.");
        } else if (jumlah == 5) {
            System.out.println("Hand sudah penuh (5 kartu).");
        }
        reader.close();
    }
}