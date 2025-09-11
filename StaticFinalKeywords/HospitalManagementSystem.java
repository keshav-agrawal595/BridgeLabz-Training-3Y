package StaticFinalKeywords;

class Patient {
    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;

    final int patientID;   // unique
    String name, ailment;
    int age;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Keshav", 20, "Fever");
        p1.display();
        Patient.getTotalPatients();
    }
}
