import java.util.Scanner;

public class BusPlanner {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Jumlah orang yang mendaftar: ");
            int orang = in.nextInt();

            int bus = orang / 45;       // bus hanya dipakai jika terisi penuh (45 orang)
            int naikVan = orang % 45;   // sisanya naik van

            System.out.println("Jumlah bus yang diperlukan: " + bus);
            System.out.println("Jumlah orang yang naik van: " + naikVan);
        }
    }
}