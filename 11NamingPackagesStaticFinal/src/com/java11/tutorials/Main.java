package com.java11.tutorials;

public class Main {
    public static void main(String [] args) {
        //Note that this section is not about AWT. This is an attempt to show the use of packages.
        System.out.println("Use of packages...");
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
