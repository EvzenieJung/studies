package com.studies.studies.designPatterns.creational.factorymethod;

public class ShapeFactory {

    public Shape getFood(String type) {
        if (type == null) {
            return null;
        }
        return switch (type.toLowerCase()) {
            case "oval" -> new Cake();
            case "square" -> new Pie();
            case "round" -> new Pizza();
            default -> throw new IllegalArgumentException("Invalid food type");
        };
    }
}
