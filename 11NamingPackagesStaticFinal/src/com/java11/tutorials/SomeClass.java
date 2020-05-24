package com.java11.tutorials;

public class SomeClass {
    private final String name;
    private static int classCounter = 0;
    private final int instanceNumber;

    public SomeClass(String name) {
        //Final variables can be modified only at the declaration or in the constructor.
        this.name = name;
        this.classCounter++;
        this.instanceNumber = classCounter;
        System.out.println("The instance " + name + " is created. The instance number is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
