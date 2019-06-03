package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //if keyword
        int miles = 5;
        int score = 5000;

        if (miles <= 5)
            System.out.println("There are less than 5 miles."); miles++;
            System.out.println(miles);

        if(score > 5000 && score < 10000) {
            System.out.println("The score was greater than 5000 and less than 10000.");
        } else if (score <= 5000) {
            System.out.println("The score was less than or equal to 5000.");
        } else {
            System.out.println("This was executed.");
        }

        //Variables inside a code block
        boolean isMorning = true;

        if (isMorning) {
            int time = 10;
            System.out.println("Time is " + time + " in the morning.");
        }
    }
}
