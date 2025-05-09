import java.util.ArrayList;
import java.util.List;
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("    Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void displayInfo() {
        System.out.println("  Department: " + name);
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept.getName().equals(departmentName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayInfo();
        }
        System.out.println();
    }

    public void shutdownCompany() {
        System.out.println("Shutting down company: " + name);
        departments.clear();
    }
}
public class ObjectModelingAssistedProblemsQuestion3 {
    public static void main(String[] args) {
        Company CGTech = new Company("CGTech");
        CGTech.addDepartment("Engineering");
        CGTech.addDepartment("HR");
        CGTech.addEmployeeToDepartment("Engineering", "Abc");
        CGTech.addEmployeeToDepartment("Engineering", "Xyz");
        CGTech.addEmployeeToDepartment("HR", "asd");
        CGTech.displayCompanyStructure();
        CGTech.shutdownCompany();
        CGTech.displayCompanyStructure();
    }
}