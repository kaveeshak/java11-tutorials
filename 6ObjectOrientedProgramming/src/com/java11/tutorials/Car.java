package com.java11.tutorials;

public class Car {

    private String make;
    private String model;
    private String year;
    private int numberOfDoors;

    public void setModel(String model) {
        if (model.equalsIgnoreCase("4Runner") ||
            model.equalsIgnoreCase("Camry")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
