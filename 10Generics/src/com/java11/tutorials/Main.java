package com.java11.tutorials;

import com.java11.exercises.League;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics
        System.out.println("Demo on Java Generics.");
        demoOnGenericTypes();

        //Testing generics exercise.
        System.out.println();
        System.out.println("Testing generics exercise.");
        testGenericsExercise();
    }

    private static void testGenericsExercise() {
        Team<CricketPlayer> sriLankanCricket = new Team<>("Sri Lankan Cricket");
        Team<CricketPlayer> australianCricket = new Team<>("Australian Cricket");
        Team<CricketPlayer> englandCricket = new Team<>("England Cricket");
        Team<CricketPlayer> indianCricket = new Team<>("Indian Cricket");

        sriLankanCricket.setMatchResults(australianCricket, 5, 8);
        australianCricket.setMatchResults(indianCricket, 54, 23);
        indianCricket.setMatchResults(sriLankanCricket, 21, 34);
        englandCricket.setMatchResults(australianCricket, 34, 28);

        //A cricket league can only have cricket teams. So we made the League class generic.
        League<Team<CricketPlayer>> worldCricketLeague = new League<>("World Cricket League");
        worldCricketLeague.addTeam(sriLankanCricket);
        worldCricketLeague.addTeam(australianCricket);
        worldCricketLeague.addTeam(englandCricket);
        worldCricketLeague.addTeam(indianCricket);

        worldCricketLeague.printTeams();
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

        Team footBallTeam = new Team("footBallTeam");
        footBallTeam.addPlayer(footballPlayer);
        footBallTeam.addPlayer(baseballPlayer);
        footBallTeam.addPlayer(soccerPlayer);

        System.out.println(footBallTeam.getNumberOfPlayers());

        //The issue here is that the Team class is allowing to add any type of players without an actual check.
        //Above we have created an object for a football team. However since there are no checks in place, we can add
        //players from different sports.

        //This is how we fix it. We can make the Team class generic and pass in the type.
        Team<FootballPlayer> footBallTeam2 = new Team<>("footBallTeam2");
        footBallTeam2.addPlayer(footballPlayer);
        Team<BaseballPlayer> baseBallTeam = new Team<>("baseBallTeam");
        baseBallTeam.addPlayer(baseballPlayer);
        Team<SoccerPlayer> soccerTeam = new Team<>("soccerTeam");
        soccerTeam.addPlayer(soccerPlayer);

        //baseBallTeam.addPlayer(footballPlayer); This will result in an error now that our class is type checked.

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer Team");
        //The issue here is that we can pass any type of team object since the method is not type checked.
        //We need to use the generic type in the method parameter.
        //baseBallTeam.setMatchResults(soccerPlayerTeam, 3, 10);

        footBallTeam2.setMatchResults(footBallTeam, 1, 0);
        footBallTeam.setMatchResults(footBallTeam2, 0, 0);

        System.out.println();
        System.out.println("Rankings");
        System.out.println(footBallTeam.getName() + ": " + footBallTeam.getRanking());
        System.out.println(footBallTeam2.getName() + ": " + footBallTeam2.getRanking());

        //We are using the compareTo method that we overrode.
        System.out.println(footBallTeam2.compareTo(footBallTeam));
    }
}
