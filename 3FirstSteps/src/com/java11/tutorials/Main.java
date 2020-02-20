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
        System.out.println();
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

        //Whole numbers division.
        System.out.println("Division with whole numbers...");
        int myIntValue = 5 / 2;
        short myShortValue = 20 / 3;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myShortValue: " + myShortValue);

        //float data type.
        float myFloatValue1 = 5f / 2f;
        float myFloatValue2 = (float) (12.65 / 3f);
        System.out.println("myFloatValue1: " + myFloatValue1);
        System.out.println("myFloatValue2: " + myFloatValue2);

        //double data type.
        double myDoubleValue1 = 5d / 2d;
        System.out.println("myDoubleValue1: " + myDoubleValue1);

        //Quiz
        double pounds = 4d;
        double kilos = (pounds * 0.45359237d);
        System.out.println(pounds + " pounds = " + kilos + " kilos.");

        //char data type.
        char myChar1 = 'd';
        char myChar2 = '#';
        char myChar3 = '5';
        char myChar4 = '\u00AE';
        char myChar5 = '\u3041';

        System.out.println(myChar4);
        System.out.println(myChar5);

        //boolean data type.
        boolean isFemale = true;
        System.out.println(isFemale);

        //String data type.
        System.out.println();
        System.out.println("String data type...");
        String myString = "This is my first string.";
        System.out.println(myString);
        myString = myString + " We can add more.";
        System.out.println(myString);
        System.out.println(myString + " 2015 \u00A9");
        System.out.println(myString);

        String myLastString = "My number is 34.26";
        int myInt = 5;
        boolean myBoolean = true;
        myLastString = myLastString + myInt + myBoolean;
        System.out.println(myLastString);

        //Operators.
        System.out.println();
        System.out.println("Operators...");

        //Some operators that performs mathematical operations.
        myInt = 30 + 10;
        System.out.println("30 + 10 = " + myInt);
        myInt = myInt - 2;
        System.out.println("myInt - 2 = " + myInt);
        myInt = myInt * 4;
        System.out.println("myInt * 4 = " + myInt);
        myInt = myInt / 2;
        System.out.println("myInt / 2 = " + myInt);
        myInt = myInt % 3;
        System.out.println("myInt % 3 = " + myInt);
        myInt++;
        System.out.println("myInt++ = " + myInt);
        myInt--;
        System.out.println("myInt * 4 = " + myInt);
        myInt += 14;
        System.out.println("myInt += 14 = " + myInt);
        myInt %= 6;
        System.out.println("myInt %= 6 = " + myInt);

        //More operators.
        if (myInt == 3)
            System.out.println("myInt equals to 3.");

        if (myInt != 3)
            System.out.println("myInt not equals to 3.");

        boolean isLifeHard = true;

        if ((myInt <= 5) && (isLifeHard == true))
            System.out.println("myInt is less than or equal to 5 and life is hard.");

        //Ternary Operator
        boolean wasLifeHard = isLifeHard ? true : false;
        if (wasLifeHard)
            System.out.println("Life was hard.");

        //Quiz
        double myDouble1 = 20d;
        double myDouble2 = 80d;
        double result = (myDouble1 + myDouble2) * 25;

        if ((result % 40) <= 20)
            System.out.println("The total was over the limit.");
    }
}
