import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double[] nilai = new double[5];
        double total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + " (0-100): ");
            nilai[i] = reader.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
        reader.close();
    }
}