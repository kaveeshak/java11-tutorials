package com.java11.tutorials;

public class Main {

    public static final String INVALID_ERROR_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        //Method Overloading.
        printDetails("Kavi", 25);
        printDetails(25, "Kavi");
        printDetails("Kavi");

        //Quiz.
        System.out.println(calcFeetAndInchesToCentimeters(-2, 5));
        System.out.println(calcFeetAndInchesToCentimeters(4, 24));
        System.out.println(calcFeetAndInchesToCentimeters(1, 2));
        System.out.println(calcFeetAndInchesToCentimeters(-34));
        System.out.println(calcFeetAndInchesToCentimeters(24));
        System.out.println(calcFeetAndInchesToCentimeters(0));

        //Quiz
        System.out.println(getDurationString(-34, 14));
        System.out.println(getDurationString(4, 87));
        System.out.println(getDurationString(128, 43));

        System.out.println(getDurationString(-54));
        System.out.println(getDurationString(134));
        System.out.println(getDurationString(1200));
        System.out.println(getDurationString(39600));



    }

    public static String getDurationString(int seconds) {

        if(seconds < 0) {
            return INVALID_ERROR_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_ERROR_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h ";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m ";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        //Validation.
        if(inches < 0) {
            return -1;
        }

        int feet = inches / 12;
        int remainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        double centimeters;

        //Validation.
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }

        centimeters = (((feet * 12) + inches) * 2.54);

        return centimeters;
    }

    public static void printDetails(String name, int age) {

        System.out.println(name + " " + age);

    }

    public static void printDetails(int age, String name) {

        System.out.println(age + " " + name);

    }

    public static void printDetails(String name) {

        System.out.println(name);
    }
}
