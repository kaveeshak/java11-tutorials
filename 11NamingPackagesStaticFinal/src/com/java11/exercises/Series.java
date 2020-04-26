package com.java11.exercises;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial = 0;
        for (int i = 1; i <= n; i++) {
            if (factorial == 0) {
                factorial += i;
            } else {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
