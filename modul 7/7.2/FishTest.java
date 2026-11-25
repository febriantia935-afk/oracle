public class FishTest {
    static class Fish {
        private String typeOfFish;
        private int friendliness;

        public Fish() {
            this.typeOfFish = "Unknown";
            this.friendliness = 0;
        }

        public Fish(String typeOfFish, int friendliness) {
            this.typeOfFish = typeOfFish;
            this.friendliness = friendliness;
        }

        public String getTypeOfFish() {
            return typeOfFish;
        }

        public int getFriendliness() {
            return friendliness;
        }

        public static Fish nicestFish(Fish... fishes) {
            if (fishes == null || fishes.length == 0) {
                return new Fish();
            }

            Fish nicest = fishes[0];
            for (Fish fish : fishes) {
                if (fish != null && fish.getFriendliness() > nicest.getFriendliness()) {
                    nicest = fish;
                }
            }
            return nicest;
        }
    }

    public static void main(String[] args) {
        // Soal 6
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);

        // Soal 9: uji nicestFish dengan ikan dari soal 6
        Fish terbaik = Fish.nicestFish(amber, james);
        String nama = (terbaik == amber) ? "Amber" : "James";
        System.out.println("Ikan paling ramah: " + nama + " (" + terbaik.getTypeOfFish()
                + ", keramahan " + terbaik.getFriendliness() + ")");

        // Bukti variable argument: boleh lebih dari dua ikan
        Fish unknown = new Fish();
        Fish tiga = Fish.nicestFish(unknown, james, amber);
        System.out.println("Dengan 3 ikan, yang terbaik: " + tiga.getTypeOfFish());

        // constructor tanpa argument
        System.out.println("Fish() -> " + unknown.getTypeOfFish() + ", keramahan " + unknown.getFriendliness());
    }
}