package com.java11.tutorials;

import com.java11.exercises.BankAccount;
import com.java11.exercises.Person;
import com.java11.exercises.SimpleCalculator;

public class Main {

    public static void main(String [] args) {
        //Classes
        Car toyotaCar = new Car();
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("Corolla");
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("4Runner");
        System.out.println(toyotaCar.getModel());

        //Testing SimpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(12);
        simpleCalculator.setSecondNumber(3);
        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getDivisionResult());
        simpleCalculator.setSecondNumber(0);
        System.out.println(simpleCalculator.getDivisionResult());

        //Testing Person.
        Person person = new Person();
        person.setAge(103);
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        person.setFirstName("Venura");
        person.setLastName("Komangodage");
        person.setAge(15);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        //Testing BankAccount.
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(-10);
        bankAccount.setBalance(100);
        bankAccount.deposit(-34);
        bankAccount.deposit(45);
        bankAccount.withdrawal(1000);
        bankAccount.withdrawal(10);
        System.out.println("Balance: " + bankAccount.getBalance());

        //Testing Constructors.
        BankAccount kaveeshasAccount = new BankAccount("5687429", "Venura K Komangodage", "kaveeshak@gmail.com", "732-763-0603", 0.00);
        System.out.println(kaveeshasAccount.getAccountNumber());
        System.out.println(kaveeshasAccount.getCustomerName());
        System.out.println(kaveeshasAccount.getEmail());
        System.out.println(kaveeshasAccount.getPhoneNumber());
        System.out.println(kaveeshasAccount.getBalance());

        //Testing Constructors - this().
        BankAccount testBankAccount = new BankAccount();
        System.out.println(testBankAccount.getCustomerName());
        System.out.println(testBankAccount.getBalance());
    }
}
