public class BankAccount {
    private static String bankName = "MyBank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid object.");
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1001, "Abc", 5000.0);
        BankAccount bankAccount2 = new BankAccount(1002, "Xyz", 3000.0);
        bankAccount1.displayAccountDetails();
        System.out.println();
        bankAccount2.displayAccountDetails();
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
