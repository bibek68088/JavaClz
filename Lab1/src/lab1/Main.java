/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author bibek
 */
import java.util.Scanner;

abstract class BankAccount {
    // common properties and methods
    protected String accountNumber;
    protected double balance;
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public abstract void withdraw(double amount); // abstract method
    
    // other common methods
}

class SavingsAccount extends BankAccount {
    // minimum balance for savings account
    private static final double MIN_BALANCE = 1000.00;
    
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}

class CurrentAccount extends BankAccount {
    // minimum balance for current account
    private static final double MIN_BALANCE = 5000.00;
    
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}

final class SBAccount extends SavingsAccount {
    // SB account cannot be used as a base class
}

final class CAAccount extends CurrentAccount {
    // CA account cannot be used as a base class
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which account do you want to create? (1 for Savings, 2 for Current)");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            SavingsAccount sa = new SavingsAccount();
            // initialize other properties
        } else if (choice == 2) {
            CurrentAccount ca = new CurrentAccount();
            // initialize other properties
        } else {
            System.out.println("Invalid choice");
        }
    }
}