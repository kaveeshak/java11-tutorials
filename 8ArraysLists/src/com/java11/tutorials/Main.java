package com.java11.tutorials;

import com.java11.exercises.Exercises;

import java.sql.SQLOutput;
import java.util.Arrays;
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

        //int[] inputNumbers = getIntegersFromConsole(4);
        //System.out.println("The average of the input numbers is " + getAverage(inputNumbers));

        //Arrays challenge exercise.
        //System.out.println("Arrays challenge exercise...");
        //int[] inputNumbers = getIntegersFromConsole(5);
        //printArray(sortIntegers(inputNumbers));

        //Demo on value types and reference types.
        System.out.println();
        System.out.println("Demo on value types and reference types...");
        int myIntValue1 = 10;
        int myIntValue2 = myIntValue1;
        System.out.println(myIntValue1);
        System.out.println(myIntValue2);

        myIntValue2++;
        System.out.println(myIntValue1);
        System.out.println(myIntValue2);

        int[] myArray1 = new int[5];
        int[] myArray2 = myArray1;
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        myArray2[0] = 4;
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        modifyArray(myArray1);
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        //Testing minimum element challenge...
        //System.out.println();
        //System.out.println("Testing minimum element challenge...");
        //int[] integers = Exercises.readIntegers(5);
        //System.out.println("The minimum value is " + Exercises.findMin(integers));

        //Testing reverse array challenge...
        System.out.println();
        System.out.println("Testing reverse array challenge...");
        int[] array = { 2, 5, 10, 45, -4, 44 };
        System.out.println("Original array is " + Arrays.toString(array));
        Exercises.reverse(array);
        System.out.println("Reversed array is " + Arrays.toString(array));
    }

    private static void modifyArray(int[] array) {
        array[0] = 100;
    }

    private static int[] sortIntegers(int[] array) {
        //int tempValue;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j =  i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int tempValue = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tempValue;
                }
            }
        }
        return sortedArray;
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

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value in element " + i + " is " + array[i]);
        }
    }
}
