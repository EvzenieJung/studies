package com.studies.studies.designPatterns.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {

    List<DisplayDataThirdParty> convertData(List<DatabaseData> databaseData);
}
