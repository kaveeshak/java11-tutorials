package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //Methods
        double height = 10d;
        double base = 30d;

        double area1 = calculateAreaOfTriangle(10, 20);
        System.out.println("The area of the triangle 1 is " + area1);

        double area2 = calculateAreaOfTriangle(height, base);
        System.out.println("The area of the triangle 2 is " + area2);

        //Quiz
        displayHighScorePosition("Kavi", calculateHighScorePosition(1500));
        displayHighScorePosition("Nishi", calculateHighScorePosition(900));
        displayHighScorePosition("Ama", calculateHighScorePosition(400));
        displayHighScorePosition("Honey", calculateHighScorePosition(50));

    }

    public static int calculateHighScorePosition(int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {

        System.out.println(playersName + " managed to get into position " +
                playersPosition + " on the high score table.");
    }

    public static double calculateAreaOfTriangle(double height, double base) {

        double area = ((height * base)/2);

        return area;
    }
}
