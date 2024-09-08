package com.studies.studies.designPatterns.creational.abstractfactory;

public interface DataSourceAbstractFactory {

    Service createService();
    Response createResponse();
}
