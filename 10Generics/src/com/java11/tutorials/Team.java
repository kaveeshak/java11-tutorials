package com.java11.tutorials;

import java.util.ArrayList;

public class Team<T extends Player > implements Comparable<Team<T>> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        members = new ArrayList<>();
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("The player " + player.getName() + " already exist in the team.");
            return false;
        } else {
            System.out.println("The player " + player.getName() + " is added to the team.");
            members.add(player);
            return true;
        }
    }

    public void setMatchResults(Team<T> opponentTeam, int ourScore, int theirScore) {
        String printMessage;

        if (ourScore > theirScore) {
            won++;
            printMessage = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            printMessage = " lost to ";
        } else {
            tied++;
            printMessage = " drew with ";
        }

        played++;

        if (opponentTeam != null) {
            System.out.println(getName() + printMessage + opponentTeam.getName());
            opponentTeam.setMatchResults(null, theirScore, ourScore);
        }
    }

    public int getRanking() {
        return (won * 2) + played;
    }

    public int getNumberOfPlayers() {
        return members.size();
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public ArrayList<T> getMembers() {
        return members;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (getRanking() < team.getRanking()) {
            return -1;
        } else if (getRanking() == team.getRanking()) {
            return 0;
        } else {
            return 1;
        }
    }
}
