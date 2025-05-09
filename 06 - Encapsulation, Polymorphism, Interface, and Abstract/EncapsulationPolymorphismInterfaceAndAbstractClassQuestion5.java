interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 21;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrower(borrowerName);
            available = false;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrower(borrowerName);
            available = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrower(borrowerName);
            available = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion5 {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }

        Reservable reservable1 = (Reservable) book;
        Reservable reservable2 = (Reservable) magazine;
        Reservable reservable3 = (Reservable) dvd;

        reservable1.reserveItem("Abc");
        reservable2.reserveItem("Xyz");
        reservable3.reserveItem("Asd");

        System.out.println("Book available: " + reservable1.checkAvailability());
        System.out.println("Magazine available: " + reservable2.checkAvailability());
        System.out.println("DVD available: " + reservable3.checkAvailability());
    }
}