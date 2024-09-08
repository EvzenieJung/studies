package com.studies.studies.leetCode;

import com.studies.studies.datastructures.linkedList.LinkedList;
import com.studies.studies.datastructures.linkedList.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddTwoNumbers2 {
    static Logger log = LoggerFactory.getLogger(AddTwoNumbers2.class.getName());
    private static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertNextNode(9);
        list1.insertNextNode(9);
        list1.insertNextNode(9);
        list1.insertNextNode(9);
        list1.insertNextNode(9);
        list1.insertNextNode(9);
        list1.insertNextNode(9);

        LinkedList list2 = new LinkedList();
        list2.insertNextNode(9);
        list2.insertNextNode(9);
        list2.insertNextNode(9);
        list2.insertNextNode(9);
        addTwoNumbers(list1.head, list2.head);
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node head = new Node(0);
        Node tail = head;
        int extra = 0;

        while (l1 != null || l2 != null || extra != 0) {
            int digit1 = (l1 != null) ? l1.value : 0;
            int digit2 = (l2 != null) ? l2.value : 0;
            log.info("digit1 -> {}, digit2 -> {}", digit1, digit2);

            int sum = digit1 + digit2 + extra;
            int digit = sum % 10;
            extra = sum / 10;
            log.info("sum -> {}, digit -> {}, extra -> {}", sum, digit, extra);

            Node extraNode = new Node(digit);
            tail.next = extraNode;
            tail = tail.next;
            linkedList.traverseByHead(head.next);

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        Node result = head.next;
        log.info("head -> {}, head.next -> {}", head.value, head.next.value);
        head.next = null;
        return result;
    }
}
