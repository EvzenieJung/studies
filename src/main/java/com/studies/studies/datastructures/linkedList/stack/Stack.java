package com.studies.studies.datastructures.linkedList.stack;

import com.studies.studies.datastructures.linkedList.LinkedList;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    public int peek() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            result = linkedList.head.value;
        }
        return result;
    }

    public void delete() {
        linkedList.head = null;
        System.out.println("The stack is deleted!");
    }
}
