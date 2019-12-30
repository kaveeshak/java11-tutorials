package com.java11.tutorials;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Demo on arrays.
        System.out.println("Demo on arrays...");
        int[] myIntegers = new int[5];
        myIntegers[2] = 10;
        System.out.println(myIntegers[2]);

        double[] myDoubles = {2.3, 5.4};
        System.out.println(myDoubles[1]);

        for (int i = 0; i < myIntegers.length; i++) {
            myIntegers[i] = i * 10;
        }
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("The value stored in element " + i + " is " + myIntegers[i]);
        }

        int[] inputNumbers = getIntegersFromConsole(4);
        System.out.println("The average of the input numbers is " + getAverage(inputNumbers));

    }

    private static int[] getIntegersFromConsole(int number) {
        int[] integerArray = new int[number];
        System.out.println("Enter " + number + " integers.");

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        return integerArray;
    }

    private static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
}
