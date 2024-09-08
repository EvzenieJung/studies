package com.studies.studies.datastructures.linkedList;

public class LinkedListCoding {

    public static LinkedList sumLists(LinkedList list1, LinkedList list2) {
        Node node1 = list1.head;
        Node node2 = list2.head;
        int carry = 0;
        LinkedList resultList = new LinkedList();
        while (node1 != null || node2 != null) {
            int result = carry;
            if (node1 != null) {
                result += node1.value;
                node1 = node1.next;
            }
            if (node2 != null) {
                result += node2.value;
                node2 = node2.next;
            }
            resultList.insertNextNode(result%10);
            carry = result/10;
        }
        return resultList;
    }

    public static Node getKthNode(Node head, int k) {
        Node current = head;

        while (k > 0 && current != null) {
             current = current.next;
             k--;
        }
        return current;
    }

    public static Node findIntersection(LinkedList list1, LinkedList list2) {
        if (list2 == null || list2 == null) return null;
        if (list1.tail != list2.tail) return null;

        Node longer;
        Node shorter;

        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size - list2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return  longer;
    }

    public static void addSameNode(LinkedList list1, LinkedList list2, int value) {
        Node newNode = new Node();
        newNode.value = value;
        list1.tail.next = newNode;
        list1.tail = newNode;
        list2.tail.next = newNode;
        list2.tail = newNode;
    }
}
