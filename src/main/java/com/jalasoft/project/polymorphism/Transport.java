package com.jalasoft.project.polymorphism;

public class Transport {
    private String name;
    private int price;

    public Transport(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
