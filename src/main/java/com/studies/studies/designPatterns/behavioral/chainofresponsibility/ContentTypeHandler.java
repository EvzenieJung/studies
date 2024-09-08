package com.studies.studies.designPatterns.behavioral.chainofresponsibility;

public class ContentTypeHandler implements HandlerChain {
    String contentType;
    public HandlerChain nextHandler;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String addHandler(String inputHandler) {
        var outputHandler = inputHandler + "\nContentTypeHandler " + contentType;

        if (nextHandler == null) {
            return outputHandler;
        }
        return nextHandler.addHandler(outputHandler);
    }

}
