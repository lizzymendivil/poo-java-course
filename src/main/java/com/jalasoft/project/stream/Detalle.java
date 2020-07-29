package com.jalasoft.project.stream;

import java.util.List;

public class Detalle {
    private String codDetalle;
    private String producto;
    private int cantidad;
    private double precio;
    private double descuento;
    private double total;
    private String codPedido;

    public Detalle(String codDetalle, String producto, int cantidad, double precio, double descuento, double total, String codPedido) {
        this.codDetalle = codDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
        this.codPedido = codPedido;
    }

    public String getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(String codDetalle) {
        this.codDetalle = codDetalle;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "codDetalle='" + codDetalle + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", total=" + total +
                ", codPedido=" + codPedido +
                '}';
    }
}
