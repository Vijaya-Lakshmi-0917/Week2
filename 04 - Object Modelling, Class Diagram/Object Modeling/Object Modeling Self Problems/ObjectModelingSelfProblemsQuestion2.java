import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("  Faculty: " + name);
    }
}

class Department {
    private String name;
    private List<Faculty> facultyList;

    public Department(String name) {
        this.name = name;
        this.facultyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
        for (Faculty faculty : facultyList) {
            faculty.displayInfo();
        }
        System.out.println();
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyPool;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyPool = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyPool.add(faculty);
    }

    public void assignFacultyToDepartment(String deptName, Faculty faculty) {
        for (Department dept : departments) {
            if (dept.getName().equals(deptName)) {
                dept.addFaculty(faculty);
                return;
            }
        }
        System.out.println("Department not found: " + deptName);
    }

    public void displayUniversityStructure() {
        System.out.println("University: " + name);
        System.out.println("All Faculty:");
        for (Faculty f : facultyPool) {
            System.out.println("  - " + f.getName());
        }
        System.out.println();

        for (Department dept : departments) {
            dept.displayInfo();
        }
    }

    public void shutdownUniversity() {
        System.out.println("Shutting down university: " + name);
        departments.clear();
    }
}

public class ObjectModelingSelfProblemsQuestion2 {
    public static void main(String[] args) {
        University university = new University("Central University");

        Faculty drSmith = new Faculty("Abc");
        Faculty drJones = new Faculty("Xyz");
        Faculty drClark = new Faculty("asd");

        university.addFaculty(drSmith);
        university.addFaculty(drJones);
        university.addFaculty(drClark);

        university.addDepartment("Computer Science");
        university.addDepartment("Physics");

        university.assignFacultyToDepartment("Computer Science", drSmith);
        university.assignFacultyToDepartment("Computer Science", drJones);
        university.assignFacultyToDepartment("Physics", drClark);

        university.displayUniversityStructure();

        university.shutdownUniversity();

        System.out.println("\nFaculty still exists after university shutdown:");
        drSmith.displayInfo();
        drJones.displayInfo();
        drClark.displayInfo();
    }
}