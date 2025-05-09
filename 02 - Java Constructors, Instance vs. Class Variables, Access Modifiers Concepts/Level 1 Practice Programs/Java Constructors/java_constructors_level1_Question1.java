import java.util.Scanner;
class JavaConstructorsBook {
    String title;
    String author;
    double price;
    public JavaConstructorsBook(){
        title="book1";
        author="author1";
        price=0;
    }
    public JavaConstructorsBook(String title, String author, double price ){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("Title of the book: "+ title);
        System.out.println("Author of the book: "+ author);
        System.out.println("price of the book: "+ price);
    }
    public static void main(String[] args){
        JavaConstructorsBook defaultBook= new JavaConstructorsBook();
        Scanner sc=new Scanner(System.in);
        defaultBook.display();
        System.out.println("Enter the title of the book");
        String title= sc.nextLine();
        System.out.println("Enter the author of the book");
        String author= sc.nextLine();
        System.out.println("Enter the price of the book");
        double price= sc.nextDouble();
        JavaConstructorsBook customBook= new JavaConstructorsBook(title, author, price);
        customBook.display();
    }
}
