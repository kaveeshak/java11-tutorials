package com.java11.exercises;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number != 0) {

            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
}
