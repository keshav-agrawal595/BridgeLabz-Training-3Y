package Inheritance.HierarchicalInheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student of Grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in " + department + " department");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Agrawal", 40, "Math");
        Student s = new Student("Keshav", 19, 11);
        Staff st = new Staff("Rajesh", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
