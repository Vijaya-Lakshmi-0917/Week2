import java.util.Scanner;
class Student {
    String name;
    String rollNumber;
    int marks;
    public void details(String name,String rollNumber,int marks ){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String calculate(){
        if(marks> 90){
            return "O";
        }
        else if(marks>80){
            return "A";
        }
        else if(marks>70){
            return "B";
        }
        else if(marks>60){
            return "C";
        }
        else if(marks>50){
            return "D";
        }
        else {
            return "F";
        }
    }
    public void display(){
        String grade=calculate();
        System.out.println("Name of the student is "+ name);
        System.out.println("roll number of the student is "+ rollNumber);
        System.out.println("The marks obtained by the student is "+ marks);
        System.out.println("The grade for the obtained mark is "+ grade);
    }
    public static void main(String[] args){
        Student student=new Student();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name= sc.nextLine();
        System.out.println("Enter the roll number of the student");
        String rollNumber= sc.nextLine();
        System.out.println("Enter the marks of the student");
        int marks= sc.nextInt();
        student.details(name,rollNumber,marks);
        student.calculate();
        student.display();
    }
}
