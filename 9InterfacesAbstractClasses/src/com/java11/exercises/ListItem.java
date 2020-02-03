package com.java11.exercises;

public abstract class ListItem {
    protected Object value;
    protected ListItem next;
    protected ListItem previous;

    public ListItem(Object value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    abstract ListItem nextItem();

    abstract ListItem setNextItem(ListItem listItem);

    abstract ListItem previousItem();

    abstract ListItem setPreviousItem(ListItem listItem);

    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
