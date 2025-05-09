class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int durationInMonths;

    public Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationInMonths + " months");
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager("Abc", 101, 90000, 5);
        Developer developer = new Developer("Xyz", 102, 80000, "Java");
        Intern intern = new Intern("Asd", 103, 30000, 6);

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
