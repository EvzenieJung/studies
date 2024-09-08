package com.studies.studies.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

// Adapter class. The main class that converts data from the format DatabaseData to the format DisplayDataThirdParty
public class DisplayDataAdapter implements DatabaseDataConverter {

    @Override
    public List<DisplayDataThirdParty> convertData(List<DatabaseData> databaseData) {
        List<DisplayDataThirdParty> returnList = new ArrayList<>();
        for (DatabaseData datum : databaseData) {
            float index = datum.position;
            String data = Integer.toString(datum.amount);
            DisplayDataThirdParty dd = new DisplayDataThirdParty(index, data);
            returnList.add(dd);
        }
        return returnList;
    }
}
