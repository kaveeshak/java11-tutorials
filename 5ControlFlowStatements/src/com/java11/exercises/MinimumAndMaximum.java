package com.java11.exercises;

import java.util.Scanner;

public class MinimumAndMaximum {

    public static void minimumAndMaximumChallenge() {

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                if (number < minimum) {
                    minimum = number;
                }

                if (number > maximum) {
                    maximum = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Minimum number: " + minimum);
        System.out.println("Maximum number: " + maximum);
    }
}
