package com.java11.exercises;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter) {
        this.tonerLevel = 100;
        this.numberOfPagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int amount) {
        if (amount > 0) {
            if (((this.tonerLevel + amount) % 100) > 0) {
                this.tonerLevel = 100;
            } else {
                this.tonerLevel += amount;
            }
        }
    }

    public void print(int numberOfPages) {
        if (numberOfPages > 0) {
            if (this.isDuplexPrinter) {
                this.numberOfPagesPrinted = (int) Math.ceil((numberOfPages / 2.0));
            } else {
                this.numberOfPagesPrinted += numberOfPages;
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
