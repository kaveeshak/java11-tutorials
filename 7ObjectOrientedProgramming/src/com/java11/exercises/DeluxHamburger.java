package com.java11.exercises;

public class DeluxHamburger extends Hamburger {
    private boolean isChips;
    private boolean isDrinks;
    private double chipsPrice;
    private double drinksPrice;

    public DeluxHamburger(String meatType, double basePrice) {
        super("Delux Hamburger", "White Bread Roll", meatType, basePrice);
        this.isChips = true;
        this.isDrinks = true;
        this.chipsPrice = 0.00;
        this.drinksPrice = 0.00;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice();
    }

    @Override
    public void addLettuce(double price) {
        System.out.println("No additions allowed for Delux Hamburger.");
    }

    @Override
    public void addTomato(double price) {
        System.out.println("No additions allowed for Delux Hamburger.");
    }

    @Override
    public void addCarrot(double price) {
        System.out.println("No additions allowed for Delux Hamburger.");
    }

    @Override
    public void addPickle(double price) {
        System.out.println("No additions allowed for Delux Hamburger.");
    }

    @Override
    public void printDetailedFinalPrice() {
        System.out.println(super.getName());
        System.out.println("Base Price: " + super.getBasePrice());
        System.out.println("Additions: ");

        if (isChips) {
            System.out.println("\tChips " + "(" + chipsPrice + ")");
        }
        if (isDrinks) {
            System.out.println("\tDrinks " + "(" + drinksPrice + ")");
        }

        System.out.println("Final Price: " + getFinalPrice());
    }
}
