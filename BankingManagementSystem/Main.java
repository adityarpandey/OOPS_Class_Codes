package concepts.BankingManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Type (1 = Savings, 2 = Current): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Account Number: ");
                    String accNo = scanner.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Initial Deposit: ");
                    double initial = scanner.nextDouble();

                    if (type == 1) {
                        service.createSavingAccount(accNo, name, initial);
                        System.out.println("Savings Account Created.");
                    } else if (type == 2) {
                        service.createCurrentAccount(accNo, name, initial);
                        System.out.println("Current Account Created.");
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();

                    if (service.deposit(accNo, depositAmount)) {
                        System.out.println("Deposit Successful.");
                    } else {
                        System.out.println("Deposit Failed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (service.withdraw(accNo, withdrawAmount)) {
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Withdrawal Failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = scanner.nextLine();

                    Double balance = service.getBalance(accNo);
                    if (balance != null) {
                        System.out.println("Current Balance: " + balance);
                    } else {
                        System.out.println("Account Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting System...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
