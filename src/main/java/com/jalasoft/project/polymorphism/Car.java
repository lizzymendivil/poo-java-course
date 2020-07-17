package com.jalasoft.project.polymorphism;

public class Car extends Land {
    private boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    @Override
    public String displayData() {
        return super.displayData();
    }
}
