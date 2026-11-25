public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor 1: tanpa parameter
    public Shape() {
        numSides = 0;
        regular = false;
    }

    // Constructor 2: dengan parameter
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter dan setter
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