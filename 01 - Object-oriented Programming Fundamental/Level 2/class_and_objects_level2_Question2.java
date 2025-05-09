import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    public void details(String accountHolder,int accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        //this.balance=balance;
    }
    public double deposit(double depositedMoney){
        balance+=depositedMoney;
        return balance;
    }
    public double withdraw(double moneyToBeWithdrawed ){
        if(balance>moneyToBeWithdrawed){
            System.out.println("A sum of "+moneyToBeWithdrawed+" has been withdrawn");
            return balance-=moneyToBeWithdrawed;
        }
        else{
            System.out.println("No sufficient balance");
            return balance;
        }
    }
    public void dispaly(){
        System.out.println("name of the account holder is: "+ accountHolder );
        System.out.println("Account number : "+ accountNumber);
        System.out.println("The current balance is: "+ balance );
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println("Enter the initial balance");
        Scanner sc= new Scanner(System.in);
        bankAccount.balance= sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Account holder's name");
        String accountHolder= sc.nextLine();
        System.out.println("Enter the Account number");
        int accountNumber= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter \"deposit\" for depositing money, \"withdraw\" for depositing money");
        String userInput= sc.nextLine();
        if(userInput.equals("deposit")){
            System.out.println("Enter the amount to be deposited");
            double depositedMoney= sc.nextDouble();
            double balance =bankAccount.deposit(depositedMoney);
        } else if(userInput.equals("withdraw")){
            System.out.println("Enter the amount to be withdrawn");
            double moneyToBeWithdrawn= sc.nextDouble();
            double balance =bankAccount.withdraw(moneyToBeWithdrawn);
        }
        else{
            System.out.println("Invalid Input");
        }
        bankAccount.details(accountHolder, accountNumber);
        bankAccount.dispaly();
    }
}
