package BankingApplication;

import java.util.Scanner;

public class Customer extends BankAccount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Welcome to the Banking Application");
        customer.setAccountNumber(123456);
        customer.setAccountHolderName("Christober S");
        customer.setAccountType("Savings");
        customer.setBalance(1000.0);
        System.out.println("Enter the options:");
        System.out.println("1. Display Account Info");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance Enquiry");
        switch (input.nextInt()) {
            case 1:
                customer.displayAccountInfo();
                break;
            case 2:
                System.out.println("Enter amount to deposit:");
                double depositAmount = input.nextDouble();
                customer.deposit(depositAmount);
                customer.displayAccountInfo();
                break;
            case 3:
                System.out.println("Enter amount to withdraw:");
                double withdrawAmount = input.nextDouble();
                customer.withdraw(withdrawAmount);
                customer.displayAccountInfo();
                break;
            case 4:
                System.out.println("Current Balance: " + customer.getBalance());
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
