package com.java11.tutorials;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not a good flier. Can I take a swim instead?");
    }
}
