package concepts.BankingManagementSystem;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber , String accountHolder , double initialDeposit){
        deposit(initialDeposit);
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);

    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
