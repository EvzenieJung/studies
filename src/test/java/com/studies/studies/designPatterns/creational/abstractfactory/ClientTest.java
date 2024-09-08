package com.studies.studies.designPatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

class ClientTest {

    Client client1 = new Client(new DatabaseFactory());
    Client client2 = new Client(new NetworkFactory());

    @Test
    void execute() {
        client1.execute();
        client2.execute();
    }

}