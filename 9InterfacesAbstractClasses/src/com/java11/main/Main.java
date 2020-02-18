package com.java11.main;

import com.java11.exercises.*;
import com.java11.tutorials.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Demo on Interfaces.
        //System.out.println("Testing demo on Interfaces...");
        //testInterfacesDemo();

        //Testing interfaces challenge.
        //System.out.println();
        //System.out.println("Testing interfaces challenge...");
        //testInterfaceChallenge();

        //Demo on Nested classes.
        //System.out.println();
        //System.out.println("Testing demo on nested classes...");
        //testNestedClassDemo();

        //Testing nested classes challenge.
        //System.out.println();
        //System.out.println("Testing nested classes challenge...");
        //testNestedClassesChallenge();

        //Testing abstract classes demo.
        //System.out.println();
        //System.out.println("Testing Abstract classes demo...");
        //testAbstractClassesDemo();

        //Testing Abstract classes challenge.
        System.out.println();
        System.out.println("Testing abstract classes challenge...");
        testAbstractClassesChallenge();
    }

    private static void testAbstractClassesChallenge() {
        //LinkedList
        System.out.println("LinkedList...");
        String cities = "Edison,New Bruinswick,Piscataway,Jersey City,Fords,Woodbridge";
        String[] citiesArray = cities.split(",");
        MyLinkedList citiesList = new MyLinkedList();
        citiesList.traverse(citiesList.getRoot());
        for (String city : citiesArray) {
            citiesList.addItem(new Node(city));
        }
        citiesList.traverse(citiesList.getRoot());

        String numbers = "4,9,1,3,7,7,1";
        String[] numbersArray = numbers.split(",");
        MyLinkedList numbersList = new MyLinkedList();
        for (String number : numbersArray) {
            numbersList.addItem(new Node(number));
        }
        citiesList.traverse(numbersList.getRoot());
        numbersList.removeItem(new Node("3"));
        citiesList.traverse(numbersList.getRoot());
        numbersList.removeItem(new Node("4"));
        citiesList.traverse(numbersList.getRoot());
        numbersList.removeItem(new Node("7"));
        citiesList.traverse(numbersList.getRoot());
        numbersList.removeItem(new Node("1"));
        citiesList.traverse(numbersList.getRoot());
        numbersList.removeItem(new Node("9"));
        citiesList.traverse(numbersList.getRoot());
        citiesList.traverse(numbersList.getRoot());

        //SearchTree
        System.out.println("SearchTree...");
        String[] myLetters = {"C", "T", "Z", "A", "Q", "L", "S", "C", "U"};
        SearchTree mySearchTree = new SearchTree(null);
        for (String letter : myLetters) {
            mySearchTree.addItem(new Node(letter));
        }
        mySearchTree.traverse(mySearchTree.getRoot());

    }

    private static void testAbstractClassesDemo() {
        Dog myDog = new Dog("Honey");
        myDog.eat();
        myDog.breathe();

        Parrot myParrot = new Parrot("Green Parrot");
        myParrot.eat();
        myParrot.breathe();
        myParrot.fly();

        Penguin myPenguin = new Penguin("American Penguin");
        myPenguin.fly();
    }

    private static void testNestedClassesChallenge() {
        Album bnsAlbum = new Album("bns2020");
        bnsAlbum.addSong("Where do I find you");
        bnsAlbum.addSong("How is it going");
        bnsAlbum.addSong("She left me to die");
        bnsAlbum.addSong("she left me to die");
        bnsAlbum.addSong("Where do I find you");
        bnsAlbum.findSong("Here we come");
        bnsAlbum.findSong("How is it going");
    }

    private static void testNestedClassDemo() {
//        GearBox toyota = new GearBox(6, 0);
//        This is how an instance of an inner class is created. However we usually define inner classes
//        as private.
//        GearBox.Gear toyotaGear1 = toyota.new Gear(1, 3.4);
//        System.out.println(toyotaGear1.driveSpeed(34));

//        GearBox durango = new GearBox(6, 0);
//        durango.addGear(1, 3.4);
//        durango.addGear(2, 4.6);
//        durango.addGear(3, 6.7);
//        durango.changeGear(3);
//        System.out.println(durango.wheelSpeed(543));
//        durango.operateClutch(true);
//        durango.changeGear(3);
//        System.out.println(durango.wheelSpeed(890));
//        durango.operateClutch(false);
//        System.out.println(durango.wheelSpeed(890));

//        localInnerClassDemo();

        anonymousInnerClassDemo();
    }

    private static void anonymousInnerClassDemo() {
        Button continueButton = new Button("Continue");
        boolean isQuit = false;

        continueButton.setOnClickListener(new Button.IOnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Button " + title + " was clicked.");
            }
        });

        while (!isQuit) {
            System.out.println("Press 0 to quit.\nPress 1 to click on Send.");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    isQuit = true;
                    break;
                case 1:
                    continueButton.onClick();
                    break;
            }
        }
    }

    private static void localInnerClassDemo() {
        class OnClickListener implements Button.IOnClickListener {
            public void onClick(String name) {
                System.out.println("Button " + name + " was clicked.");
            }
        }

        boolean isQuit = false;
        Button button = new Button("Send");
        button.setOnClickListener(new OnClickListener());

        while (!isQuit) {
            System.out.println("Press 0 to quit.\nPress 1 to click on Send.");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    isQuit = true;
                    break;
                case 1:
                    button.onClick();
                    break;
            }
        }
    }

    private static void testInterfaceChallenge() {
        ISavable myPlayer = new Player("Kaveesha", 170, 89, "Gun");
        saveToStorage(myPlayer);
        loadToObject(myPlayer);
        saveToStorage(myPlayer);
        myPlayer.toString();

        ISavable monsterPlayer = new Monster("Tiger Monster", 100, "Teeth");
        saveToStorage(monsterPlayer);
        monsterPlayer.toString();
        ((Monster) monsterPlayer).callOtherMosters();
    }

    private static void loadToObject(ISavable savableObject) {
        savableObject.setValues(readValues());
    }

    private static void saveToStorage(ISavable savableObject) {
        System.out.print("Saving to storage --> ");
        for (int i = 0; i < savableObject.getValuesToSave().size(); i++) {
            System.out.print(savableObject.getValuesToSave().get(i) + "\t");
        }
        System.out.println();
    }

    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        int option;

        System.out.println("Your options are: \n\t" +
                "1- To enter a string.\n\t" +
                "2- To quit.");


        while (!isQuit) {
            System.out.print("Select an option.\t");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter your string.\t");
                    values.add(scanner.nextLine());
                    break;
                case 2:
                    isQuit = true;
                    break;
            }
        }
        return values;
    }

    private static void testInterfacesDemo() {
        ITelephone myPhone = new DeskPhone(7630603);
        myPhone.powerOn();
        myPhone.callPhone(7630603);
        myPhone.answer();

        myPhone = new MobilePhone(2345);
        myPhone.powerOn();
        myPhone.callPhone(2345);
        myPhone.answer();
    }
}
