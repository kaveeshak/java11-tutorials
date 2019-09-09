package com.java11.exercises;

public class BankAccount {

    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double balance;

    public BankAccount() {
        this("Undefined", "Undefined", "Undefined", "Undefined", 0.00);
        System.out.println("This is the empty constructor.");
    }

    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("The new balance of " + this.balance + " is processed.");
        } else {
            System.out.println("Invalid balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("The deposit of " + amount + " is processed.");
            System.out.println("Remaining balance is " + this.balance + ".");
        } else {
            System.out.println("Invalid amount. The deposit is not processed.");
        }
    }

    public void withdrawal(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
            System.out.println("The withdrawal of " + amount + " is processed.");
            System.out.println("The new balance is " + this.balance + ".");
        } else {
            System.out.println("Withdrawal is not processed. Not sufficient balance.");
        }
    }
}
