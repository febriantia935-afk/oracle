import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double berat = reader.nextDouble();

        System.out.println("Pilih planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Pilihan (1-7): ");
        int pilihan = reader.nextInt();

        String planet;
        double faktor;
        switch (pilihan) {
            case 1: planet = "Mercury"; faktor = 0.38; break;
            case 2: planet = "Venus";   faktor = 0.91; break;
            case 3: planet = "Mars";    faktor = 0.38; break;
            case 4: planet = "Jupiter"; faktor = 2.36; break;
            case 5: planet = "Saturn";  faktor = 0.92; break;
            case 6: planet = "Uranus";  faktor = 0.89; break;
            case 7: planet = "Neptune"; faktor = 1.13; break;
            default:
                System.out.println("Pilihan tidak valid.");
                reader.close();
                return;
        }
        System.out.printf("Your weight on %s is %.1f lbs.%n", planet, berat * faktor);
        reader.close();
    }
}