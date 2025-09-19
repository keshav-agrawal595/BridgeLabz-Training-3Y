package ObjectModelling.SelfProblems;

import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor p) {
        professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void addStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.addStudent(this);
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ram");
        Student s2 = new Student("Raj");

        Professor p1 = new Professor("Prof. Agrawal");

        Course c1 = new Course("Operating Systems");
        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
    }
}
