import java.util.ArrayList;
class Patient {

    int patientId;
    String name;
    String ailment;

    // Constructor using this keyword
    Patient(int patientId, String name, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.ailment = ailment;
    }

    void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Ailment: " + ailment);
        System.out.println();
    }
}


class Doctor {

    int doctorId;
    String name;
    String specialization;

    ArrayList<Patient> patients;   // Aggregation

    static int totalDoctors = 0;   // Static variable

    // Constructor
    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;

        patients = new ArrayList<>();

        totalDoctors++;  // increment when new doctor created
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void displayDoctorDetails() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);

        System.out.println("Patients Under This Doctor:");

        for (Patient p : patients) {
            p.displayPatientDetails();
        }
    }
}
public class Q6 {

    public static void main(String[] args) {

        // Create Patients
        Patient p1 = new Patient(101, "Alice", "Fever");
        Patient p2 = new Patient(102, "Bob", "Cold");
        Patient p3 = new Patient(103, "Charlie", "Fracture");

        // Create Doctors
        Doctor d1 = new Doctor(1, "Dr. Smith", "General Physician");
        Doctor d2 = new Doctor(2, "Dr. John", "Orthopedic");

        // Assign patients (Aggregation)
        d1.addPatient(p1);
        d1.addPatient(p2);

        d2.addPatient(p3);

        // Display Details
        d1.displayDoctorDetails();
        d2.displayDoctorDetails();

        // Display total doctors
        System.out.println("Total Doctors: " + Doctor.totalDoctors);
    }
}