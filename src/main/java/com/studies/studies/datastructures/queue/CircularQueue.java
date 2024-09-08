package com.studies.studies.datastructures.queue;

public class CircularQueue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue)  {
            return true;
        } else return beginningOfQueue == 0 && topOfQueue + 1 == size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Enqueued: " + value);
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                System.out.println(" Current top of queue: " + topOfQueue);
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println(" Enqueued: " + value);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            var result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            System.out.println("Dequeued: " + result);
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return arr[beginningOfQueue];
    }
}
