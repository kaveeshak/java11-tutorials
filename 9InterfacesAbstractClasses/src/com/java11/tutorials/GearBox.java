package com.java11.tutorials;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maximumGears;
    private int currentGear;
    private boolean isOperateClutch;

    public GearBox(int maximumGears, int currentGear) {
        this.gears = new ArrayList<Gear>();
        this.gears.add(new Gear(0, 0.0));
        this.maximumGears = maximumGears;
        this.currentGear = currentGear;
        this.isOperateClutch = false;
    }

    public void operateClutch(boolean pushIn) {
        isOperateClutch = pushIn;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maximumGears) {
            gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int number) {
        if (number >= 0 && number < gears.size() && isOperateClutch) {
            currentGear = number;
            System.out.println("Gear " + number + " selected.");
        } else {
            System.out.println("Bad gear change.");
        }
    }

    public double wheelSpeed(int revolutions) {
        if (isOperateClutch) {
            System.out.println("Error, Clutch is in.");
            return 0.0;
        }
        return revolutions * gears.get(currentGear).ratio;
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revolution) {
            return ratio * revolution;
        }
    }
}
