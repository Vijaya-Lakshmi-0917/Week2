class Course {
    private String courseName;
    private double duration;
    private double fee;
    static String instituteName="SRM Institute Of Science And Technology";
    public Course(String courseName, double duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void displayCourseDetails(){
        System.out.println(courseName);
        System.out.println(duration);
        System.out.println(fee);
        System.out.println(instituteName);
    }
    public static void updateInstituteName(String string){
        instituteName= string;
    }
    public static void main(String[] args) {
        Course course1=new Course("Electronics and Communication Engineering", 4, 185000);
        Course course2=new Course("Computer Science and Engineering", 4, 285000);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("National Institute Of Technology");
    }
}