package com.studies.studies.designPatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementos = new ArrayList<>();

    public void saveState(Memento memento) {
        mementos.add(memento);
    }

    public Memento restoreState(int index) {
        return mementos.get(index);
    }
}