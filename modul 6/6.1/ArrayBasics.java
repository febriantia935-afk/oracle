public class ArrayBasics {
    public static void main(String[] args) {
        // Soal A: array satu dimensi score, int, 9 nilai
        int[] score = new int[9];

        // Soal B: array dua dimensi price, float, 10 baris 3 kolom
        float[][] price = new float[10][3];

        // Soal 1: matrix long 4 baris x 3 kolom, semua nilai 5
        long[][] matrix = new long[4][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 5;
            }
        }

        // Soal 2: array byte values berukuran 10, semua nilai 1
        byte[] values = new byte[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        // Soal 3
        System.out.println("Soal 3:");
        int num[] = {7, 7, 6, 6, 5, 5, 4, 4};
        for (int i = 0; i < 8; i = i + 2)
            System.out.print(num[i]);
        System.out.println();

        // Soal 4
        System.out.println("Soal 4:");
        int[][] num2 = {{3, 3, 3}, {2, 2, 2}};
        int[] array = {4, 3, 2};
        for (int i = 0; i < 3; i++) {
            num2[1][i] = num2[0][i] + array[i];
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }

        // bukti ukuran array
        System.out.println("score.length = " + score.length);
        System.out.println("price: " + price.length + " baris, " + price[0].length + " kolom");
        System.out.println("matrix[3][2] = " + matrix[3][2]);
        System.out.println("values[9] = " + values[9]);
    }
}