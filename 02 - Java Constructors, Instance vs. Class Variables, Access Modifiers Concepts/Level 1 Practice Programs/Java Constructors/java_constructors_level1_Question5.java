class  BookJavaConstructors{
    String title;
    String author;
    double price;
    boolean availability;
    public BookJavaConstructors(String title, String author, double price, boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    public String bookAvailability(){
        if (availability==true){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public void display(){
        System.out.println("The title of the book is: "+ title);
        System.out.println("The author of the book is: "+ author);
        System.out.println("The price of the book is: "+ price);
        System.out.println("Book availability: "+ bookAvailability());
    }
    public static void main(String[] args) {
        BookJavaConstructors bookJavaConstructors1=new BookJavaConstructors("abc", "author1",12.5,true);
        BookJavaConstructors bookJavaConstructors2=new BookJavaConstructors("xyz", "author2",10.0,false);
        bookJavaConstructors1.display();
        bookJavaConstructors2.display();
    }
}
