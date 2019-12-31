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

    public void modifyGroceryItem(String oldItem, String newItem) {
        int oldItemPosition = groceryList.indexOf(oldItem);
        if (oldItemPosition >= 0) {
            groceryList.set(oldItemPosition, newItem);
            System.out.println("The grocery item " + oldItem + " modified to " + newItem);
        } else {
            System.out.println("The grocery item not found.");
        }
    }

    public void removeGroceryItem(String item) {
        int itemPosition = groceryList.indexOf(item);
        if (itemPosition >= 0) {
            groceryList.remove(itemPosition);
            System.out.println("Grocery item " + item + "is removed.");
        } else {
            System.out.println("The grocery item not found.");
        }
    }

    public String findItem(String item) {
        int itemPosition = groceryList.indexOf(item);
        if (itemPosition >= 0) {
            return groceryList.get(itemPosition);
        }
        return null;
    }
}
