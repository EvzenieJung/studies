package com.studies.studies.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDataGenerator {

    public List<DatabaseData> generateData() {
        List<DatabaseData> data = new ArrayList<>();
        data.add(new DatabaseData(1, 1000));
        data.add(new DatabaseData(2, 2000));
        data.add(new DatabaseData(3, 3000));
        return data;
    }
}
