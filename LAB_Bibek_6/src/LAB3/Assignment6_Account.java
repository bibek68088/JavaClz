/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author bibek
 */
class Account {

    String id;
    String name;
    int balance = 0;

    Account() {
    }

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int creditAmount(int amount) {
        if (amount <= balance) {
            balance = balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int debitAmount(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int trasferTo(String anotherAccount, int amount){
        if(amount <= balance){
            balance = balance - amount;//balance deducted
            System.out.println("The amount is transfered");
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

public class Assignment6_Account {

    public static void main(String args[]) {
        Account a1 = new Account("6800", "Bibek Tamang", 100000);
        Account a2 = new Account("6801", "Dinesh Rana", 80000);
        System.out.println("Id: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());
        System.out.println("Credit Balance: " + a1.creditAmount(20000));
        System.out.println("Debit Balance: " + a1.debitAmount(20000));
        System.out.println("Transfer to:"+a2);
        System.out.println("String: " + a1.toString());
    }
}