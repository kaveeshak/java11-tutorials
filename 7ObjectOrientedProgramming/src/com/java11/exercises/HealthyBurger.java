package com.java11.exercises;

public class HealthyBurger extends Hamburger{
    private boolean isMushrooms;
    private boolean isColeslaw;
    private double mushroomsPrice;
    private double coleslawPrice;

    public HealthyBurger(String meatType, double basePrice) {
        super("Healthy Burger", "Brown Rye Bread Roll", meatType, basePrice);
    }

    public void addMushrooms(double price) {
        isMushrooms = true;
        mushroomsPrice = price;
    }

    public void addColeslaw(double price) {
        isColeslaw = true;
        coleslawPrice = price;
    }

    @Override
    public double getFinalPrice() {
        double finalPrice = super.getFinalPrice();
        if (isMushrooms) {
            finalPrice += mushroomsPrice;
        }
        if (isColeslaw) {
            finalPrice += coleslawPrice;
        }
        return finalPrice;
    }

    @Override
    public void printDetailedFinalPrice() {
        System.out.println(super.getName());
        System.out.println("Base Price: " + super.getBasePrice());
        System.out.println("Additions: ");

        if (super.isLettuce()) {
            System.out.println("\tLettuce " + "(" + super.getLettucePrice() + ")");
        }
        if (isTomato()) {
            System.out.println("\tTomato " + "(" + super.getTomatoPrice() + ")");
        }
        if (isCarrot()) {
            System.out.println("\tCarrot " + "(" + super.getCarrotPrice() + ")");
        }
        if (isPickle()) {
            System.out.println("\tPickle " + "(" + super.getPicklePrice() + ")");
        }
        if (isColeslaw) {
            System.out.println("\tColeslaw " + "(" + coleslawPrice + ")");
        }
        if (isMushrooms) {
            System.out.println("\tPickle " + "(" + mushroomsPrice + ")");
        }

        System.out.println("Final Price: " + getFinalPrice());
    }
}
