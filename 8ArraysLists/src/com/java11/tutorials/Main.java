package com.java11.tutorials;

import com.java11.exercises.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        //Demo on arrays.
        System.out.println("Demo on arrays...");
        int[] myIntegers = new int[5];
        myIntegers[2] = 10;
        System.out.println(myIntegers[2]);

        double[] myDoubles = {2.3, 5.4};
        System.out.println(myDoubles[1]);

        for (int i = 0; i < myIntegers.length; i++) {
            myIntegers[i] = i * 10;
        }
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("The value stored in element " + i + " is " + myIntegers[i]);
        }

        //int[] inputNumbers = getIntegersFromConsole(4);
        //System.out.println("The average of the input numbers is " + getAverage(inputNumbers));

        //Arrays challenge exercise.
        //System.out.println("Arrays challenge exercise...");
        //int[] inputNumbers = getIntegersFromConsole(5);
        //printArray(sortIntegers(inputNumbers));

        //Demo on value types and reference types.
        System.out.println();
        System.out.println("Demo on value types and reference types...");
        int myIntValue1 = 10;
        int myIntValue2 = myIntValue1;
        System.out.println(myIntValue1);
        System.out.println(myIntValue2);

        myIntValue2++;
        System.out.println(myIntValue1);
        System.out.println(myIntValue2);

        int[] myArray1 = new int[5];
        int[] myArray2 = myArray1;
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        myArray2[0] = 4;
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        modifyArray(myArray1);
        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));

        //Testing minimum element challenge...
        //System.out.println();
        //System.out.println("Testing minimum element challenge...");
        //int[] integers = Exercises.readIntegers(5);
        //System.out.println("The minimum value is " + Exercises.findMin(integers));

        //Testing reverse array challenge...
        System.out.println();
        System.out.println("Testing reverse array challenge...");
        int[] array = { 2, 5, 10, 45, -4, 44 };
        System.out.println("Original array is " + Arrays.toString(array));
        Exercises.reverse(array);
        System.out.println("Reversed array is " + Arrays.toString(array));

        //Demo on ArrayList...
        /*
        System.out.println("Demo on ArrayList...");
        boolean isQuit = false;

        printInstructions();

        while (!isQuit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    isQuit = true;
                    break;
            }
        }
        */

        //Testing ArrayList challenge.
        System.out.println("Testing ArrayList challenge...");
        //testArrayListChallenge();

        //Demo on autoboxing and unboxing...
        System.out.println();
        System.out.println("Demo on autoboxing and unboxing...");
        //demoAutoboxingUnboxing();

        //Testing Autoboxing and unboxing challenge.
        System.out.println();
        System.out.println("Testing Autoboxing and unboxing challenge...");
        testAutoboxingUnboxingChallenge();
    }

    private static void testAutoboxingUnboxingChallenge() {
        Bank chase = new Bank();

        chase.addBranch("Piscataway");
        chase.addBranch("Edison");
        chase.addBranch("Somerset");
        chase.addBranch("Edison");

        chase.addCustomer("Edison", "Venura", 50.00);
        chase.addCustomer("Edison", "Amanda", 100.00);
        chase.addCustomer("Somerset", "Kevin", 20.65);
        chase.addCustomer("Edison", "Venura", 56.32);
        chase.addCustomer("Piscataway", "Ravi", 23.12);

        chase.addTransaction("Edison", "Venura", 140.43);
        chase.addTransaction("New Brunswick", "Tom", 43.21);
        chase.addTransaction("Edison", "Laszlo", 56.43);

        chase.printListOfCustomers("Edison", true);
        chase.printListOfCustomers("Piscataway", true);
        chase.printListOfCustomers("Somerset", true);
    }

    private static void demoAutoboxingUnboxing() {
        Integer myInteger = new Integer(50); //Wrapper class.
        ArrayList<Integer> integers = new ArrayList<Integer>(); //ArrayList of Integer objects.

        for (int i = 0; i < 5; i++) {
            integers.add(Integer.valueOf(i)); //Autoboxing.
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(i + " --> " + integers.get(i).intValue()); //Unboxing.
        }

        //Autoboxing and unboxing is taken cared at the compiled time.
        Integer myIntegerObjectWrapper = 10;
        int myIntPrimitive = myIntegerObjectWrapper;
    }

    private static void testArrayListChallenge() {
        boolean isQuit = false;
        mobilePhone.printAvailableOptions();

        while (!isQuit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    isQuit = true;
                    break;
                case 2:
                    mobilePhone.printAllContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateExistingContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                    break;
                default:
                    System.out.println("Entered choice is not valid.");
                    mobilePhone.printAvailableOptions();
                    break;
            }
        }
    }

    private static void searchContact() {
        System.out.println("Enter the contact name to be searched: ");
        String name = scanner.nextLine();
        Contact contact = new Contact(name, "");
        mobilePhone.findContact(contact);
    }

    private static void removeContact() {
        System.out.print("Enter the contact name to be removed: ");
        String name = scanner.nextLine();
        Contact contact = new Contact(name, "");
        mobilePhone.removeContact(contact);
    }

    private static void updateExistingContact() {
        System.out.print("Enter the contact name to be modified: ");
        String existingName = scanner.nextLine();
        System.out.print("Enter the new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();

        Contact oldContact = new Contact(existingName, "");
        Contact newContact = new Contact(newName, newPhoneNumber);
        mobilePhone.modifyContact(oldContact, newContact);
    }

    private static void addNewContact() {
        System.out.print("Enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        mobilePhone.addContact(contact);
    }

    private static void searchItem() {
        System.out.print("Enter the item: ");
        String item = groceryList.findItem(scanner.nextLine());
        if (item != null) {
            System.out.println("The item " + item + " is found.");
        } else {
            System.out.println("The item is not found.");
        }
    }

    private static void removeItem() {
        System.out.print("Enter an item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    private static void modifyItem() {
        System.out.print("Enter the old item: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    private static void addItem() {
        System.out.print("Enter your grocery item: ");
        groceryList.addItem(scanner.nextLine());
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void modifyArray(int[] array) {
        array[0] = 100;
    }

    private static int[] sortIntegers(int[] array) {
        //int tempValue;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j =  i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int tempValue = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tempValue;
                }
            }
        }
        return sortedArray;
    }

    private static int[] getIntegersFromConsole(int number) {
        int[] integerArray = new int[number];
        System.out.println("Enter " + number + " integers.");

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return integerArray;
    }

    private static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value in element " + i + " is " + array[i]);
        }
    }
}
