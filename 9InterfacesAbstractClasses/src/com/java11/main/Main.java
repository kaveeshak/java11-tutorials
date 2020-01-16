package com.java11.main;

import com.java11.tutorials.DeskPhone;
import com.java11.tutorials.ITelephone;
import com.java11.tutorials.MobilePhone;

public class Main {
    public static void main(String[] args) {
        //Demo on Interfaces.
        testInterfacesDemo();
    }

    private static void testInterfacesDemo() {
        ITelephone myPhone = new DeskPhone(7630603);
        myPhone.powerOn();
        myPhone.callPhone(7630603);
        myPhone.answer();

        myPhone = new MobilePhone(2345);
        myPhone.powerOn();
        myPhone.callPhone(2345);
        myPhone.answer();
    }
}
