
package com.sijc.app;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author SantOS
 */
@Named(value = "validacionBean")
@Dependent
public class ValidacionBean {
private Integer edad;
private String nombre;
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
