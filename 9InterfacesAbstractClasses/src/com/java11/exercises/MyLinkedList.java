package com.java11.exercises;

public class MyLinkedList implements NodeList {
    ListItem root = null;

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    //Adds in ascending order.
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int currentItemCompareResults = currentItem.compareTo(newItem);
            if (currentItemCompareResults < 0) {
                if (currentItem.nextItem() != null) {
                    currentItem = currentItem.nextItem();
                } else {
                    //currentItem.setNextItem(newItem);
                    //newItem.setPreviousItem(currentItem);

                    //Since setNextItem method returns the item that we set, we can abbreviate this
                    //code a little.
                    currentItem.setNextItem(newItem).setPreviousItem(currentItem);
                    return true;
                }
            } else if (currentItemCompareResults > 0) {
                if (currentItem.previousItem() == null) {
                    //Abbreviated as above.
                    newItem.setNextItem(currentItem).setPreviousItem(newItem);
                    //currentItem.setPreviousItem(newItem);
                    root = newItem;
                } else {
                    //Abbreviates as above.
                    currentItem.previousItem().setNextItem(newItem).setPreviousItem(currentItem.previousItem());
                    //newItem.setPreviousItem(currentItem.previousItem());
                    newItem.setNextItem(currentItem).setPreviousItem(newItem);
                    //currentItem.setPreviousItem(newItem);
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " already exists.");
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean removeItem(ListItem removeItem) {
        if (removeItem == null) {
            System.out.println("Invalid argument.");
            return false;
        }

        System.out.println("Removing " + removeItem.getValue() + " from the list.");
        ListItem currentItem = root;
        while (currentItem != null) {
            int removeItemCompareResult = currentItem.compareTo(removeItem);
            if (removeItemCompareResult == 0) {
                if (currentItem == root) {
                    root = currentItem.nextItem();
                } else {
                    currentItem.previousItem().setNextItem(currentItem.nextItem());
                    if (currentItem.nextItem() != null) {
                        currentItem.nextItem().setPreviousItem(currentItem.previousItem());
                    }
                }
                return true;
            } else if (removeItemCompareResult < 0) {
                currentItem = currentItem.nextItem();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.nextItem();
            }
        }
    }
}
