package com.java11.exercises;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        boolean isLeapYear = false;

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    isLeapYear = true;
                } else if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
        }

        return isLeapYear;
    }

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = -1;

        if (month >= 1 && month <= 12 &&
            year >= 1 && year <= 9999) {

            switch (month) {
                case 2:
                    daysInMonth = isLeapYear(year) ? 29 : 28;
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
            }
        }

        return daysInMonth;
    }
}
