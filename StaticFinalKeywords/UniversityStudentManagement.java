package StaticFinalKeywords;

class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;   // cannot be changed
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Grade: " + grade + ", Univ: " + universityName);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Keshav", "A");
        s1.display();
        Student.displayTotalStudents();
    }
}
