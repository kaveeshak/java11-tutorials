package com.java11.exercises;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int strength;
    private String weapon;

    public Monster(String name, int strength, String weapon) {
        this.name = name;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public List<String> getValuesToSave() {
        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + strength);
        values.add(2, weapon);

        return values;
    }

    @Override
    public void setValues(List<String> values) {
        name = values.get(0);
        strength = Integer.parseInt(values.get(1));
        weapon = values.get(2);
    }

    public void callOtherMosters() {
        System.out.println("Calling other monsters.");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
