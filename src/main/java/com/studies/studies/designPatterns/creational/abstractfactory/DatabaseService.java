package com.studies.studies.designPatterns.creational.abstractfactory;

public class DatabaseService implements Service {

    @Override
    public String runService() {
        return "Running Database Service";
    }
}
