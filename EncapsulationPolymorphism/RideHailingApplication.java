package EncapsulationPolymorphism;

import java.util.*;

// Abstract Vehicle class
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName + ", Vehicle ID: " + vehicleId);
    }
}

// GPS interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class
class Car extends Vehicle implements GPS {
    private String location = "Unknown";

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String location = "Unknown";

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String location = "Unknown";

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

// Main class
public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        Car c1 = new Car(101, "Arjun", 15);
        Bike b1 = new Bike(102, "Ravi", 8);
        Auto a1 = new Auto(103, "Sunil", 12);

        rides.add(c1);
        rides.add(b1);
        rides.add(a1);

        // Update locations
        c1.updateLocation("MG Road");
        b1.updateLocation("City Center");
        a1.updateLocation("Bus Stand");

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("----------------");
        }
    }
}
