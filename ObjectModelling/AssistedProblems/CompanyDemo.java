package ObjectModelling.AssistedProblems;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
        System.out.println();
    }
}

class Company {
    String companyName;
    ArrayList<Department> depts = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        depts.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : depts) {
            d.showDepartment();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Keshav"));
        d1.addEmployee(new Employee("Krishnam"));
        d2.addEmployee(new Employee("Yash"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}
