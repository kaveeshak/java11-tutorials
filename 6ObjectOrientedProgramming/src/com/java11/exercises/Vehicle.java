package com.java11.exercises;

public class Vehicle {
    private String name;
    private String size;
    private int velocity;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.velocity + " in direction " + this.direction);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void stop() {
        velocity = 0;
    }
}
