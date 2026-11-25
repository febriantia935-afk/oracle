import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double b = in.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double h = in.nextDouble();

        // 1.0 / 2 (bukan 1 / 2) supaya tidak terjadi pembagian integer = 0
        double luas = (1.0 / 2) * b * h;

        System.out.println("Luas segitiga = " + luas);
        in.close();
    }
}