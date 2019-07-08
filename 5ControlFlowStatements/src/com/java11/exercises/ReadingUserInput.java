package com.java11.exercises;

import java.util.Scanner;

public class ReadingUserInput {

    public static void readingUserInputChallenge() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        while (i <= 10) {

            System.out.println("Enter number #" + i + ":");

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("The sum of the numbers you entered: " + sum);
    }
}
