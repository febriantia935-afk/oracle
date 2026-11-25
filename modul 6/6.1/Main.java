import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner reader = new Scanner(System.in)) {

        // Soal 7a: buktikan deck sudah diacak
        Deck demo = new Deck();
        System.out.println("3 kartu pertama sebelum diacak:");
        for (int i = 0; i < 3; i++) System.out.println("  " + demo.cardArray[i]);
        demo.shuffle();
        System.out.println("3 kartu pertama sesudah diacak:");
        for (int i = 0; i < 3; i++) System.out.println("  " + demo.cardArray[i]);

        // Soal 7b - 7d: permainan melawan dealer
        Deck deck = new Deck();
        deck.shuffle();
        Hand player = new Hand();
        Hand dealer = new Hand();
        player.add(deck.deal());
        player.add(deck.deal());
        dealer.add(deck.deal());
        dealer.add(deck.deal());

        System.out.println();
        System.out.println("Kartu dealer yang terlihat: " + dealer.cards[0]);

        boolean lagi = true;
        while (lagi && !player.isFull() && player.getPoints() <= 21) {
            System.out.println();
            System.out.println("Kartu Anda:");
            player.print();
            System.out.println("Poin Anda: " + player.getPoints());
            System.out.print("Ambil kartu lagi? (y/n): ");
            String jawab = reader.next();
            if (jawab.equalsIgnoreCase("y")) {
                player.add(deck.deal());
            } else {
                lagi = false;
            }
        }

        System.out.println();
        System.out.println("Kartu akhir Anda:");
        player.print();
        int poinPemain = player.getPoints();
        System.out.println("Poin Anda: " + poinPemain);

        if (poinPemain > 21) {
            System.out.println("Anda melebihi 21. Dealer menang.");
            return;
        }

        // Dealer berhenti mengambil kartu jika sudah 16 atau lebih
        while (dealer.getPoints() < 16 && !dealer.isFull()) {
            dealer.add(deck.deal());
        }
        System.out.println();
        System.out.println("Kartu dealer:");
        dealer.print();
        int poinDealer = dealer.getPoints();
        System.out.println("Poin dealer: " + poinDealer);

        if (poinDealer > 21 || poinPemain > poinDealer) {
            System.out.println("Anda menang!");
        } else if (poinPemain == poinDealer) {
            System.out.println("Seri.");
        } else {
            System.out.println("Dealer menang.");
        }
    }
    }

    // Implementasi cadangan agar Main dapat dijalankan tanpa kelas Deck terpisah.
    private static class Deck {
        private static final String[] SUIT_NAMES = {
            "SPADE", "HEART", "DIAMOND", "CLUB"
        };
        private static final String[] RANK_NAMES = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "JACK", "QUEEN", "KING", "ACE"
        };

        public final Object[] cardArray = new Object[52];
        private int nextCard = 0;

        public Deck() {
            int index = 0;
            for (String suit : SUIT_NAMES) {
                for (String rank : RANK_NAMES) {
                    cardArray[index++] = new Card(rank, suit);
                }
            }
        }

        public void shuffle() {
            java.util.Random random = new java.util.Random();
            for (int i = cardArray.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                Object temporary = cardArray[i];
                cardArray[i] = cardArray[j];
                cardArray[j] = temporary;
            }
            nextCard = 0;
        }

        public Object deal() {
            if (nextCard >= cardArray.length) {
                return null;
            }
            return cardArray[nextCard++];
        }
    }

    private static class Card {
        private final String rank;
        private final String suit;

        public Card(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return rank + " OF " + suit;
        }
    }

    // Implementasi cadangan agar Main dapat dijalankan walau Hand belum tersedia
    // sebagai kelas terpisah.
    private static class Hand {
        private static final int MAKSIMAL_KARTU = 5;
        private final Object[] cards = new Object[MAKSIMAL_KARTU];
        private int jumlah = 0;

        public void add(Object card) {
            if (!isFull() && card != null) {
                cards[jumlah++] = card;
            }
        }

        public boolean isFull() {
            return jumlah >= MAKSIMAL_KARTU;
        }

        public int getPoints() {
            int total = 0;
            int jumlahAs = 0;

            for (int i = 0; i < jumlah; i++) {
                String nilai = namaKartu(cards[i]);
                if (nilai.equals("ACE") || nilai.equals("AS") || nilai.equals("A")) {
                    jumlahAs++;
                    total += 11;
                } else if (nilai.matches(".*\\b(?:10|JACK|QUEEN|KING|J|Q|K|10 OF)\\b.*")) {
                    total += 10;
                } else {
                    try {
                        java.util.regex.Matcher angka = java.util.regex.Pattern
                                .compile("\\d+").matcher(nilai);
                        if (angka.find()) {
                            int angkaNilai = Integer.parseInt(angka.group());
                            if (angkaNilai >= 2 && angkaNilai <= 10) {
                                total += angkaNilai;
                            }
                        }
                    } catch (NumberFormatException e) {
                        // Abaikan nilai kartu yang tidak dikenali.
                    }
                }
            }

            while (total > 21 && jumlahAs > 0) {
                total -= 10;
                jumlahAs--;
            }
            return total;
        }

        private String namaKartu(Object card) {
            String nama = card.toString().toUpperCase();

            if (card instanceof Card) {
                nama = ((Card) card).getRank().toUpperCase() + " " + nama;
            } else {
                for (String methodName : new String[]{"getRank", "getValue", "getName"}) {
                    try {
                        java.lang.reflect.Method method = card.getClass().getMethod(methodName);
                        Object value = method.invoke(card);
                        if (value != null) {
                            nama = value.toString().toUpperCase() + " " + nama;
                            break;
                        }
                    } catch (Exception e) {
                        // Coba nama metode berikutnya.
                    }
                }
            }
            return nama;
        }

        public void print() {
            for (int i = 0; i < jumlah; i++) {
                System.out.println("  " + cards[i]);
            }
        }
    }
}