import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pesan = "";
        int jumlah = 0;

        while (jumlah < 10) {
            System.out.print("Masukkan angka ke-" + (jumlah + 1) + ": ");
            int angka = reader.nextInt();
            char huruf;
            switch (angka) {
                case 1: huruf = 'D'; break;
                case 2: huruf = 'W'; break;
                case 3: huruf = 'E'; break;
                case 4: huruf = 'L'; break;
                case 5: huruf = 'H'; break;
                case 6: huruf = 'O'; break;
                case 7: huruf = 'R'; break;
                default:
                    System.out.println("Angka belum terpecahkan, masukkan angka baru.");
                    continue;
            }
            pesan += huruf;
            jumlah++;
        }
        reader.close();
        System.out.println("Pesan: " + pesan);
    }
}