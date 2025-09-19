package ObjectModelling.SelfProblems;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) d.showDept();

        System.out.println("Faculties:");
        for (Faculty f : faculties) f.showFaculty();
        System.out.println();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        Department d1 = new Department("CSE");
        Department d2 = new Department("Mechanical");

        Faculty f1 = new Faculty("Dr. Agrawal");
        Faculty f2 = new Faculty("Prof. Agrawal");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        // Faculty can exist without a University
        Faculty f3 = new Faculty("Prof.");
        f3.showFaculty();
    }
}
