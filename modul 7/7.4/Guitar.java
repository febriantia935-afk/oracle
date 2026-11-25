public class Guitar {
    private String name;
    private double basePrice;
    private boolean onSale;
    private boolean electric;
    private int numberOfStrings = 6;

    public Guitar(String name, double basePrice, boolean onSale, boolean electric) {
        this.name = name;
        this.basePrice = basePrice;
        this.onSale = onSale;
        this.electric = electric;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public boolean isOnSale() { return onSale; }
    public boolean isElectric() { return electric; }
    public int getNumberOfStrings() { return numberOfStrings; }
}