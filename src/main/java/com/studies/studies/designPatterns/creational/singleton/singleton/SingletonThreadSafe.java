package com.studies.studies.designPatterns.creational.singleton.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
