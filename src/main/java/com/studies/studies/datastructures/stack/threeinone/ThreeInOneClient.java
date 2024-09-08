package com.studies.studies.datastructures.stack.threeinone;

public class ThreeInOneClient {

    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(3);

        threeInOne.push(0, 1);
        threeInOne.push(0, 2);
        threeInOne.push(1, 4);
        threeInOne.push(1, 5);
        threeInOne.push(2, 8);


        System.out.println(threeInOne.peek(0));
        System.out.println(threeInOne.peek(1));
        System.out.println(threeInOne.peek(2));

        System.out.println(threeInOne.pop(0));
        System.out.println(threeInOne.peek(0));
    }
}
