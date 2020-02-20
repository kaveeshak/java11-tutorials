package com.java11.tutorials;

public class Main {
    public static void main(String[] args) {
        System.out.println("Expressions and Statements...");
        //Quiz: Expressions
        int score = 100; //Expression: score = 100
        if (score > 99) { //Expression: score > 99
            System.out.println("You got the high score!"); //Expression: "You got the high score!"
            score = 0; //Expression: score = 0
        }

        //The if statement.
        System.out.println();
        System.out.println("The if statement...");
        int miles = 5;
        score = 5000;

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
