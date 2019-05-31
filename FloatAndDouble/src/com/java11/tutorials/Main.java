package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //Whole numbers division.
        int myIntValue = 5 / 2;
        short myShortValue = 20 / 3;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myShortValue: " + myShortValue);

        //float data type.
        float myFloatValue1 = 5f / 2f;
        float myFloatValue2 = (float) (12.65 / 3f);
        System.out.println("myFloatValue1: " + myFloatValue1);
        System.out.println("myFloatValue2: " + myFloatValue2);

        //double data type.
        double myDoubleValue1 = 5d / 2d;
        System.out.println("myDoubleValue1: " + myDoubleValue1);

        //Quiz
        double pounds = 4d;
        double kilos = (pounds * 0.45359237d);
        System.out.println(pounds + " pounds = " + kilos + " kilos.");
    }
}
