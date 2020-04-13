package com.java11.exercises;

import com.java11.tutorials.Team;
import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    public void printTeams() {
        Collections.sort(teams);
        for (T team : teams) {
            System.out.println(team.getName() + ": " + team.getRanking());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<T> teams) {
        this.teams = teams;
    }
}
