package com.sijc.app.model;

public class Property {

    @Override
    public String toString() {
        return "Propiedades [Nombre=" + nombre + ", Apellido=" + apellido + "]";
    }

    private String nombre;
    private String apellido;
    private String edad;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
