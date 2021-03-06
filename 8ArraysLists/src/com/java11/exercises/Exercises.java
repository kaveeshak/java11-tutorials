package com.java11.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static int[] readIntegers(int count) {
        int[] integers = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " integers.");

        for (int i = 0; i < count; i++) {
            integers[i] = scanner.nextInt();
        }
        scanner.close();
        return integers;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void reverse(int[] array) {
       int midIndex = array.length / 2;
       int maxIndex = array.length - 1;
       for (int i = 0; i < midIndex; i++) {
           int tempValue = array[i];
           array[i] = array[maxIndex - i];
           array[maxIndex - i] = tempValue;
       }
    }
}
