package com.studies.studies.designPatterns.creational.abstractfactory;

public class DatabaseResponse implements Response {

    @Override
    public String getResponse() {
        return "Database Response";
    }
}
