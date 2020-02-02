package com.java11.tutorials;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The dog " + getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathe in and out...");
    }
}
