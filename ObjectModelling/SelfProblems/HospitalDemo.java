package ObjectModelling.SelfProblems;

import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting " + p.name);
    }
}

class Hospital {
    String hospitalName;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void showInfo() {
        System.out.println("Hospital: " + hospitalName);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("ABC Hospital");

        Doctor d1 = new Doctor("Dr. A");
        Doctor d2 = new Doctor("Dr. B");

        Patient p1 = new Patient("Rohit");
        Patient p2 = new Patient("Keshav");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        h.showInfo();
    }
}
