package com.java11.main;

import com.java11.exercises.ISavable;
import com.java11.exercises.Monster;
import com.java11.exercises.Player;
import com.java11.tutorials.DeskPhone;
import com.java11.tutorials.GearBox;
import com.java11.tutorials.ITelephone;
import com.java11.tutorials.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Demo on Interfaces.
        //System.out.println("Testing demo on Interfaces...");
        //testInterfacesDemo();

        //Testing interfaces challenge.
        //System.out.println();
        //System.out.println("Testing interfaces challenge...");
        //testInterfaceChallenge();

        //Demo on Nested classes.
        System.out.println();
        System.out.println("Testing demo on nested classes...");
        testNestedClassDemo();
    }

    private static void testNestedClassDemo() {
        GearBox toyota = new GearBox(6, 0);
        //This is how an instance of an inner class is created. However we usually define inner classes
        //as private.
        //GearBox.Gear toyotaGear1 = toyota.new Gear(1, 3.4);
        //System.out.println(toyotaGear1.driveSpeed(34));
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
