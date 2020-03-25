package com.java11.tutorials;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics
        System.out.println("Demo on Java Generics.");
        demoOnGenericTypes();
    }

    private static void demoOnGenericTypes() {
        //ArrayList is Generic. This is an example of raw type usage and issues that arise.
        ArrayList integerArrayList = new ArrayList();
        integerArrayList.add(3);
        integerArrayList.add(56);
        //No error since we are storing an object and no data type has been given in the ArrayList.
        //integerArrayList.add("Wrong data type");
        integerArrayList.add(45);

        for (Object item: integerArrayList) {
            //We used casting since mathematical operations can't be applied on Object type.
            //However will throw an error at run time since integerArrayList contains a String value which can't be
            //casted as as an Integer.
            //System.out.println((Integer) item * 2);
        }

        //The recommended way of creating an ArrayList.
        ArrayList<String> myStringArrayList = new ArrayList<>();
        myStringArrayList.add("Life");
        myStringArrayList.add("is");
        myStringArrayList.add("not");
        myStringArrayList.add("easy");

        for (String item: myStringArrayList) {
            System.out.print(item + " ");
        }

        System.out.println();

        FootballPlayer footballPlayer = new FootballPlayer("Bryan");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Beck");
        SoccerPlayer soccerPlayer = new SoccerPlayer("Dick");

        Team americanNationalFootballTeam = new Team("American National Football Team");
        americanNationalFootballTeam.addPlayer(footballPlayer);
        americanNationalFootballTeam.addPlayer(baseballPlayer);
        americanNationalFootballTeam.addPlayer(soccerPlayer);

        System.out.println(americanNationalFootballTeam.getNumberOfPlayers());

        //The issue here is that the Team class is allowing to add any type of players without an actual check.
        //Above we have created an object for a football team. However since there are no checks in place, we can add
        //players from different sports.

        //This is how we fix it now that our class is Generic.
        Team<BaseballPlayer> baseBallTeam = new Team<>("NJ Baseball Team");
        //baseBallTeam.addPlayer(footballPlayer); This will result in an error now that our class is type checked.
        baseBallTeam.addPlayer(baseballPlayer);
        System.out.println(baseBallTeam.getNumberOfPlayers());

    }
}
