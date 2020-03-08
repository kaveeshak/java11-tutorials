package com.java11.tutorials;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics
        demoOnGenericTypes();
    }

    private static void demoOnGenericTypes() {
        //ArrayList is Generic. This is an example of raw type usage and issues that arise.
        ArrayList integerArrayList = new ArrayList();
        integerArrayList.add(3);
        integerArrayList.add(56);
        //No error since we are storing an object and no data type has been given in the ArrayList.
        //integerArrayList.add("Wrong data type");
        integerArrayList.add(45);

        for (Object item: integerArrayList) {
            //We used casting since mathematical operations can't be applied on Object type.
            //However will throw an error at run time since integerArrayList contains a String value which can't be
            //casted as as an Integer.
            //System.out.println((Integer) item * 2);
        }

        //The recommended way of creating an ArrayList.
        ArrayList<String> myStringArrayList = new ArrayList<>();
        myStringArrayList.add("Life");
        myStringArrayList.add("is");
        myStringArrayList.add("not");
        myStringArrayList.add("easy");

        for (String item: myStringArrayList) {
            System.out.print(item + " ");
        }
    }
}
