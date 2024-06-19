package SE_program;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bibek
 */
import java.util.Scanner;

abstract class Account {
    protected int accountNumber;
    protected String name;
    protected double amount;

    public Account(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public abstract double getMinimumBalance();

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println(amount + " deposited successfully. New balance: " + this.amount);
    }

    public void withdraw(double amount) {
        if (this.amount - amount < getMinimumBalance()) {
            System.out.println("Insufficient balance. Minimum balance required: " + getMinimumBalance());
        } else {
            this.amount -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + this.amount);
        }
    }
}

final class SBAccount extends Account {
    public final double INTEREST_RATE = 0.04;
    public final double MINIMUM_BALANCE = 1000.0;

    public SBAccount(int accountNumber, String name, double amount) {
        super(accountNumber, name, amount);
    }

    public double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public void deposit(double amount) {
        super.deposit(amount);
        amount *= INTEREST_RATE;
        this.amount += amount;
        System.out.println("Interest of " + amount + " added. New balance: " + this.amount);
    }
}

final class CurrentAccount extends Account {
    public final double MINIMUM_BALANCE = 5000.0;

    public CurrentAccount(int accountNumber, String name, double amount) {
        super(accountNumber, name, amount);
    }

    public double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\n");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("\n");

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\n");

        System.out.print("Enter account type (S or C): ");
        String accountType = scanner.nextLine();
        Account account;
        if (accountType.equalsIgnoreCase("S")) {
            account = new SBAccount(accountNumber, name, amount);
        } else if (accountType.equalsIgnoreCase("C")) {
            account = new CurrentAccount(accountNumber, name, amount);
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        System.out.print("\n\n");
        System.out.println("Account created successfully.");

        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Account Name: " + account.name);
        System.out.println("Your balance: " + account.amount);
        System.out.println("Minimum balance: " + account.getMinimumBalance());
        System.out.print("\n");

        System.out.print("Enter amount to be deposited: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to be withdrawn: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
