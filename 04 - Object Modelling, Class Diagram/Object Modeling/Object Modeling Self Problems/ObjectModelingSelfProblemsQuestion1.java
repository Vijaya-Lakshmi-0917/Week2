import java.util.ArrayList;
import java.util.List;
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(s.getName());
        }
        System.out.println();
    }
}
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    protected void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void enroll(Course course) {
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " Enrolled Courses:");
        for (Course c : courses) {
            System.out.println( c.getCourseName());
        }
        System.out.println();
    }
}
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("School: " + schoolName + " Student List:");
        for (Student s : students) {
            System.out.println( s.getName());
        }
        System.out.println();
    }
}
public class ObjectModelingSelfProblemsQuestion1 {
    public static void main(String[] args) {
        School school = new School("central School");

        Student Abc = new Student("Abc");
        Student Xyz = new Student("Xyz");

        school.addStudent(Abc);
        school.addStudent(Xyz);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Abc.enroll(math);
        Abc.enroll(science);
        Xyz.enroll(science);

        school.showAllStudents();

        Abc.viewCourses();
        Xyz.viewCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}