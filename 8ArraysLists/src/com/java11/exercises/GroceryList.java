package com.java11.exercises;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in the grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String item) {
        String oldItem = groceryList.get(position);
        groceryList.set(position, item);
        System.out.println("The grocery item " + oldItem + " modified to " + groceryList.get(position));
    }

    public void removeGroceryItem(int position) {
        String oldItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery item " + oldItem + " at position " + position + " is removed.");
    }

    public String findItem(String item) {
        int itemPosition = groceryList.indexOf(item);
        if (itemPosition >= 0) {
            return groceryList.get(itemPosition);
        }
        return null;
    }
}
