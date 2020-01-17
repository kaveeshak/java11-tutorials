package com.java11.exercises;

import java.util.List;

public interface ISavable {
    List<String> getValuesToSave();
    void setValues(List<String> values);
}
