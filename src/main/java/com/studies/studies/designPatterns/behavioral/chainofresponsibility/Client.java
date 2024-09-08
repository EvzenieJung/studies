package com.studies.studies.designPatterns.behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        var auth = new AuthenticationHandler("1234567");
        var content = new ContentTypeHandler("json");
        var payload = new PayloadHandler("Body: {\"name\": \"John Doe\"}");
        auth.nextHandler= content;
        content.nextHandler = payload;

        var withAuthentication = auth.addHandler("Headers with authentication");
        System.out.println(withAuthentication);
    }
}
