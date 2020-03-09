package com.java11.tutorials;

import java.util.ArrayList;

public class Team {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private ArrayList<Player> members;

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        members = new ArrayList<>();
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println("The player " + player.getName() + " already exist in the team.");
            return false;
        } else {
            System.out.println("The player " + player.getName() + " is added to the team.");
            return true;
        }
    }

    public void setMatchResults(Team opponentTeam, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }

        played++;

        if (opponentTeam != null) {
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

    public ArrayList<Player> getMembers() {
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
}
