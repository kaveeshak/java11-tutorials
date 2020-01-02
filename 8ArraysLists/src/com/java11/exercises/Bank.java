package com.java11.exercises;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (getBranch(branchName) != null) {
            return false;
        } else {
            branches.add(new Branch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialTransaction);
        } else {
            System.out.println("The branch " + branchName + " is not found.");
            return false;
        }
    }

    public boolean addTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
            if (branch.addTransaction(customerName, transactionAmount)) {
                return true;
            } else {
                System.out.println("The customer " + customerName + " is not found.");
                return false;
            }
        } else {
            System.out.println("The branch " + branchName + " is not found.");
            return false;
        }
    }

    public void printListOfCustomers(String branchName, boolean isPrintTransactions) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            if (customers.size() > 0) {
                System.out.println("List of customers from " + branch.getName() + " branch.");
                for (int i = 0; i < customers.size(); i++) {
                    Customer customer = customers.get(i);
                    System.out.println((i + 1) + ". " + customer.getName());

                    if (isPrintTransactions) {
                        ArrayList<Double> transactions = customer.getTransactions();
                        if (transactions.size() > 0) {
                            for (int j = 0; j < transactions.size(); j++) {
                                System.out.println("\t" + transactions.get(j));
                            }
                        } else {
                            System.out.println("\tThere are no transactions.");
                        }
                    }
                }
            } else {
                System.out.println("There are no customers from " + branch.getName() + " branch.");
            }
        } else {
            System.out.println("The branch " + branchName + " is not found.");
        }
    }

    private Branch getBranch(String branchName) {
        Branch branch = new Branch(branchName);
        int branchIndex = branches.indexOf(branch);
        if (branchIndex >= 0) {
            return branches.get(branchIndex);
        } else {
            return null;
        }
    }
}
