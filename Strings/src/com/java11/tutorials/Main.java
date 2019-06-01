package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //String data type.
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

    }
}
