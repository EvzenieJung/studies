package com.studies.studies.datastructures.stack.stackminimum;

public class StackMinimum {
    Node top;
    Node min;

    public StackMinimum() {
        this.top = null;
        this.min = null;
    }

    public int min() {
        return this.min.value;
    }

    public void push(int value) {
        if (this.min == null) {
            this.min = new Node(value, null);
        } else if (min.value < value) {
            this.min = new Node(min.value, min);
        } else {
            this.min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }

}
