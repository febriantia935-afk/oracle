import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
        System.out.print("Apakah Anda valedictorian/salutatorian? (true/false): ");
        boolean topRank = reader.nextBoolean();
        System.out.print("Jumlah siswa di sekolah Anda: ");
        int jumlahSiswa = reader.nextInt();
        System.out.print("GPA: ");
        double gpa = reader.nextDouble();
        System.out.print("Skor SAT: ");
        int sat = reader.nextInt();

        if ((topRank && jumlahSiswa >= 1400)
                || (gpa >= 4.0 && sat >= 1100)
                || (gpa >= 3.5 && sat >= 1300)
                || (gpa >= 3.0 && sat >= 1500)) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Maaf, Anda belum memenuhi syarat penerimaan.");
        }
        }
    }
}