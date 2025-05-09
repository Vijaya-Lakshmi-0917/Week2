interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentDetails() {
        return "Full-time Employee Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String department) {
    }

    public String getDepartmentDetails() {
        return "Part-time Employee has no department assignment.";
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion1 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Abc", 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Xyz", 30, 80);

        fullTimeEmployee.assignDepartment("HR");
        partTimeEmployee.assignDepartment("Sales");

        fullTimeEmployee.displayDetails();
        System.out.println(fullTimeEmployee.getDepartmentDetails());
        System.out.println();

        partTimeEmployee.displayDetails();
        System.out.println(partTimeEmployee.getDepartmentDetails());
    }
}
