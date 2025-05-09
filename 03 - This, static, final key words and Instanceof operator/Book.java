public class Book {
    static String libraryName = "MyLibrary";
    private String title;
    private String author;
    private final String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public static void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Object is not a Book.");
        }
    }
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book("Abc", "Xyz", "97856354");
        Book.displayDetails(book1);
        String notABook = "its a string";
        Book.displayDetails(notABook);
    }
}
