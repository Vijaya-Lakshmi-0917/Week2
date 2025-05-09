class AccessModifiersBankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public AccessModifiersBankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void display(){
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(balance);
        System.out.println("----------------------------------------------------------------------------------------");
    }
    class SavingsAccount extends AccessModifiersBankAccount{
        public SavingsAccount(int accountNumber,String accountHolder,double balance ){
            super(accountNumber, accountHolder, balance);
        }
        public void displaySubclass(){
            System.out.println(accountNumber);
            System.out.println(accountHolder);
            System.out.println(getBalance());
        }
    }
    public static void main(String[] args) {
        AccessModifiersBankAccount bankAccount=new AccessModifiersBankAccount(368292,"Abc", 18439);
        bankAccount.display();
        bankAccount.setBalance(10000);
        bankAccount.display();
        AccessModifiersBankAccount.SavingsAccount savingsAccount= bankAccount.new SavingsAccount(6474981, "Xyz",500);
        savingsAccount.displaySubclass();
    }
}