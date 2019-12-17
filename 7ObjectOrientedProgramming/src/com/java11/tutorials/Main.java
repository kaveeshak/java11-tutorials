package com.java11.tutorials;

import com.java11.exercises.*;

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

        //Testing Composition challenge.
        System.out.println();
        System.out.println("Testing Composition challenge...");
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        //Demo on not using encapsulation.
        System.out.println();
        System.out.println("Demo on not using encapsulation...");
        Player player1 = new Player();
        player1.name = "Kaveesha";
        player1.health = 100;
        player1.weapon = "Arrow";
        player1.loseHealth(110);
        player1.health = 50;
        player1.health = -400; //The console output never gets executed.

        //Demo on encapsulation.
        System.out.println();
        System.out.println("Demo on encapsulation...");
        EnhancedPlayer player2 = new EnhancedPlayer("Amanda", 200, "Sword");
        System.out.println("Initial health is " + player2.getHealth());
    }
}
