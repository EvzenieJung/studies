package com.studies.studies.datastructures.queue;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CircularQueue queueArray = new CircularQueue(3);
        queueArray.enqueue(5);
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.enqueue(10);
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.enqueue(15);
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.dequeue();
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.dequeue();
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.enqueue(25);
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        System.out.println(Arrays.toString(queueArray.arr));
        queueArray.enqueue(30);
        System.out.println(Arrays.toString(queueArray.arr));
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.dequeue();
        System.out.println(Arrays.toString(queueArray.arr));
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.dequeue();
        System.out.println(Arrays.toString(queueArray.arr));
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        queueArray.dequeue();
        System.out.println(Arrays.toString(queueArray.arr));
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
    }
}
