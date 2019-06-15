package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

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
    }
}
