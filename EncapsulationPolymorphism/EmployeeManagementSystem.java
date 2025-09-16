package EncapsulationPolymorphism;

import java.util.*;

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Department Interface
interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate = 200; // example rate

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee f1 = new FullTimeEmployee(101, "Rahul", 50000);
        f1.assignDepartment("HR");

        PartTimeEmployee p1 = new PartTimeEmployee(102, "Keshav", 0, 20);
        p1.assignDepartment("Support");

        employees.add(f1);
        employees.add(p1);

        // Polymorphism: Using Employee reference
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                ((Department) e).getDepartmentDetails();
            }
            System.out.println("--------------------");
        }
    }
}
