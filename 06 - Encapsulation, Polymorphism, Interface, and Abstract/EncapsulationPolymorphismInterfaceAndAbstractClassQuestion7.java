interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private String records;
    private double roomCharge;
    private double treatmentCharge;

    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
        this.records = "";
    }

    public double calculateBill() {
        return roomCharge + treatmentCharge;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public String viewRecords() {
        return records.isEmpty() ? "No records available" : records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String records;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = "";
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records += record + "\n";
    }

    public String viewRecords() {
        return records.isEmpty() ? "No records available" : records;
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion7 {
    public static void processPatientBill(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            MedicalRecord recordPatient = (MedicalRecord) patient;
            recordPatient.addRecord("Diagnosis: General checkup");
            System.out.println(recordPatient.viewRecords());
        }
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient("I001", "Abc", 45, 1000, 1500);
        Patient outPatient = new OutPatient("O001", "Xyz", 30, 200);

        processPatientBill(inPatient);
        processPatientBill(outPatient);
    }
}
