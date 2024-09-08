package com.studies.studies.designPatterns.creational.builder.singleton;

import com.studies.studies.designPatterns.creational.singleton.singleton.SingletonEager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonEagerTest {

    SingletonEager singletonEager1 = SingletonEager.getInstance();
    SingletonEager singletonEager2 = SingletonEager.getInstance();

    @Test
    void getInstance() {
        Assertions.assertEquals(singletonEager1, singletonEager2);
    }

}