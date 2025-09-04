// Vehicle Registration system
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;   // same for all

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    // instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
