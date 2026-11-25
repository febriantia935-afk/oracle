import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan pertama: ");
            double a = reader.nextDouble();
            System.out.print("Masukkan bilangan kedua: ");
            double b = reader.nextDouble();
            System.out.print("Masukkan operator (*, +, /, %, -): ");
            char op = reader.next().charAt(0);

            double hasil;
            switch (op) {
                case '*':
                    hasil = a * b;
                    break;
                case '+':
                    hasil = a + b;
                    break;
                case '/':
                    hasil = a / b;
                    break;
                case '%':
                    hasil = a % b;
                    break;
                case '-':
                    hasil = a - b;
                    break;
                default:
                    System.out.println("Operator tidak valid.");
                    return;
            }
            System.out.println(a + " " + op + " " + b + " = " + hasil);
        }
    }
}