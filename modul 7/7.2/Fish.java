public class Fish {
    // Soal 1: instance variable (nilainya diatur di constructor)
    private String typeOfFish;
    private int friendliness;

    // Soal 2: constructor tanpa argument
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Soal 3: constructor dengan dua argument (overloading constructor)
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Soal 5
    public int getFriendliness() {
        return friendliness;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    // Soal 8: variable argument method (menggantikan versi dua parameter di soal 7)
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (Fish f : fishes) {
            if (f.getFriendliness() > temp.getFriendliness()) {
                temp = f;
            }
        }
        return temp;
    }
}