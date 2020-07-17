package com.jalasoft.project.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {
    List<Land> list = new ArrayList<>();

    public void addLand(Land land) {
        System.out.println("addLand" + land);
        this.list.add(land);
    }

    public void display() {
        this.list.stream().forEach(item -> {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("*************************");
        });
    }
}
