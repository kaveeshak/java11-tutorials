package com.java11.tutorials;

import com.java11.exercises.X;
import com.java11.tutorials.game.ISavable;
import com.java11.tutorials.game.Monster;
import com.java11.tutorials.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        //Note that this section is not about AWT. This is an attempt to show the use of packages.
        //System.out.println("Use of packages...");
        //MyWindow myWindow = new MyWindow("Complete Java");
        //myWindow.setVisible(true);

        //Note that we copied the files over to demonstrate use of packages.
        //Testing interfaces challenge.
        //System.out.println();
        //System.out.println("Testing interfaces challenge...");
        //testInterfaceChallenge();

        //Testing exercise on packages...
        //System.out.println();
        //System.out.println("Testing exercise on packages...");
        //System.out.println(Series.nSum(10));
        //System.out.println(Series.factorial(4));
        //System.out.println(Series.fibonacci(10));

/*        //Demo on scope...
        System.out.println();
        System.out.println("Demo on scope...");

        //The privateVariable has a scope that is restricted to the main method's code block.
        String privateVariable = "This variable is private to main() method.";
        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("The value of ScopeCheck instance's privateVariable is " + scopeCheck.getPrivateVariable() + ".");
        System.out.println(privateVariable);
        scopeCheck.timesTwo();

        System.out.println("****");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();

        //Testing scope exercise...
        //Note the use of same variable names are purely for challenging the
        //understanding of the scope.
        System.out.println();
        System.out.println("Testing scope exercise...");
        testScopeChallenge();*/

        //Demo on access modifiers...
        System.out.println();
        System.out.println("Demo on access modifiers...");

        Account amandaAccount = new Account("Amanda");
        amandaAccount.deposit(200);
        amandaAccount.deposit(400);
        amandaAccount.deposit(-600);
        amandaAccount.withdraw(-250);
        amandaAccount.withdraw(100);

        //Since we have declared class variables as public, they can be modified from anywhere outside of the class. This is not good.
        //The class variables balance and transactions should only be modified within deposit/withdraw/calculateBalance methods.
        //amandaAccount.balance = 1000;
        //amandaAccount.transactions.add(500);
        System.out.println("The balance on Amanda's account is " + amandaAccount.getBalance() + ".");
    }

    private static void testScopeChallenge() {
        X x = new X(x());
        x.x();
    }

    private static int x() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter an integer.");
        return x.nextInt();
    }

    private static void testInterfaceChallenge() {
        ISavable myPlayer = new Player("Kaveesha", 170, 89, "Gun");
        saveToStorage(myPlayer);
        //loadToObject(myPlayer);
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
}
