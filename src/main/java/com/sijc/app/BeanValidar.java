/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sijc.app;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author SantOS
 */
@Named(value = "beanValidar")
@RequestScoped
public class BeanValidar {
    @Size(min=2,max=10)
    private String nombre;

    @Size(min=2,max=10)
    private String apellido;
    
    @Min(18) @Max(40) 
   private Integer edad;

    /**
     * Creates a new instance of BeanValidar
     */
    
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void guardar(){
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Bienvenido " + nombre + " " + apellido));

    }
}
