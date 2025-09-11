package StaticFinalKeywords;

class Vehicle {
    static double registrationFee = 2000.0;
    final String registrationNumber;   // unique
    String ownerName, vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("RegNo: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP85-1234", "Keshav", "Car");
        v1.display();
        Vehicle.updateRegistrationFee(2500);
        v1.display();
    }
}
