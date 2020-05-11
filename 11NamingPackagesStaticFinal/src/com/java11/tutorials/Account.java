package com.java11.tutorials;

import java.util.ArrayList;

public class Account {
    public String name;
    public int balance;
    public ArrayList<Integer> transactions;

    public Account(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " is deposited to your account. The new balance is " + balance + ".");
        } else {
            System.out.println("Negative amounts can't be deposited.");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            transactions.add(withdrawal);
            balance += withdrawal;
            System.out.println(amount + " is withdrawn from your account. The new balance is " + balance + ".");
        } else {
            System.out.println("Negative amounts can't be withdrawn.");
        }
    }

    public void voidCalculateBalance() {
        balance = 0;
        for(int i : transactions) {
            balance += i;
        }
        System.out.println("The calculated balance is " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
