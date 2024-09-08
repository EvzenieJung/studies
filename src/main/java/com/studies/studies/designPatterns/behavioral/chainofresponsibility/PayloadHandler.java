package com.studies.studies.designPatterns.behavioral.chainofresponsibility;

public class PayloadHandler implements HandlerChain {

    String payload;
    public HandlerChain nextHandler;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHandler) {
        var outputHandler = inputHandler + "\nPayloadHandler " + payload;

        if (nextHandler == null) {
            return outputHandler;
        }
        return nextHandler.addHandler(outputHandler);
    }
}
