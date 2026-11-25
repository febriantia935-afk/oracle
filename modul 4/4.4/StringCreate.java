public class StringCreate {
    public static void main(String[] args) {
        // Cara 1: literal String
        String myString = "abc";

        // Cara 2: operator new
        String myString2 = new String("abc");

        // Cara 3: dari array char
        char[] huruf = {'a', 'b', 'c'};
        String myString3 = new String(huruf);

        System.out.println(myString + " " + myString2 + " " + myString3);
    }
}