package com.java11.tutorials;

import com.java11.exercises.SimpleCalculator;

public class Main {

    public static void main(String [] args) {
        //Classes
        Car toyotaCar = new Car();
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("Corolla");
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("4Runner");
        System.out.println(toyotaCar.getModel());

        //Testing SimpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(12);
        simpleCalculator.setSecondNumber(3);
        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getDivisionResult());
        simpleCalculator.setSecondNumber(0);
        System.out.println(simpleCalculator.getDivisionResult());
    }
}
