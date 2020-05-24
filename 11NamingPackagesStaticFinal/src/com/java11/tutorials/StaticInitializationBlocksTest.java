package com.java11.tutorials;

public class StaticInitializationBlocksTest {
    public static final int testFinalStaticVariable;

    static {
        testFinalStaticVariable = 10;
        System.out.println("SIB 1 is called.");
    }

    public StaticInitializationBlocksTest() {
        System.out.println("StaticInitializationBlocksTest's constructor is called.");
    }

    static {
        System.out.println("SIB 2 is called.");
    }

    public void testMethod() {
        System.out.println("The testMethod is called.");
    }
}
