package com.java11.exercises;

public class SearchTree implements NodeList {
    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (root == null) {
            root = listItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int currentItemSize = currentItem.compareTo(listItem);
            if (currentItemSize > 0) {  //Left tree.
                if (currentItem.previousItem() != null) {
                    currentItem = currentItem.previousItem();
                } else {
                    currentItem.setPreviousItem(listItem);
                    return true;
                }
            } else if (currentItemSize < 0) {   //Right tree.
                if (currentItem.nextItem() != null) {
                    currentItem = currentItem.nextItem();
                } else {
                    currentItem.setNextItem(listItem);
                    return true;
                }
            } else { //Values are equal. Ignored.
                System.out.println("The value " + listItem.getValue() + " already exists.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem removeItem) {
        if (root == null) {
            System.out.println("The binary search tree is empty.");
            return false;
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previousItem());
            System.out.println(root.getValue());
            traverse(root.nextItem());
        }
    }
}
