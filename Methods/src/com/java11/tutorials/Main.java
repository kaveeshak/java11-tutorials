package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //Methods
        calculateAreaOfTriangle(10, 20);
    }

    public static void calculateAreaOfTriangle(double height, double base) {

        double area = ((height * base)/2);
        System.out.println("The area of the triangle is " + area);
    }
}
