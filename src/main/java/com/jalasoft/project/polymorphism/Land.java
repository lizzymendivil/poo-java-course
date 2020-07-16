package com.jalasoft.project.polymorphism;

public class Land extends Transport {

    private boolean hasMotor;

    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public String displayData() {
        return "Displaying data...";
    }
}
