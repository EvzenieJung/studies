package com.studies.studies.designPatterns.structural.facade;

public class NetworkAccessFacade {

    private Communicator communicator = new Communicator();
    private Cache cache = new Cache();
    private Interceptor interceptor = new Interceptor();
    private Convertor convertor = new Convertor();

    public void communicate() {
        cache.cache();
        communicator.send("Send data");
        communicator.receive("Response");
        interceptor.intercept();
        convertor.convert();
    }
}
