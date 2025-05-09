class AccessModifiersBook {
    public int ISBN;
    protected String title;
    private String author;
    public AccessModifiersBook(int ISBN, String title, String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void display(){
        System.out.println(ISBN);
        System.out.println(title);
        System.out.println(author);
        System.out.println("----------------------------------------------------------------------------------------");
    }
    class EBook extends AccessModifiersBook{
        public EBook(int ISBN,String title,String author ){
            super(ISBN, title, author);
        }
        public void displaySubclass(){
            System.out.println(ISBN);
            System.out.println(title);
        }
    }
    public static void main(String[] args) {
        AccessModifiersBook book=new AccessModifiersBook(368292,"Abc", "xyz");
        book.display();
        book.setAuthor("asd");
        book.display();
        AccessModifiersBook.EBook eBook= book.new  EBook(6474981, "Micro electronics","David A. Bell");
        eBook.displaySubclass();
    }
}
