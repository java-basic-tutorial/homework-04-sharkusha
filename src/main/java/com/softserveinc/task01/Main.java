package com.softserveinc.task01;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Uncomment code bellow after the class CoffeeMachineV1 have been created
        AbstractCoffeeMachine coffeeMachine = new CoffeeMachineV1(200, 5000, 400);
        System.out.println(coffeeMachine);
        coffeeMachine.on();
        System.out.println(coffeeMachine);
        coffeeMachine.addWater(1000);
        System.out.println(coffeeMachine);
        coffeeMachine.addCoffeeBeans(22);
        System.out.println(coffeeMachine);
        if (coffeeMachine.makeAmericano()) {
            System.out.println("Drink Americano");
        }
        System.out.println(coffeeMachine);
        if (coffeeMachine.makeEspresso()) {
            System.out.println("Drink Espresso");
        }
        System.out.println(coffeeMachine);
        coffeeMachine.off();
        System.out.println(coffeeMachine);
    }
}
