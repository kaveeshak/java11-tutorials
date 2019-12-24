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

        //Testing encapsulation challenge exercise.
        System.out.println();
        System.out.println("Testing encapsulation challenge exercise...");
        Printer printer1 = new Printer(false);
        System.out.println("Toner: " + printer1.getTonerLevel());
        printer1.print(20);
        System.out.println("Number of pages printed: " + printer1.getNumberOfPagesPrinted());

        Printer printer2 = new Printer(true);
        printer2.fillToner(300);
        printer2.print(21);
        System.out.println("Toner: " + printer2.getTonerLevel());
        System.out.println("Number of pages printed: " + printer2.getNumberOfPagesPrinted());

        //Demo on Polymorphism.
        System.out.println();
        System.out.println("Demo on Polymorphism.");
        for(int i = 0; i < 5; i++) {
            Movie randomMovie = getRandomMovie();
            System.out.println(randomMovie.plot());
        }

        //Testing Polymorphism challenge.
        System.out.println();
        System.out.println("Testing polymorphism challenge...");
        BasicCar car1 = new Camry();
        car1.startEngine();
        car1 = new LandCruiser();
        car1.startEngine();
    }

    private static Movie getRandomMovie() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Generated random number is " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //No plot method.
}

class BasicCar {
    private String name;
    private boolean isEngine;
    private int numberOfCylinders;
    private int numberOfWheels;

    public BasicCar(String name, int numberOfCylinders) {
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
        this.isEngine = true;
        this.numberOfWheels = 5; //With spare.
    }

    public void startEngine() {
        System.out.println("Engine starting...");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void applyBreak() {
        System.out.println("Applying breaking...");
    }

    public String getName() {
        return name;
    }
}

class Camry extends BasicCar {
    public Camry() {
        super("Camry SE", 4);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " starting engine...");
    }
}

class LandCruiser extends BasicCar {
    public LandCruiser() {
        super("LandCruiser", 4);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " starting engine...");
    }
}

