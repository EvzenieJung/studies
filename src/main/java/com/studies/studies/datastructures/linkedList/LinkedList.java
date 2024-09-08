package com.studies.studies.datastructures.linkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedList {

    static Logger log = LoggerFactory.getLogger(LinkedList.class.getName());
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node currentNode = new Node();
        currentNode.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) { // beginning
            currentNode.next = head;
            head = currentNode;
        } else if(location >= size) { // ending
            currentNode.next = null;
            tail.next = currentNode;
            tail = currentNode;
        } else { // in the middle
            Node previousNode = head;
            int index = 0;
            while (index < location - 1) {
                previousNode = previousNode.next;
                index++;
            }
            Node nextAfterPreviousNode = previousNode.next;
            previousNode.next = currentNode;
            currentNode.next = nextAfterPreviousNode;
        }
        size++;
    }

    public void insertNextNode(int nodeValue) {
        Node currentNode = new Node();
        currentNode.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }
        Node previousNode = head;
        while (previousNode.next != null) {
            previousNode = previousNode.next;
        }
        previousNode.next = currentNode;
        tail = currentNode;
        size++;
    }


    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node tempNode = head;
            for(int i=0; i<size;i++) {
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public void traverse(LinkedList ll) {
        if (ll.head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node tempNode = ll.head;
            for(int i=0; i<size;i++) {
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public void traverseByHead(Node head) {
        if (head == null) {
            log.info("Linked list is empty");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                log.info(String.valueOf(tempNode.value));
                if (tempNode.next != null) {
                    log.info(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        log.info("\n");
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found a node at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >=size) {
            Node tempNode = head;
            for(int i=0;i < size -1; i++) {
                tempNode =  tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i=0;i<location-1;i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteEntirySinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Singly linked list deleted");
    }
}
