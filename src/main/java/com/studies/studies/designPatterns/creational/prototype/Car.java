package com.studies.studies.designPatterns.creational.prototype;

public class Car extends Vehicle {
    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Car t) {
            if (color.equals(t.color) && wheels == t.wheels && price == t.price) {
                System.out.println(this + " is a clone of " + t);
            }
            return true;
        }
        System.out.println(this + " is not a clone of " + target);
        return false;
    }
}
