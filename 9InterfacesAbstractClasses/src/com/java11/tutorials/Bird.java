package com.java11.tutorials;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The bird " + getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathe in and out...");
    }

    public abstract void fly();
}
