package com.gomez.insumomedico.models;

import java.util.ArrayList;

public class Productos {
    public String  nombre;
    public String precio;
    public String marca;

    public String cantidad;

    private ArrayList<Productos> listaProductos;

    public Productos() {
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public Productos(String nombre, String precio, String marca, String cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
