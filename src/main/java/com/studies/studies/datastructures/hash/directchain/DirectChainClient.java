package com.studies.studies.datastructures.hash.directchain;

public class DirectChainClient {

    public static void main(String[] args) {
        DirectChaining hashTable = new DirectChaining(13);

        hashTable.insertHashTable("Apple");
        hashTable.insertHashTable("Banana");
        hashTable.insertHashTable("Cherry");
        hashTable.insertHashTable("Date");
        hashTable.insertHashTable("Elderberry");

        hashTable.displayHashTable();
        hashTable.searchHashTable("Banana");

        hashTable.deleteKeyHashTable("Cherry");
    }
}
