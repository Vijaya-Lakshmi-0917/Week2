import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayCourses(List<Course1> courses) {
        System.out.println("Professor " + name + " is teaching:");
        for (Course1 c : courses) {
            if (c.getProfessor() == this) {
                System.out.println(c.getCourseName());
            }
        }
    }
}

class Student1 {
    private String name;
    private List<Course1> enrolledCourses;

    public Student1(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course1 course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course1 c : enrolledCourses) {
            System.out.println(c.getCourseName());
        }
    }
}

class Course1 {
    private String courseName;
    private Professor professor;
    private List<Student1> students;

    public Course1(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println("Professor " + prof.getName() + " assigned to " + courseName);
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student1 s : students) {
            System.out.println(s.getName());
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: Prof. " + professor.getName());
        }
        showStudents();
        System.out.println();
    }
}

public class ObjectModelingSelfProblemsQuestion5 {
    public static void main(String[] args) {
        Professor Abc = new Professor("Abc");
        Professor Xyz = new Professor("Xyz");

        Course1 math = new Course1("Mathematics");
        Course1 physics = new Course1("Physics");

        math.assignProfessor(Abc);
        physics.assignProfessor(Xyz);

        Student1 asd = new Student1("asd");
        Student1 efg = new Student1("efg");

        asd.enrollCourse(math);
        asd.enrollCourse(physics);
        efg.enrollCourse(physics);

        System.out.println();

        math.showCourseDetails();
        physics.showCourseDetails();

        asd.showEnrolledCourses();
        System.out.println();

        Abc.displayCourses(List.of(math, physics));
        Xyz.displayCourses(List.of(math, physics));
    }
}