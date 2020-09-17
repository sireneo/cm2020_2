package com.sijc.app.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import com.sijc.app.ejb.SingletonBean;
import com.sijc.app.model.Property;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.PrimeFaces;

@Named(value = "manager")
@RequestScoped
public class PropertyManager {

    @EJB
    SingletonBean ejb;

    ArrayList cacheList = new ArrayList();
    private Property selectedProp;

    public Property getSelectedProp() {
        return selectedProp;
    }

    public void setSelectedProp(Property selectedProp) {
        this.selectedProp = selectedProp;
    }
    private String nombre;
    private String apellido;
    private String edad;

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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

     public void guardar() {
        System.out.println("Guardado!");
        ejb.put(nombre, apellido, edad);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Registrado",  "A: " + nombre) );
        PrimeFaces.current().ajax().update("form:panel");
        PrimeFaces.current().scrollTo("form:panel");

  
    }

    public void eliminar() {

        System.out.println("Eliminando " + selectedProp);
           FacesContext context1 = FacesContext.getCurrentInstance();
        context1.addMessage(null, new FacesMessage("Eliminando",  "A: " + nombre) );
        ejb.delete(selectedProp);
        
     
    }

    public List getCacheList() {
        return ejb.getCache();
    }

}
