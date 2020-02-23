package com.java11.exercises;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean isWakeUp = false;

        if((hourOfDay >= 0 && hourOfDay <= 23) &&
           (hourOfDay > 22 || hourOfDay < 8) &&
            barking) {

            isWakeUp = true;
        }

        return isWakeUp;
    }
}
