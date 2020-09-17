package com.sijc.app.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import com.sijc.app.model.Property;

@Singleton
public class SingletonBean {

    private List<Property> cache;

    @PostConstruct
    public void initCache() {
        cache = new ArrayList<Property>();
    }

    public void delete(Property prop) {

        this.cache.remove(prop);
    }

    public void put(String nombre, String apellido, String edad) {
        Property p = new Property();
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setEdad(edad);

        this.cache.add(p);
    }

    public List<Property> getCache() {
        return cache;
    }

}
