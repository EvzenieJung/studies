package com.studies.studies.designPatterns.structural.adapter;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        DatabaseDataGenerator generator = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayDataThirdParty> displayData = adapter.convertData(generator.generateData());
        for (DisplayDataThirdParty dd : displayData) {
            dd.display();
        }
    }
}