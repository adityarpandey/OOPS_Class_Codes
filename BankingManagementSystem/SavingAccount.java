package concepts.BankingManagementSystem;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber , String accountHolder , double initialDeposit){
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
