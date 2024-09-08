package com.studies.studies.designPatterns.creational.factorymethod.connection;

public class MySql implements Connection {
    @Override
    public String getConnection() {
        return "MySQL";
    }
}
