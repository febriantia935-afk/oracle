public class MusicStoreTest {
    public static class Guitar {
        private final String name;
        private final double price;
        private final boolean electric;
        private final boolean employee;

        public Guitar(String name, double price, boolean electric, boolean employee) {
            this.name = name;
            this.price = price;
            this.electric = electric;
            this.employee = employee;
        }

        public String getName() {
            return name;
        }

        public int getNumStrings() {
            return electric ? 6 : 6;
        }

        public boolean isElectric() {
            return electric;
        }

        public double getPrice() {
            return price;
        }

        public double getEmployeePrice() {
            return employee ? price * 0.9 : price;
        }
    }

    public static void main(String[] args) {
        Guitar g1 = new Guitar("Gitar Akustik", 1000.00, false, false);
        Guitar g2 = new Guitar("Gitar Listrik", 2000.00, true, true);

        for (Guitar g : new Guitar[] {g1, g2}) {
            System.out.println(g.getName() + " (" + g.getNumStrings() + " senar)"
                    + (g.isElectric() ? ", listrik" : ", akustik"));
            System.out.printf("  Harga toko    : %.2f%n", g.getPrice());
            System.out.printf("  Harga karyawan: %.2f%n", g.getEmployeePrice());
        }
    }
}