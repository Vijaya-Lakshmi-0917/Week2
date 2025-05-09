import java.util.Scanner;
class Circle {
    private double radius;
    public double calculate(){
        double pi=3.14;
        double area=2*pi*radius;
        return area;
    }
    public void display(double area){
        System.out.println("The radius of the circle is "+ area);
    }
    public static void main(String[] args){
        Circle areaOfACircle= new Circle();
        System.out.println("Enter the radius of the circle");
        Scanner sc=new Scanner(System.in);
        areaOfACircle.radius= sc.nextDouble();
        double area=areaOfACircle.calculate();
        areaOfACircle.display(area);
    }
}