package com.studies.studies.designPatterns.structural.adapter;

public class DisplayDataThirdParty {

    public float index;
    public String data;

    public DisplayDataThirdParty(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public void display() {
        System.out.println("Index: " + index + ", Data: " + data);
    }
}
