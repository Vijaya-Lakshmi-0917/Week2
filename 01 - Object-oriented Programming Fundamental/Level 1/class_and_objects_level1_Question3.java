import java.util.Scanner;
class Book {
    String title;
    String author;
    Double price;
    public void display(){
        System.out.println("The title of the book is "+ title);
        System.out.println("The author of the book is "+ author);
        System.out.println("The price of the book is "+ price);
    }
    public static void main(String[] args){
        Book book= new Book();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the title of the book");
        book.title= sc.nextLine();
        System.out.println("Enter the author of the book");
        book.author= sc.nextLine();
        System.out.println("Enter the price of the book");
        book.price= sc.nextDouble();
        book.display();
    }
}
