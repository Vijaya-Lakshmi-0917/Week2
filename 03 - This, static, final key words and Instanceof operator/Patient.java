public class Patient {
    static String hospitalName = "SV Multispeciality Hospital";
    static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public static void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
        } else {
            System.out.println("The object is not a Patient.");
        }
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("Abc", 30, "Fever", 1001);
        Patient patient2 = new Patient("Xyz", 45, "Back Pain", 1002);
        displayPatientDetails(patient1);
        System.out.println();
        displayPatientDetails(patient2);
        System.out.println();
        getTotalPatients();
        System.out.println();
        String notAPatient = "visitor";
        displayPatientDetails(notAPatient);
    }
}
