import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        // Soal 2: kode yang sudah diperbaiki (tanpa titik koma setelah for)
        String str = "Hello World!";
        for (int i = 0; i < 4; i++) {
            System.out.println(str);
        }

        // Soal 3: InputMismatchException ditangani dengan try/catch
        System.out.print("Masukkan sebuah angka: ");
        try (Scanner reader = new Scanner(System.in)) {
            int angka = reader.nextInt();
            System.out.println("Angka Anda: " + angka);
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka, bukan huruf.");
        }

        // Soal 4b: logic error (hasil salah, tetapi program tidak error)
        int a = 80, b = 90;
        double rataSalah = a + b / 2;       // 125.0, seharusnya 85.0
        double rataBenar = (a + b) / 2.0;   // 85.0
        System.out.println("Logic error: " + rataSalah + " | Benar: " + rataBenar);

        // Soal 4c: exception ditangani
        int[] arr = new int[3];
        try {
            arr[3] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception tertangani: indeks 3 di luar batas array.");
        }
    }
}