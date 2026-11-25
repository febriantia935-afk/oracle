public class Animal {
    int weight, height;
    double speed;

    Animal() {
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }

    Animal(int w, int h, int s) {
        weight = w;
        height = h;   // diperbaiki: sebelumnya h = height;
        speed = s;    // diperbaiki: sebelumnya tidak ada titik koma
    }

    public double getTime(double miles) { // mendapatkan jumlah jam untuk menempuh jarak ini
        return miles / speed;
    }

    public int getWeight() { return weight; }
    public int getHeight() { return height; }
    public double getSpeed() { return speed; }
}