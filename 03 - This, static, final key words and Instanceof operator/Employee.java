class Employee {
    static String companyName = "MyCompany";
    static int totalEmployees = 0;
    private String name;
    private String designation;
    private final int id;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("The provided object is not an Employee.");
        }
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Abc", 101, "Software Engineer");
        Employee employee2 = new Employee("Xyz", 102, "Data Analyst");
        Employee.displayDetails(employee1);
        System.out.println();
        Employee.displayDetails(employee2);
        System.out.println();
        Employee.displayTotalEmployees();
        System.out.println();
        String notAnEmployee = "Not an employee.";
        Employee.displayDetails(notAnEmployee);
    }
}