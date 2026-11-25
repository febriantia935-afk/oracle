import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    // buang spasi dan tanda baca, ubah ke huruf kecil, lalu urutkan hurufnya
    static String bersihkan(String s) {
        String hanyaHuruf = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] huruf = hanyaHuruf.toCharArray();
        Arrays.sort(huruf);
        return new String(huruf);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("String pertama: ");
        String s1 = reader.nextLine();
        System.out.print("String kedua: ");
        String s2 = reader.nextLine();

        if (bersihkan(s1).equals(bersihkan(s2))) {
            System.out.println("Kedua string adalah anagram.");
        } else {
            System.out.println("Kedua string bukan anagram.");
        }

        reader.close();
    }
}