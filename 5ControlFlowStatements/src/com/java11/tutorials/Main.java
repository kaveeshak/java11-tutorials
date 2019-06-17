package com.java11.tutorials;

import com.java11.exercises.DayOfTheWeekChallange;

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
                    calculateInterest(10000.00, i));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return ((amount * interestRate) / 100);
    }
}
