import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double a = reader.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double b = reader.nextDouble();
        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char op = reader.next().charAt(0);

        double hasil;
        if (op == '*') {
            hasil = a * b;
        } else if (op == '+') {
            hasil = a + b;
        } else if (op == '/') {
            hasil = a / b;
        } else if (op == '%') {
            hasil = a % b;
        } else if (op == '-') {
            hasil = a - b;
        } else {
            reader.close();
            System.out.println("Operator tidak valid.");
            return;
        }
        System.out.println(a + " " + op + " " + b + " = " + hasil);
        reader.close();
    }
}