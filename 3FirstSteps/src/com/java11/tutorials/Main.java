package com.java11.tutorials;

public class Main {
    public static void main(String[] args) {
        //Variables.
        System.out.println("Variables...");
        int age = 26;
        int newMiles = 3421 + 52;
        System.out.println(age);
        System.out.println("newMiles");

        //Primitive data types.
        System.out.println("Primitive data types...");

        //int data type.
        //From -2.147 to +2.147 billions.
        int myIntNumber = 21_000_000;
        int myNewIntNumber = (myIntNumber / 2);
        System.out.println("myNewIntNumber: " + myNewIntNumber);

        //byte data type.
        //From -128 to +127
        byte myByteNumber = 100;
        byte myNewByteNumber = (byte) (myByteNumber / 2);
        System.out.println("myNewByteNumber: " + myNewByteNumber);

        //short data type.
        //From -32768 to +32767
        short myShortNumber = 29_028;
        short myNewShortNumber = (short) (myShortNumber / 2);
        System.out.println("myNewShortNumber: " + myNewShortNumber);

        //long data type.
        // From -(2^63) to +((2^63) - 1)
        long myLongNumber = 9223372036854775807L;

        //Quiz
        byte number1 = 10;
        short number2 = 20;
        int number3 = 50;
        long number4 = 50000L + (10 * (number1 + number2 + number3));
        System.out.println("number4 variable value:" + number4);
    }
}
