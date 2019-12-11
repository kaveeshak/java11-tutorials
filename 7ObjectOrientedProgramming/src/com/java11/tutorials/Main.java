package com.java11.tutorials;

public class Main {
    public static void main(String [] args) {
        //Demo on Composition.
        System.out.println("Demo on Composition...");
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "248", dimensions);
        Monitor monitor = new Monitor("15 inch beast", "Acer", 15, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMonitor().drawPixelAt(1500, 1200, "red");
        pc.getMotherboard().loadProgram("Windows 1.0");
        pc.getTheCase().pressPowerButton();
    }
}
