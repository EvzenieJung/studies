package com.studies.studies.designPatterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        LowercaseStrategy lowercaseStrategy = new LowercaseStrategy();
        UppercaseStrategy uppercaseStrategy = new UppercaseStrategy();
        RandomCaseStrategy randomCaseStrategy = new RandomCaseStrategy();

        String input = "Hello, World!";
        Executor executorLow = new Executor(lowercaseStrategy);
        Executor executorUp = new Executor(uppercaseStrategy);
        Executor executorRan = new Executor(randomCaseStrategy);
        executorRan.printString(input);
        executorLow.printString(input);
        executorUp.printString(input);

    }
}
