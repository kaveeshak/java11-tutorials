package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        //float myFloatValue2 = (float) ((myDoubleValue) / 2);

        System.out.println("myIntValue: " + myIntValue );
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        //Quiz
        double pounds = 4d;
        double kilos = (pounds * 0.45359237d);
        System.out.println(pounds + " pounds = " + kilos + " kilos.");
    }
}
