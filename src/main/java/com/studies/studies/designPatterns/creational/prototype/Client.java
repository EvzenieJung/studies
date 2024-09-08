package com.studies.studies.designPatterns.creational.prototype;

public class Client {

    public static void main(String[] args) {
        Vehicle carPrototype = new Car(4, 100000, "Red");
        Vehicle carCopy = carPrototype.clone();
        carCopy.price = 120000;
        carCopy.isClone(carPrototype);
        carPrototype.isClone(carCopy);

        Vehicle bicyclePrototype = new Bicycle(2, 5000, true);
        Vehicle bicycleCopy = bicyclePrototype.clone();
        bicycleCopy.price = 6000;
        bicycleCopy.isClone(bicyclePrototype);
        bicyclePrototype.isClone(bicycleCopy);
    }
}
