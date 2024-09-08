package com.studies.studies.datastructures.hash.linearprobing;

public class Client {

    public static void main(String[] args) {
        LinearProbing hashTable = new LinearProbing(13);

        hashTable.insertInHashTable("The");
        hashTable.insertInHashTable("quick");
        hashTable.insertInHashTable("brown");
        hashTable.insertInHashTable("fox");
        hashTable.insertInHashTable("over");
        hashTable.displayHashTable();
    }
}
