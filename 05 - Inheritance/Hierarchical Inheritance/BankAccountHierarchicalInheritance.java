class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        displayInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate );
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        displayInfo();
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        displayInfo();
        System.out.println("Account Type: Fixed Deposit");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

public class BankAccountHierarchicalInheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 8000.0, 4.0);
        CheckingAccount checking = new CheckingAccount("CA1002", 4000.0, 1500.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FD1003", 15000.0, 24);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}
