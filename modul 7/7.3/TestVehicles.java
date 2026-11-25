public class TestVehicles {
    public static class Vehicles {
        public static String MAKE = "Unknown";
        public static int numVehicles;

        private String make;
        private final String model;

        public Vehicles(String model) {
            this.make = MAKE;
            this.model = model;
            numVehicles++;
        }

        public void setMake(String make) {
            this.make = make;
        }

        @Override
        public String toString() {
            return make + " " + model;
        }
    }

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicles.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicles.numVehicles);

        Vehicles vehicle1 = new Vehicles("Vision");
        System.out.println(vehicle1);

        Vehicles vehicle2 = new Vehicles("Edict");
        System.out.println(vehicle2);

        vehicle2.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println("Number of vehicles manufactured: " + Vehicles.numVehicles);
    }
}