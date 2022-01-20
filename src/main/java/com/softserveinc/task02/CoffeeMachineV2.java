package com.softserveinc.task02;

import com.softserveinc.task01.CoffeeMachineV1;

public class CoffeeMachineV2 extends CoffeeMachineV1 {
    public CoffeeMachineV2(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity, int milkReservoirCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
        this.milkReservoirCapacity = milkReservoirCapacity;
    }

    private int milk;
    protected final int milkReservoirCapacity;

    public void addMilk(int milk) {
        this.milk = Math.min(milk + this.milk, milkReservoirCapacity);
    }

    public int getMilk() {
        return milk;
    }

    public boolean makeCappuccino() {
        if (makeEspresso()) {
            if (85 > this.milk) {
                System.err.println("Not enough milk");
                return false;
            }
            milk -= 85;
            return true;
        }
        return false;
    }

    public boolean makeLatte() {
        if (makeEspresso()) {
            if (150 > this.milk) {
                System.err.println("Not enough milk");
                return false;
            }
            milk -= 150;
            return true;
        }
        return false;
    }
}
