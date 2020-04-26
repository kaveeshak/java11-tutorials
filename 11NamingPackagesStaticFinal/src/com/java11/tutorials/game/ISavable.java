package com.java11.tutorials.game;

import java.util.List;

public interface ISavable {
    List<String> getValuesToSave();
    void setValues(List<String> values);
}
