import java.util.Scanner;
class JavaConstructorsCircle {
    double radius;
    public JavaConstructorsCircle(){
        radius=2;
    }
    public JavaConstructorsCircle(double radius){
        this.radius= radius;
    }
    public double calculateArea(){
        double area= 2*3.14*radius;
        return area;
    }
    public void display(double area){
        System.out.println(" The area of the circle is: "+area );
    }

    public static void main(String[] args) {
        JavaConstructorsCircle defaultCircle = new JavaConstructorsCircle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle.");
        double radius= sc.nextDouble();
        JavaConstructorsCircle customCircle =new JavaConstructorsCircle(radius);
        double customArea = customCircle.calculateArea();
        customCircle.display(customArea);
        double defaultArea=defaultCircle.calculateArea();
        defaultCircle.display(defaultArea);
        }
    }
