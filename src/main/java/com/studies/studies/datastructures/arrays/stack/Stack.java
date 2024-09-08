package com.studies.studies.datastructures.arrays.stack;

public class Stack {
    int arr[];
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack  == arr.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value is inserted!");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[topOfStack];
    }

    public void delete() {
        arr = null;
        System.out.println("Stack is deleted!");
    }
}
