package com.java11.tutorials;

public class Dog extends Animal {
    //Unique characteristics for a dog.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() is called.");
    }

    @Override
    public void eat() {
        System.out.println();
        System.out.println("Dog.eat() is called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() is called.");
        move(2);
    }

    public void run() {
        System.out.println("Dog.run() is called.");
        move(5);
    }
}
