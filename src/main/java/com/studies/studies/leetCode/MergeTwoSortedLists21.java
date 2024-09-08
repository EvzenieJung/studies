package com.studies.studies.leetCode;


import com.studies.studies.datastructures.linkedList.LinkedList;
import com.studies.studies.datastructures.linkedList.Node;

public class MergeTwoSortedLists21 {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertNextNode(1);
        list1.insertNextNode(2);
        list1.insertNextNode(4);

        LinkedList list2 = new LinkedList();
        list2.insertNextNode(1);
        list2.insertNextNode(3);
        list2.insertNextNode(4);


        Node result = mergeTwoLists(list1.head, list2.head);
        System.out.println(result.value);
    }

    public static Node mergeTwoLists(Node l1, Node l2) {
        Node prehead = new Node(-1);
        Node cur = prehead;

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
