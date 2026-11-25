import java.util.Scanner;

public class MatrixMenu {
    static Scanner reader = new Scanner(System.in);

    static int[][] bacaMatriks(String nama) {
        System.out.print("Jumlah baris matriks " + nama + ": ");
        int baris = reader.nextInt();
        System.out.print("Jumlah kolom matriks " + nama + ": ");
        int kolom = reader.nextInt();
        int[][] m = new int[baris][kolom];
        System.out.println("Masukkan isi matriks " + nama + " per baris:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                m[i][j] = reader.nextInt();
            }
        }
        return m;
    }

    static void tampilkan(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] tambah(int[][] a, int[][] b) {
        int[][] h = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                h[i][j] = a[i][j] + b[i][j];
        return h;
    }

    static int[][] kurang(int[][] a, int[][] b) {
        int[][] h = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                h[i][j] = a[i][j] - b[i][j];
        return h;
    }

    static int[][] kali(int[][] a, int[][] b) {
        int[][] h = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    h[i][j] += a[i][k] * b[k][j];
        return h;
    }

    static boolean sudahDiisi(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Matriks A dan B harus diisi dulu (pilih a dan b).");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] A = null;
        int[][] B = null;
        char pilihan;

        do {
            System.out.println();
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Character.toLowerCase(reader.next().charAt(0));

            switch (pilihan) {
                case 'a':
                    A = bacaMatriks("A");
                    break;
                case 'b':
                    B = bacaMatriks("B");
                    break;
                case 'c':
                    if (sudahDiisi(A, B)) {
                        if (A.length != B.length || A[0].length != B[0].length)
                            System.out.println("Ukuran A dan B harus sama untuk dijumlahkan.");
                        else
                            tampilkan(tambah(A, B));
                    }
                    break;
                case 'd':
                    if (sudahDiisi(A, B)) {
                        if (A.length != B.length || A[0].length != B[0].length)
                            System.out.println("Ukuran A dan B harus sama untuk dikurangkan.");
                        else
                            tampilkan(kurang(A, B));
                    }
                    break;
                case 'e':
                    if (sudahDiisi(A, B)) {
                        if (A[0].length != B.length)
                            System.out.println("Jumlah kolom A harus sama dengan jumlah baris B.");
                        else
                            tampilkan(kali(A, B));
                    }
                    break;
                case 'f':
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 'f');
    }
}