package com.studies.studies.examples;


import java.util.Comparator;
import java.util.List;

public class ConcreteClass extends AbstractClass {

    static int val = 10;
    int instanceVar;


    public static int getVal() {
        return val;
    }

    @Override
    public String getData() {
        return "ConcreteClass data";
    }

    @Override
    public void printData() {
        System.out.println("Printing...");
    }

    public int compare() {
        System.out.println("This is a custom method in ConcreteClass");

        Comparator<String> comparator = new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
              return s1.compareTo(s2);
          }
        };
        return comparator.compare("a", "b"); // This will call the custom compare method
    }

    public List<String> sortReverse(List<String> list) {
        System.out.println("This is a custom method in ConcreteClass");

        Comparator<String> comparator = new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
              return s2.compareTo(s1);
          }
        };
        list.sort(comparator);
        return list;
    }
}
