package com.java11.exercises;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Distance between X,Y and 0,0
    public double distance() {
        return  Math.sqrt(Math.pow((x - 0), 2) + Math.pow(y - 0, 2));
    }

    public double distance(int x, int y) {
        return  Math.sqrt(Math.pow((this.x - x), 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
