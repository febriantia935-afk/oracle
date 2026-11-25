public class GalToLitTest {

    static double toLiters(double gallons) {
        return gallons * 3.785;
    }

    public static void main(String[] args) {
        // Cara 1: nilai yang hasilnya sudah diketahui (1 galon = 3,785 liter)
        System.out.println("Cara 1 - 1 galon      : " + toLiters(1) + " (harus 3.785)");

        // Cara 2: hitung manual lalu bandingkan (10 x 3,785 = 37,85)
        double manual = 37.85;
        double hasil = toLiters(10);
        System.out.println("Cara 2 - 10 galon     : " + hasil + " (manual " + manual + ")");
        System.out.println("         selisih kecil dari manual? " + (Math.abs(hasil - manual) < 0.0001));

        // Cara 3: nilai batas (0 galon harus 0 liter)
        System.out.println("Cara 3 - 0 galon      : " + toLiters(0) + " (harus 0.0)");
    }
}