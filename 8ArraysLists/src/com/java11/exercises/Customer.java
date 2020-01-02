package com.java11.exercises;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactionAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(initialTransactionAmount);
    }

    public void addTransaction(double transactionAmount) {
        transactions.add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            if (name.equalsIgnoreCase(customer.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}