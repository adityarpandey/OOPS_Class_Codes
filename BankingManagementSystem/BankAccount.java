package concepts.BankingManagementSystem;

public abstract class BankAccount {

//    Attributes which other class can user but Encapsulated
    private String accountNumber;
    private double balance;
    private String accountHolder;

//    Methods which many other class can use for example: SavingAccount and CurrentAccount

    public void deposit(double amount){
        balance += amount;
    }

//    Abstract method for withdraw

    public abstract boolean withdraw(double amount);




//  Getter methods for every attribute

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
