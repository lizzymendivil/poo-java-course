package com.jalasoft.project;

import com.jalasoft.project.polymorphism.Bicycle;
import com.jalasoft.project.polymorphism.Car;
import com.jalasoft.project.polymorphism.Land;
import com.jalasoft.project.polymorphism.ListLandTransport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lizzy Mendivil
 * @version 1.1
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Land land1 = new Bicycle("name1", 500, false, true);
        Land land2 = new Car("name2", 1000, true, true);

        ListLandTransport listLandTransport = new ListLandTransport();

        listLandTransport.addLand(land1);
        listLandTransport.addLand(land2);

        listLandTransport.display();

        /* // SpringApplication.run(Main.class, args);
        List<String> countries = new ArrayList<>();
        countries.add("Bolivia");
        countries.add("Argentina");
        countries.add("Argelia");
        countries.add("Portugal");
        countries.add("Italia");
        countries.add("Australia");

        // 1. Filtrar solo los que empiecen con la letra A
        countries.stream()
                .filter(country -> country.startsWith("A"))
                .forEach(country -> System.out.println(country));

        // 2. Filtrar solo los que tengan mayor a 5 caracteres
        countries.stream()
                .filter(country -> country.length() > 5)
                .forEach(country -> System.out.println(country));

        // 3. Filtrar solo los que la suma de sus caracteres sea par
        countries.stream()
                .filter(country -> country.length() % 2 == 0)
                .forEach(country -> System.out.println(country)); */

    }
}
