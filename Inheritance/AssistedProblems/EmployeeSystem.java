package Inheritance.AssistedProblems;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentorName;

    Intern(String name, int id, double salary, String mentor) {
        super(name, id, salary);
        this.mentorName = mentor;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentorName);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 101, 80000, 5);
        Employee e2 = new Developer("Riya", 102, 60000, "Java");
        Employee e3 = new Intern("Keshav", 103, 15000, "Mr. Sharma");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
