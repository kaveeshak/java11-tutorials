package com.java11.tutorials;

public class StaticTest {
    private String name;
    private static int numberOfInstances = 0;

    public StaticTest(String name) {
        this.name = name;
        numberOfInstances++;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }
}
