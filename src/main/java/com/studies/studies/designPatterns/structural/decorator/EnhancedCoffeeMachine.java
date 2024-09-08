package com.studies.studies.designPatterns.structural.decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine {

    private final NormalCoffeeMachine normalCoffeeMachine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine: adding sugar and milk");
    }

    @Override
    public void makeLargeCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: adding sugar, milk, and chocolate syrup");
    }

    public void makeSpecialCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: adding sugar, milk, chocolate syrup, and vanilla ice cream");
    }
}
