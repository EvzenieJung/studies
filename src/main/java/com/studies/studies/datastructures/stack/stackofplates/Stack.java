package com.studies.studies.datastructures.stack.stackofplates;

public class Stack {
    private int capacity;
    private StackNode top;
    private StackNode bottom;
    int size = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return capacity == size;
    }

    public void join(StackNode above, StackNode below) {
        if (above != null) {
            below.above = above;
        }
        if (below != null) {
            above.below = below;
        }
    }

    public boolean push(int value) {
        if (size >= capacity) return false;
        size++;
        StackNode newNode = new StackNode(value);
        if (size == 1) bottom = newNode;
        join(newNode, top);
        top = newNode;
        return true;
    }
}
