package StaticFinalKeywords;

class Employee {
    static String companyName = "Tekionix";
    static int totalEmployees = 0;

    final int id;   // cannot be changed
    String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Company: " + companyName);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Keshav", "Developer");
        e1.display();
        Employee.displayTotalEmployees();
    }
}
