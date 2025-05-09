import java.util.ArrayList;
import java.util.List;
class Patient {
    private String name;
    private List<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void showConsultedDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println(d.getName());
        }
    }
}
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println( name + " is consulting patient " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println( name + " has consulted:");
        for (Patient p : patients) {
            System.out.println( p.getName());
        }
    }
}
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor d : doctors) {
            System.out.println( d.getName());
        }
    }

    public void showAllPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient p : patients) {
            System.out.println( p.getName());
        }
    }
}
public class ObjectModelingSelfProblemsQuestion3 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor Abc = new Doctor("Abc");
        Doctor Xyz = new Doctor("Xyz");
        Patient efg = new Patient("efg");
        Patient hij = new Patient("hij");
        hospital.addDoctor(Abc);
        hospital.addDoctor(Xyz);
        hospital.addPatient(efg);
        hospital.addPatient(hij);
        Abc.consult(efg);
        Abc.consult(hij);
        Xyz.consult(efg);
        System.out.println();
        Abc.showPatients();
        Xyz.showPatients();
        System.out.println();
        efg.showConsultedDoctors();
        hij.showConsultedDoctors();
    }
}