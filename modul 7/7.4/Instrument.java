public class Instrument {
    private String name;
    private double basePrice;
    private boolean onSale;

    public Instrument(String name, double basePrice, boolean onSale) {
        this.name = name;
        this.basePrice = basePrice;
        this.onSale = onSale;
    }

    public String getName() { return name; }
    public boolean isOnSale() { return onSale; }
    public void setOnSale(boolean onSale) { this.onSale = onSale; }

    // jika onSale, harga 15% lebih murah
    public double getPrice() {
        if (onSale) {
            return basePrice * 0.85;
        }
        return basePrice;
    }

    // diskon karyawan 25% = 75% dari harga awal
    public double getEmployeePrice() {
        return basePrice * 0.75;
    }
}