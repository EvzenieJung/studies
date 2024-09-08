package com.studies.studies.datastructures.queue;

public class Queue {
    int[] arr;
    int lastInQueue;
    int firstInQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.lastInQueue = -1;
        this.firstInQueue = -1;
    }

    public boolean isFull() {
        return lastInQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return firstInQueue == -1 || firstInQueue == arr.length;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else if (isEmpty()) {
            firstInQueue = 0;
            lastInQueue++;
            arr[lastInQueue] = value;
            System.out.println(String.format("Successfully inserted %s in the queue!", value));
        } else {
            lastInQueue++;
            arr[lastInQueue] = value;
            System.out.println(String.format("Successfully inserted %s in the queue!", value));
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int result = arr[firstInQueue];
        firstInQueue++;
        if (firstInQueue > lastInQueue) {
            firstInQueue = -1;
            lastInQueue = -1;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[firstInQueue];
    }

    public void delete() {
        arr = null;
        System.out.println("Queue is deleted");
    }
}
