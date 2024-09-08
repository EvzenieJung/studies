package com.studies.studies.designPatterns.creational.prototype;

public class Bicycle extends Vehicle {

   private boolean cityBike;

   public Bicycle(int wheels, int price, boolean cityBike) {
       this.wheels = wheels;
       this.price = price;
       this.cityBike = cityBike;
   }

   public Bicycle(Bicycle target) {
       super(target);
       if (target != null) {
           this.cityBike = target.cityBike;
       }
   }

   public Bicycle clone() {
       return new Bicycle(this);
   }

   public boolean isClone(Vehicle target) {
       if (target instanceof Bicycle bicycle) {
           if (this.cityBike == bicycle.cityBike && this.wheels == bicycle.wheels && this.price == bicycle.price) {
               System.out.println(this + " is a clone of " + bicycle);
               return true;
           }
       }
       System.out.println(this + " is not a clone of " + target);
       return false;
   }
}
