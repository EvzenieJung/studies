package com.studies.studies.datastructures.stack.threeinone;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;

    private int[] sizes;

    public ThreeInOne(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.values = new int[stackCapacity * numberOfStacks];
        this.sizes = new int[numberOfStacks];
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    public int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            throw new IllegalStateException("Stack " + stackNum + " is full");
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new IllegalStateException("Stack " + stackNum + " is empty");
        }
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new IllegalStateException("Stack " + stackNum + " is empty");
        }
        return values[indexOfTop(stackNum)];
    }
}
