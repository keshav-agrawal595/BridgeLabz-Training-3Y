package EncapsulationPolymorphism;

import java.util.*;

// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

// Insurable interface
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 1000; // fixed insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance: Rs.1000");
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: Rs.500");
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: Rs.2000");
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("UP32 AB 1234", 2000));
        vehicles.add(new Bike("UP32 XY 5678", 500));
        vehicles.add(new Truck("UP32 ZZ 9999", 5000));

        // Polymorphism
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " | Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost (5 days): " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                System.out.println("Insurance Cost: " + ((Insurable) v).calculateInsurance());
                ((Insurable) v).getInsuranceDetails();
            }
            System.out.println("-------------------");
        }
    }
}
