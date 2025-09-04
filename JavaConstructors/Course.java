// Online Course Management system
class Course {
    String courseName;
    int duration;   // in months
    double fee;
    static String instituteName = "ABC Institute";   // common for all

    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    // instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Data Science", 6, 30000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // update institute name for all courses
        Course.updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
