class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolHierarchicalInheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Abc", 40, "Mathematics");
        Student student = new Student("Xyz", 16, "10th Grade");
        Staff staff = new Staff("Asd", 45, "Maintenance");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}