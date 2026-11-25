public class BooleanTable {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        boolean true_false;

        true_false = (j < 5);                    System.out.println("(j<5)                     = " + true_false);
        true_false = (j > 3);                    System.out.println("(j>3)                     = " + true_false);
        true_false = (j < i);                    System.out.println("(j<i)                     = " + true_false);
        true_false = (i < 5);                    System.out.println("(i<5)                     = " + true_false);
        true_false = (j <= 5);                   System.out.println("(j<=5)                    = " + true_false);
        true_false = (6 < 6);                    System.out.println("(6<6)                     = " + true_false);
        true_false = (i != j);                   System.out.println("(i!=j)                    = " + true_false);
        true_false = (i == j || i < 50);         System.out.println("(i==j || i<50)            = " + true_false);
        true_false = (i == j && i < 50);         System.out.println("(i==j && i<50)            = " + true_false);
        true_false = (i > j || true_false && j >= 4); System.out.println("(i>j || tf && j>=4)       = " + true_false);
        true_false = (!(i < 2 && j == 5));       System.out.println("(!(i<2 && j==5))          = " + true_false);
        true_false = !true_false;                System.out.println("!true_false               = " + true_false);
    }
}