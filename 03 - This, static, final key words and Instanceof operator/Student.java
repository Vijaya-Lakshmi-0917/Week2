public class Student {
    static String universityName = "SRM University";
    static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public static void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.grade = newGrade;
            System.out.println("Grade updated for " + student.name);
        } else {
            System.out.println("Object is not a Student. Cannot update grade.");
        }
    }
    public static void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Grade: " + student.grade);
        } else {
            System.out.println("Object is not a Student.");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Abc", 101, 'A');
        Student student2 = new Student("Xyz", 102, 'B');
        displayStudentDetails(student1);
        System.out.println();
        displayStudentDetails(student2);
        System.out.println();
        displayTotalStudents();
        System.out.println();
        updateGrade(student2, 'A');
        displayStudentDetails(student2);
        System.out.println();
        String notAStudent = "Not a Student";
        updateGrade(notAStudent, 'C');
    }
}