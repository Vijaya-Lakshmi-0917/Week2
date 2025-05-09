class Product {
    private String productName;
    private double price;
    static int totalProducts=0;
    public Product(String productName, double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void displayProductDetails(){
        System.out.println(productName);
        System.out.println(price);
    }
    public static void displayTotalProducts(){
        System.out.println("total products: "+totalProducts);
    }
    public static void main(String[] args) {
        Product product1= new Product("Laptop", 40000.0);
        Product product2=new Product("key board", 800.0);
        product1.displayProductDetails();
        product2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
