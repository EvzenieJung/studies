package com.studies.studies.designPatterns.behavioral.chainofresponsibility;

public class AuthenticationHandler implements HandlerChain {

    String token;
    public HandlerChain nextHandler;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHandler) {
        String outputHandler = inputHandler + "\nAuthenticationHandler " + token;

        if (nextHandler == null) {
            return outputHandler;
        }
        return nextHandler.addHandler(outputHandler);
    }
}
