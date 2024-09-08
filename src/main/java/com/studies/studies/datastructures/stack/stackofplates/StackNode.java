package com.studies.studies.datastructures.stack.stackofplates;

public class StackNode {
    public StackNode above;
    public StackNode below;
    public int value;

    public StackNode(int value) {
        this.value = value;
    }
}
