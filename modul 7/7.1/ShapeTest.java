public class ShapeTest {
    private static class Shape {
        private int numSides;
        private boolean regular;

        public Shape() {
            this.numSides = 0;
            this.regular = false;
        }

        public Shape(int numSides, boolean regular) {
            this.numSides = numSides;
            this.regular = regular;
        }

        public int getNumSides() {
            return numSides;
        }

        public void setNumSides(int numSides) {
            this.numSides = numSides;
        }

        public boolean isRegular() {
            return regular;
        }

        public void setRegular(boolean regular) {
            this.regular = regular;
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(3, true);

        System.out.println("s1: sisi = " + s1.getNumSides() + ", beraturan = " + s1.isRegular());
        System.out.println("s2: sisi = " + s2.getNumSides() + ", beraturan = " + s2.isRegular());

        s1.setNumSides(4);
        s1.setRegular(true);
        System.out.println("s1 setelah diubah: sisi = " + s1.getNumSides() + ", beraturan = " + s1.isRegular());
    }
}