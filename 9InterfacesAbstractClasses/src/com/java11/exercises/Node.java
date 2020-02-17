package com.java11.exercises;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem nextItem() {
        return next;
    }

    @Override
    ListItem setNextItem(ListItem listItem) {
        next = listItem;
        return next;
    }

    @Override
    ListItem previousItem() {
        return previous;
    }

    @Override
    ListItem setPreviousItem(ListItem listItem) {
        previous = listItem;
        return previous;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            return ((String) value).compareTo((String) listItem.value);
        } else {
            return -1;
        }
    }
}
