package com.java11.tutorials;

public class Main {

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
