package com.jalasoft.project;

import com.jalasoft.project.polymorphism.Bicycle;
import com.jalasoft.project.polymorphism.Car;
import com.jalasoft.project.polymorphism.Land;
import com.jalasoft.project.polymorphism.ListLandTransport;
import com.jalasoft.project.stream.Detalle;
import com.jalasoft.project.stream.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lizzy Mendivil
 * @version 1.1
 */
// @SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("***Stream Practice***");

        Detalle detalle1 = new Detalle("cod1", "cocina", 2, 1000, 10, 1990, "ped1");
        Detalle detalle2 = new Detalle("cod2", "lavadora", 1, 2500, 0, 2500, "ped1");
        Detalle detalle3 = new Detalle("cod3", "plancha", 5, 300, 50, 1450, "ped1");

        Detalle detalle4 = new Detalle("cod4", "mesa", 2, 700, 30, 1370, "ped2");
        Detalle detalle5 = new Detalle("cod5", "muebles", 1, 3500, 0, 3500, "ped2");
        Detalle detalle6 = new Detalle("cod6", "comoda", 3, 800, 100, 2300, "ped2");

        Detalle detalle7 = new Detalle("cod7", "camisa", 10, 100, 100, 900, "ped3");
        Detalle detalle8 = new Detalle("cod8", "polera", 20, 80, 0, 1600, "ped3");
        Detalle detalle9 = new Detalle("cod9", "zapatos", 8, 400, 200, 3000, "ped3");

        List<Detalle> detalleList1 = new ArrayList<>();
        detalleList1.add(detalle1);
        detalleList1.add(detalle2);
        detalleList1.add(detalle3);

        List<Detalle> detalleList2 = new ArrayList<>();
        detalleList2.add(detalle4);
        detalleList2.add(detalle5);
        detalleList2.add(detalle6);

        List<Detalle> detalleList3 = new ArrayList<>();
        detalleList3.add(detalle7);
        detalleList3.add(detalle8);
        detalleList3.add(detalle9);

        Pedido pedido1 = new Pedido("ped1", "normal", "Juan Perez","2020-05-05", detalleList1);
        Pedido pedido2 = new Pedido("ped2", "programado", "Mariana Guaman","2020-05-03", detalleList2);
        Pedido pedido3 = new Pedido("ped3", "normal", "Juan Perez","2020-05-10", detalleList3);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        // select cliente from pedido
        System.out.println("#1");
        pedidos.stream()
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println(value));

        // select cliente from pedido where tipoPedio = "normal"
        System.out.println("#2");
        pedidos.stream()
                .filter(pedido -> pedido.getTipoPedido() == "normal")
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println(value));

        // select codPedido from Pedido where fecha = "2020-05-05"
        System.out.println("#3");
        pedidos.stream()
                .filter(pedido -> pedido.getFecha() == "2020-05-05")
                .map(pedido -> pedido.getCodPedido())
                .forEach(value -> System.out.println(value));

        // select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Pedido.codPedido = "ped1"
        System.out.println("#4");
        pedidos.stream()
                .filter(ped -> ped.getCodPedido() == "ped1")
                .map(pedido -> pedido.getDetalleList())
                .flatMap(pedidosList -> pedidosList.stream())
                .map(pedido -> pedido.getProducto())
                .forEach(value -> System.out.println(value));

        /* schoolList.stream()
                .filter(school -> school.getName().equals("Avaroa"))
                .map(school -> school.getStudentList())
                .flatMap(students -> students.stream())
                .map(student -> student.getName() + " - " + student.getLastName())
                .forEach(value -> System.out.println(value)); */

        // select detalle.producto from Detalle, detalle where Pedido.codPedido = Detalle.codPedido and cantidad > 8
        System.out.println("#5");
        pedidos.stream()
                .map(pedido -> pedido.getDetalleList())
                .flatMap(pedidosList -> pedidosList.stream())
                .filter(pedFilter -> pedFilter.getCantidad() > 8)
                .map(pedido -> pedido.getProducto())
                .forEach(value -> System.out.println(value));

        /* Land land1 = new Bicycle("name1", 500, false, true);
        Land land2 = new Car("name2", 1000, true, true);

        ListLandTransport listLandTransport = new ListLandTransport();

        listLandTransport.addLand(land1);
        listLandTransport.addLand(land2);

        listLandTransport.display(); */

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
