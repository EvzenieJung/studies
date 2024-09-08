package com.studies.studies.designPatterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();

        processor.addCommand(new OrderAddCommand(1, 500.99))
                .addCommand(new OrderAddCommand(2, 1400.89))
                .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(1));

        processor.executeCommands();
    }
}
