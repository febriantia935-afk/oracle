public class TestVehicle {
    public static class Vehicle {
        public static final String MAKE = "Unknown";
        public static int numVehicles = 0;

        private final String model;

        public Vehicle(String model) {
            this.model = model;
            numVehicles++;
        }

        @Override
        public String toString() {
            return model;
        }
    }

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}