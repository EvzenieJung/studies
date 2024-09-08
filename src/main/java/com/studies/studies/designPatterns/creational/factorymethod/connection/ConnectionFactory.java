package com.studies.studies.designPatterns.creational.factorymethod.connection;

public class ConnectionFactory {

    Connection getConnection(String dbType) {
        if (dbType == null) {
            return null;
        }
        return switch (dbType.toLowerCase()) {
            case "mysql" -> new MySql();
            case "postgresql" -> new PostgreSql();
            default -> throw new IllegalArgumentException("Invalid database type");
        };
    }
}
