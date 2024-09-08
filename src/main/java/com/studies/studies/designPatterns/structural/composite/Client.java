package com.studies.studies.designPatterns.structural.composite;

public class Client {

    public static void main(String[] args) {
        Composite computer = new Composite("Computer");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment hdd = new Equipment("HDD", 100);

        Composite memory = new Composite("Memory");
        Equipment ram = new Equipment("RAM", 200);
        Equipment rom = new Equipment("ROM", 100);

        Composite printer = new Composite("Printer");
        printer.add(new Equipment("Monitor", 200))
                .add(new Equipment("Printer", 500));

        memory.add(ram).add(rom);
        computer.add(processor).add(memory).add(printer);

        System.out.println("Total price: " + computer.getPrice());
    }
}
