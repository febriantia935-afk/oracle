public class AnimalTest {
    static class Animal {
        private int speed;

        public Animal() {
            this(0, 0, 0);
        }

        public Animal(int speed, int endurance, int age) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();           // constructor tanpa parameter
        Animal animal2 = new Animal(80, 5, 3);   // constructor dengan 3 parameter

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}
