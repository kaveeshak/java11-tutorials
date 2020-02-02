package com.java11.tutorials;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies from one tree to another.");
    }
}
