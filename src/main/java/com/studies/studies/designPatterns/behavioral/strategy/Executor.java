package com.studies.studies.designPatterns.behavioral.strategy;

public class Executor {
    public PrintStrategy printStrategy;

    public Executor(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public void printString(String input) {
        String formattedString = printStrategy.formatString(input);
        System.out.println(formattedString);
    }
}
