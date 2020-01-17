package com.java11.main;

import com.java11.exercises.ISavable;
import com.java11.exercises.Player;
import com.java11.tutorials.DeskPhone;
import com.java11.tutorials.ITelephone;
import com.java11.tutorials.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Demo on Interfaces.
        //testInterfacesDemo();

        //Testing interfaces challenge.
        testInterfaceChallenge();
    }

    private static void testInterfaceChallenge() {
        Player myPlayer = new Player("Kaveesha", 170, 89, "Gun");
        saveToStorage(myPlayer);
        loadToObject(myPlayer);
        saveToStorage(myPlayer);
        myPlayer.toString();
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
