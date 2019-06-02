package com.java11.tutorials;

public class Main {

    public static void main(String[] args) {

        //Some operators that performs mathematical operations.
        int myInt = 30 + 10;
        System.out.println("30 + 10 = " + myInt);

        myInt = myInt - 2;
        System.out.println("myInt - 2 = " + myInt);

        myInt = myInt * 4;
        System.out.println("myInt * 4 = " + myInt);

        myInt = myInt / 2;
        System.out.println("myInt / 2 = " + myInt);

        myInt = myInt % 3;
        System.out.println("myInt % 3 = " + myInt);

        myInt++;
        System.out.println("myInt++ = " + myInt);

        myInt--;
        System.out.println("myInt * 4 = " + myInt);

        myInt += 14;
        System.out.println("myInt += 14 = " + myInt);

        myInt %= 6;
        System.out.println("myInt %= 6 = " + myInt);

        //More operators.
        if (myInt == 3)
            System.out.println("myInt equals to 3.");

        if (myInt != 3)
            System.out.println("myInt not equals to 3.");

        boolean isLifeHard = true;

        if ((myInt <= 5) && (isLifeHard == true))
            System.out.println("myInt is less than or equal to 5 and life is hard.");

        //Ternary Operator
        boolean wasLifeHard = isLifeHard ? true : false;
        if (wasLifeHard)
            System.out.println("Life was hard.");

        //Quiz
        double myDouble1 = 20d;
        double myDouble2 = 80d;
        double result = (myDouble1 + myDouble2) * 25;

        if ((result % 40) <= 20)
            System.out.println("The total was over the limit.");

    }
}
