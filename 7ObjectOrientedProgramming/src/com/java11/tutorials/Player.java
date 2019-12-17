package com.java11.tutorials;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player is knocked out.");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
