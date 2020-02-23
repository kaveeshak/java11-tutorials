package com.java11.tutorials;

import com.java11.exercises.AreaCalculator;
import com.java11.exercises.MinutesToYearsDaysCalculator;

import java.text.DecimalFormat;

public class Main {
    public static final String INVALID_ERROR_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println("Expressions and Statements...");
        //Quiz: Expressions
        int score = 100; //Expression: score = 100
        if (score > 99) { //Expression: score > 99
            System.out.println("You got the high score!"); //Expression: "You got the high score!"
            score = 0; //Expression: score = 0
        }

        //The if statement.
        System.out.println();
        System.out.println("The if statement...");
        int miles = 5;
        score = 5000;
        if (miles <= 5)
            System.out.println("There are less than 5 miles."); miles++;
        System.out.println(miles);
        if(score > 5000 && score < 10000) {
            System.out.println("The score was greater than 5000 and less than 10000.");
        } else if (score <= 5000) {
            System.out.println("The score was less than or equal to 5000.");
        } else {
            System.out.println("This was executed.");
        }

        //Variables inside a code block
        boolean isMorning = true;
        if (isMorning) {
            int time = 10;
            System.out.println("Time is " + time + " in the morning.");
        }

        //Methods
        System.out.println();
        System.out.println("Methods...");
        double height = 10d;
        double base = 30d;
        double area1 = calculateAreaOfTriangle(10, 20);
        System.out.println("The area of the triangle 1 is " + area1);
        double area2 = calculateAreaOfTriangle(height, base);
        System.out.println("The area of the triangle 2 is " + area2);

        //Quiz
        displayHighScorePosition("Kavi", calculateHighScorePosition(1500));
        displayHighScorePosition("Nishi", calculateHighScorePosition(900));
        displayHighScorePosition("Ama", calculateHighScorePosition(400));
        displayHighScorePosition("Honey", calculateHighScorePosition(50));

        //The Math class.
        System.out.println();
        System.out.println("The Math class...");
        int myInt = Math.round(23.45F);
        long myLong = Math.round(45.5);
        System.out.println(myInt);
        System.out.println(myLong);

        //Use of DecimalFormat class.
        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println(format.format(1_234.535234));
        System.out.println();

        //Method Overloading.
        System.out.println();
        System.out.println("Method overloading...");
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

        //Testing exercises.
        System.out.println();
        System.out.println("Testing exercises...");
        //Testing AreaCalculator
        System.out.println(AreaCalculator.area(-2));
        System.out.println(AreaCalculator.area(45.32));
        System.out.println(AreaCalculator.area(-43, 54.32));
        System.out.println(AreaCalculator.area(32.12, -54.32));
        System.out.println(AreaCalculator.area(34.21, 12.43));

        //Testing MinutesToYearsDaysCalculator
        MinutesToYearsDaysCalculator.printYearsAndDays(-34);
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " +
                playersPosition + " on the high score table.");
    }

    public static double calculateAreaOfTriangle(double height, double base) {
        double area = ((height * base)/2);
        return area;
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
