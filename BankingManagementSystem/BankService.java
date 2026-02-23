package concepts.BankingManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<BankAccount> accounts = new ArrayList<>();

    public BankAccount createSavingAccount(String accountNumber , String accountHolder , double initialDeposit){

        BankAccount savingAccount = new SavingAccount(accountNumber , accountHolder , initialDeposit);

        accounts.add(savingAccount);

        return savingAccount;

    }

    public BankAccount createCurrentAccount(String accountNumber , String accountHolder , double initialDeposit){

        BankAccount currentAccount = new CurrentAccount(accountNumber , accountHolder , initialDeposit);

        accounts.add(currentAccount);

        return currentAccount;

    }

    public boolean deposit(String accountNumber, double amount) {

        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                bankAccount.deposit(amount);
                return true;
            }
        }

        return false;   // account not found
    }

    public boolean withdraw(String accountNumber, double amount) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                return bankAccount.withdraw(amount);
            }
        }
        return false;
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {

                return bankAccount;
            }
        }

        return null;
    }

    public Double getBalance(String accountNumber) {
        BankAccount acc = findAccount(accountNumber);
        return (acc == null) ? null : acc.getBalance();
    }


}
