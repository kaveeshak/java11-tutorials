package com.java11.exercises;

public class Sum3And5Challenge {

    public static void sum3And5() {

        int count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                count++;
                sum += i;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
