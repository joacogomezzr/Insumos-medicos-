package com.gomez.insumomedico.models;

import java.util.ArrayList;

public class Usuarios {
    public String nombre;
    public String apellidos;
    public String edad;

    private ArrayList<Usuarios> listaUsuarios;

    public Usuarios() {
        listaUsuarios = new ArrayList<>();
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public Usuarios(String nombre, String apellidos, String edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
