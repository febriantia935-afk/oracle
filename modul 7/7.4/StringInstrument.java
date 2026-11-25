public class StringInstrument {
    private int numStrings;

    public StringInstrument(String name, double basePrice, boolean onSale, int numStrings) {
        this.numStrings = numStrings;
    }

    public int getNumStrings() { return numStrings; }
}