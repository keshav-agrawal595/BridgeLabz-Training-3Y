package ObjectModelling.SelfProblems;

import java.util.*;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
        System.out.println();
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this); // association both ways
    }

    void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showSchoolStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
        System.out.println();
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student s1 = new Student("Keshav");
        Student s2 = new Student("Krishnam");

        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);

        school.showSchoolStudents();
        s1.showCourses();
        c1.showStudents();
    }
}
