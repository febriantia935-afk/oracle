import java.util.Scanner;

public class PaintBuckets {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Tinggi ruangan (kaki): ");
        double tinggi = reader.nextDouble();
        System.out.print("Panjang ruangan (kaki): ");
        double panjang = reader.nextDouble();
        System.out.print("Lebar ruangan (kaki): ");
        double lebar = reader.nextDouble();
        reader.close();

        // empat dinding + langit-langit (lantai tidak dicat)
        double luas = 2 * (panjang + lebar) * tinggi + panjang * lebar;

        int ember5 = (int) (luas / 1500);              // ember 5 liter (1.500 kaki persegi)
        double sisa = luas - ember5 * 1500;
        int ember1 = (int) Math.ceil(sisa / 300);      // ember 1 liter (300 kaki persegi)

        // 4 ember 1 liter ($16) lebih mahal dari 1 ember 5 liter ($15)
        if (ember1 >= 4) {
            ember5++;
            ember1 = 0;
        }

        int biaya = ember5 * 15 + ember1 * 4;
        System.out.println("Luas yang dicat: " + luas + " kaki persegi");
        System.out.println("Ember 5 liter: " + ember5);
        System.out.println("Ember 1 liter: " + ember1);
        System.out.println("Total biaya: $" + biaya);
    }
}