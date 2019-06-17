package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        int value = 3;

        switch(value) {
            case 1:
                System.out.println("Value is 1.");
                break;

            case 2:
                System.out.println("Value is 2.");
                break;

            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5.");
                break;

            default:
                System.out.println("Value was not recognized.");
                break;
        }

        //Quiz
        char myChar = 'A';

        switch(myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The value was either A or B or C or D or E");
                break;

            default:
                System.out.println();
        }

    }
}
