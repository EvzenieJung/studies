package com.studies.studies.designPatterns.creational.factorymethod.connection;

public class PostgreSql implements Connection {
    // Implementation for PostgreSQL connection

    @Override
    public String getConnection() {
        return "PostgreSQL";
    }
}
