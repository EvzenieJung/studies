package com.studies.studies.datastructures.queue;

import com.studies.studies.datastructures.linkedList.LinkedList;

public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("Queue LinkedList created.");
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void enqueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if  (list.head == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int result = list.head.value;
        list.deleteNode(0);
        return result;
    }

    public int peek() {
        if (list.head == null) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return list.head.value;
    }

    public void delete() {
        list.deleteEntirySinglyLinkedList();
        System.out.println("Queue LinkedList deleted.");
    }
}
