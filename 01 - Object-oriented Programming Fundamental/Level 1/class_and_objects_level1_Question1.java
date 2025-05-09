import java.util.*;
class Employee {
     private String name;
     private int id;
     private int salary;

    public void display() {
        System.out.println("Name of the employee is " + name);
        System.out.println("id of the employee is " + id);
        System.out.println("salary of the employee is " + salary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter the name of the employee ");
        employee.name=sc.next();
        System.out.println("Enter the id of the employee ");
        employee.id= sc.nextInt();
        System.out.println("Enter the salary of the employee ");
        employee.salary=sc.nextInt();
        employee.display();
    }
}
