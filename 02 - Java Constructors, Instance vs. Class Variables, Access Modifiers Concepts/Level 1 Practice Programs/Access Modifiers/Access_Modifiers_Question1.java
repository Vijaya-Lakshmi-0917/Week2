class AccessModifiersStudent {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public AccessModifiersStudent(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void display() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(CGPA);
    }
    class PostgraduateStudent extends AccessModifiersStudent {
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }

        public void showName() {
            System.out.println("protected name from subclass :"+name);
        }
    }
    public static void main(String[] args) {
        AccessModifiersStudent student = new AccessModifiersStudent(34, "vijaya lakshmi", 8.7);
        student.display();
        student.setCGPA(9.2);
        student.display();
        AccessModifiersStudent.PostgraduateStudent pgStudent = student.new PostgraduateStudent(26,"vijay",6.8);
        pgStudent.showName();
        pgStudent.display();
    }
}
