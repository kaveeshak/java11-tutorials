package com.java11.exercises;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            return false;
        } else {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        int customerIndex = customers.indexOf(new Customer(name, 0.0));
        if (customerIndex >= 0) {
            return customers.get(customerIndex);
        } else {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Branch) {
            Branch branch = (Branch) obj;
            if (name.equalsIgnoreCase(branch.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
