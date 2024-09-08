package com.studies.studies.designPatterns.creational.abstractfactory;

public class Client {

    private final Service service;
    private final Response response;

    public Client(DataSourceAbstractFactory factory) {
        this.service = factory.createService();
        this.response = factory.createResponse();
    }

    public void execute() {
        if (service != null && response != null) {
            System.out.println("Executing Service: " + service.runService());
            System.out.println("Response: " + response.getResponse());
        }
    }
}
