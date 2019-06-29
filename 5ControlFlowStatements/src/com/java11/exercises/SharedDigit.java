package com.java11.exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean isHasSharedDigit = false;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {

            return isHasSharedDigit;
        }

        while (num1 > 0) {

            int num2Temp = num2;
            while (num2Temp > 0) {

                if ((num1 % 10) == num2Temp % 10) {
                    isHasSharedDigit = true;
                }

                num2Temp = num2Temp / 10;
            }

            num1 = num1 / 10;
        }

        return isHasSharedDigit;
    }
}
