package com.studies.studies.designPatterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    ShapeFactory testShapeFactory = new ShapeFactory();
    Shape ovalFood = testShapeFactory.getFood("Oval");
    Shape squareFood = testShapeFactory.getFood("Square");
    Shape roundFood = testShapeFactory.getFood("Round");

    @Test
    void testGetFood() {
        assertEquals("Round", roundFood.getShapeType());
        assertEquals("Square", squareFood.getShapeType());
        assertEquals("Oval", ovalFood.getShapeType());
    }

}