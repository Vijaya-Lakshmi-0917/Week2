interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited to " + holderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from " + holderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Savings interest added: " + interest);
    }

    public void applyForLoan() {
        System.out.println("Applying for personal loan in SavingsAccount");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Current interest added: " + interest);
    }

    public void applyForLoan() {
        System.out.println("Applying for business loan in CurrentAccount");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

public class EncapsulationPolymorphismInterfaceAndAbstractClassQuestion4 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S001", "Abc", 2000);
        BankAccount current = new CurrentAccount("C001", "Xyz", 7000);

        savings.deposit(500);
        current.withdraw(1000);

        savings.calculateInterest();
        current.calculateInterest();

        Loanable loanableSavings = (Loanable) savings;
        loanableSavings.applyForLoan();
        System.out.println("Savings loan eligible: " + loanableSavings.calculateLoanEligibility());

        Loanable loanableCurrent = (Loanable) current;
        loanableCurrent.applyForLoan();
        System.out.println("Current loan eligible: " + loanableCurrent.calculateLoanEligibility());
    }
}