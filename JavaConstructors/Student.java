// University Management System
class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        cgpa = c;
    }

    // public methods to access and modify private variable
    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double c) {
        cgpa = c;
    }

    void showDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

// subclass accessing protected member
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int r, String n, double c, String s) {
        super(r, n, c);
        specialization = s;
    }

    void showPostgradInfo() {
        // can access protected name
        System.out.println("Postgraduate: " + name + " (" + specialization + ")");
    }

    public static void main(String[] args) {
        PostgraduateStudent p1 = new PostgraduateStudent(101, "Rohit", 8.5, "AI");
        p1.showDetails();
        p1.showPostgradInfo();
        p1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + p1.getCGPA());
    }
}
