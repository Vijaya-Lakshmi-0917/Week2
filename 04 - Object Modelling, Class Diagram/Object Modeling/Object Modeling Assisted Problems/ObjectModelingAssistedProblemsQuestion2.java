import java.util.ArrayList;
import java.util.List;
class BankAccount {
    private static int accountCounter = 1000;
    private int accountNumber;
    private double balance;
    private Bank bank;
    private Customer customer;
    public BankAccount(Bank bank, Customer customer) {
        this.accountNumber = accountCounter++;
        this.balance = 0.0;
        this.bank = bank;
        this.customer = customer;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getBankName() {
        return bank.getName();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public void displayAccountInfo() {
        System.out.println("Account " + accountNumber + " Customer: " + getCustomerName() +
                " Bank: " + getBankName() + " Balance: " + balance);
    }
}
class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name + " - Account Balances:");
        for (BankAccount acc : accounts) {
            acc.displayAccountInfo();
        }
        System.out.println();
    }
}
class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public BankAccount openAccount(Customer customer) {
        BankAccount newAccount = new BankAccount(this, customer);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " at " + name + ".");
        return newAccount;
    }
}
public class ObjectModelingAssistedProblemsQuestion2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Axis Bank");
        Bank bank2 = new Bank("HDFC Bank");
        Customer Abc = new Customer("Abc");
        Customer Xyz = new Customer("Xyz");
        BankAccount AbcAccount1 = bank1.openAccount(Abc);
        BankAccount AbcAccount2 = bank2.openAccount(Abc);
        BankAccount XyzAccount1 = bank1.openAccount(Xyz);
        AbcAccount1.deposit(1500);
        AbcAccount2.deposit(2500);
        XyzAccount1.deposit(3000);
        Abc.viewBalance();
        Xyz.viewBalance();
    }
}
