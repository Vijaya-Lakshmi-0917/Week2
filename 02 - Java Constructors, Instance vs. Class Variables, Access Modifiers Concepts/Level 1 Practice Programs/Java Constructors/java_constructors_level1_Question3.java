import java.util.*;
class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name= name;
        this.age=age;
    }
    Person(Person other){
        this.name=other.name;
        this.age=other.age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String name=sc.nextLine();
        System.out.println("Enter the age of the person");
        int age= sc.nextInt();
        Person person1=new Person(name, age);
        Person person2=new Person(person1);
        person1.display();
        person2.display();
    }
}
