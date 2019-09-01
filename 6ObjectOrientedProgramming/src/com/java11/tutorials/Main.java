package com.java11.tutorials;

public class Main {

    public static void main(String [] args) {
        //Classes
        Car toyotaCar = new Car();
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("Corolla");
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("4Runner");
        System.out.println(toyotaCar.getModel());
    }
}
