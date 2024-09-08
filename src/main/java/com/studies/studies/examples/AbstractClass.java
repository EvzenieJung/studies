package com.studies.studies.examples;

public abstract class AbstractClass {


    public abstract String getData();

    protected abstract void printData();

    public void doSomething() {
        System.out.println("This is an abstract method in AbstractClass");
    }

    private void privateMethod() {
        System.out.println("This is a private method in AbstractClass");
    }
}
