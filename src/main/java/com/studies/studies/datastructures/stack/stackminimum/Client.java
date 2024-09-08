package com.studies.studies.datastructures.stack.stackminimum;

public class Client {

    public static void main(String[] args) {
        StackMinimum stackMinimum = new StackMinimum();

        stackMinimum.push(3);
        stackMinimum.push(2);
        stackMinimum.push(1);

        stackMinimum.pop();
        System.out.println("Minimum: " + stackMinimum.min());
    }
}
