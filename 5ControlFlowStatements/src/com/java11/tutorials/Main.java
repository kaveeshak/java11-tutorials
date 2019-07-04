package com.java11.tutorials;

import com.java11.exercises.DayOfTheWeekChallange;
import com.java11.exercises.DigitSumChallenge;
import com.java11.exercises.SharedDigit;
import com.java11.exercises.Sum3And5Challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Switch statement.
        int number = 2;

        switch(number) {
            case 1:
                System.out.println("The number is 1.");
                break;
            case 2:
                System.out.println("The number is 2.");
                break;
            case 3: case 4: case 5:
                System.out.println("The number is 3 or 4 or 5.");
                break;
            default:
                System.out.println("The number is not found.");
                break;
        }

        String month = "MaRCH";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("First month of the year.");
                break;
            case "february":
                System.out.println("Second month of the year.");
                break;
            case "march":
                System.out.println("Third month of the year.");
                break;
            default:
                System.out.println("Month was not found.");
                break;
        }

        //Testing DayOfTheWeekChallange
        DayOfTheWeekChallange.printDayOfTheWeek(3);
        DayOfTheWeekChallange.printDayOfTheWeek(-5);
        DayOfTheWeekChallange.printDayOfTheWeek(43);

        //For statement (For loop)
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest rate = " +
                    String.format("%.2f", calculateInterest(10000.00, i)));
        }

        //Sum 3 and 5 challenge.
        Sum3And5Challenge.sum3And5();

        //While statement (While loop)
        int count = 0;
        while (count < 6) {
            System.out.println("Count is " + count);
            count++;
        }

        count = 0;
        while (true) {

            if (count > 5) {
                break;
            }

            System.out.println("Count is " + count);
            count++;
        }

        //do while statement
        count = 6;
        do {
            System.out.println("do while count is " + count);
            count++;
        } while (count < 6);

        //Quiz
        count = 0;
        int totalEvenNumbers = 0;
        String listOfEvenNumbers = "";

        System.out.println("First 5 even numbers from 1 - 20 are:");

        while (count <= 20) {

            count++;

            if (totalEvenNumbers == 5) {
                break;
            } else if (!isEvenNumber(count)) {
                continue;
            }

            totalEvenNumbers++;
            listOfEvenNumbers += count + " ";
        }

        System.out.println(listOfEvenNumbers);

        //Digits sum challenge
        System.out.println("Sum of numbers in 127 = " + DigitSumChallenge.sumDigits(127));
        System.out.println("Sum of numbers in 57 = " + DigitSumChallenge.sumDigits(57));

        //Testing shared digit.
        System.out.println(SharedDigit.hasSharedDigit(12, 53));

        //Parsing values from Strings.
        String numberAsString = "20";
        int numberAsPrimitive = 20;

        System.out.println("numberAsString = " + (numberAsString + 1));
        System.out.println("numberAsPrimitive = " + (numberAsPrimitive + 1));

        //Reading user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your birth year ?");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); //Handling Enter

        System.out.println("What is your name ?");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Hello " + name + ", Your age is " + (2019 - birthYear));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return ((amount * interestRate) / 100);
    }

    public static boolean isEvenNumber(int number) {

        return ((number % 2) == 0) ? true : false;
    }
}
