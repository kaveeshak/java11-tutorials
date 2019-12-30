package com.java11.exercises;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meatType;
    private boolean isLettuce;
    private boolean isTomato;
    private boolean isCarrot;
    private boolean isPickle;
    private double lettucePrice;
    private double tomatoPrice;
    private double carrotPrice;
    private double picklePrice;
    private double basePrice;

    public Hamburger(String name, String breadRollType, String meatType, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        double finalPrice = basePrice;
        if (isLettuce) {
            finalPrice += lettucePrice;
        }
        if (isTomato) {
            finalPrice += tomatoPrice;
        }
        if (isCarrot) {
            finalPrice += carrotPrice;
        }
        if (isPickle) {
            finalPrice += picklePrice;
        }
        return finalPrice;
    }

    public void printDetailedFinalPrice() {
        System.out.println(name);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Additions: ");

        if (isLettuce) {
            System.out.println("\tLettuce " + "(" + lettucePrice + ")");
        }
        if (isTomato) {
            System.out.println("\tTomato " + "(" + tomatoPrice + ")");
        }
        if (isCarrot) {
            System.out.println("\tCarrot " + "(" + carrotPrice + ")");
        }
        if (isPickle) {
            System.out.println("\tPickle " + "(" + picklePrice + ")");
        }

        System.out.println("Final Price: " + getFinalPrice());
    }

    public void addLettuce(double price) {
        isLettuce = true;
        lettucePrice = price;
    }

    public void addTomato(double price) {
        isTomato = true;
        tomatoPrice = price;
    }

    public void addCarrot(double price) {
        isCarrot = true;
        carrotPrice = price;
    }

    public void addPickle(double price) {
        isPickle = true;
        picklePrice = price;
    }

    public String getName() {
        return name;
    }

    public boolean isLettuce() {
        return isLettuce;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public boolean isPickle() {
        return isPickle;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getPicklePrice() {
        return picklePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
