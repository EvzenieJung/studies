package com.studies.studies.designPatterns.creational.abstractfactory;

public class NetworkResponse implements Response {

    @Override
    public String getResponse() {
        return "Network Response";
    }
}
