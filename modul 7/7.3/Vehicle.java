public class Vehicle {
    // static variable
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // instance variable
    private String chassisNo;
    private String model;

    // constructor
    public Vehicle(String model) {
        numVehicles++;                       // inkremen static variable
        chassisNo = "ch" + numVehicles;      // gabungan "ch" dan numVehicles
        this.model = model;                  // this membedakan field dan parameter
        System.out.println("Vehicle manufactured");
    }

    // getter dan setter
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n"
             + "The model type is " + model + "\n"
             + "The chassis number is " + chassisNo;
    }
}