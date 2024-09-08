package com.studies.studies.datastructures.hash.linearprobing;

import java.util.ArrayList;

public class LinearProbing {

    String[] hashTable;
    int usedCellNumber;


    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word) {
        char[] chars = word.toCharArray();
        int sum, i;
        for (sum = 0, i = 0; i < chars.length; i++) {
            sum += chars[i];
        }
        return sum % hashTable.length;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0/hashTable.length;
    }

    public void rehashKeys(String word) {
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(word);
            hashTable  = new String[hashTable.length * 2];
            for (String ss : data) {
                insertInHashTable(ss);
            }
        }
    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word);
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " successfully inserted at location " + newIndex);
                    break;
                } else {
                    System.out.println("For " + word + " " + newIndex + " is already occupied. Trying next empty cell.");
                }
            }
        }
        usedCellNumber++;
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("No hash table");
        } else {
            System.out.println("\n-------Hash table--------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key " + hashTable[i]);
            }
        }
    }
}
