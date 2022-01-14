package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Stateless;
import org.magadiflo.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class ServiceEJB implements ServiceEJBRemote {

    private int contador;

    @Override
    public String saludar(String nombre) {
        System.out.println("Imprimiendo dentro del ejb con instancia: " + this);
        this.contador++;
        System.out.println("Valor del contador en el metodo saludar: " + contador);
        return "Hola que tal " + nombre;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("peras"));
        productos.add(new Producto("manzanas"));
        productos.add(new Producto("naranjas"));
        productos.add(new Producto("plátanos"));
        return productos;
    }

    @Override
    public Producto crear(Producto producto) {
        System.out.println("Guardando producto...");
        Producto p = new Producto();
        p.setNombre(producto.getNombre());
        return p;
    }

}
