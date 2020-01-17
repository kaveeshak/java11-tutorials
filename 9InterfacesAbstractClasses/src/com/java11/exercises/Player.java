package com.java11.exercises;

import java.util.*;

public class Player implements ISavable {
    private String name;
    private int points;
    private int strength;
    private String weapon;

    public Player(String name, int points, int strength, String weapon) {
        this.name = name;
        this.points = points;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public List<String> getValuesToSave() {
        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, Integer.toString(points));
        values.add(2, Integer.toString(strength));
        values.add(3, weapon);

        return values;
    }

    @Override
    public void setValues(List<String> values) {
        if (values != null && values.size() > 0) {
            name = values.get(0);
            points = Integer.parseInt(values.get(1));
            strength = Integer.parseInt(values.get(2));
            weapon = values.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
