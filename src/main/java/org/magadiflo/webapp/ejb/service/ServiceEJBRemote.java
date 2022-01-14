package org.magadiflo.webapp.ejb.service;

import jakarta.ejb.Remote;
import org.magadiflo.webapp.ejb.models.Producto;

import java.util.List;

@Remote
public interface ServiceEJBRemote {
    String saludar(String nombre);

    List<Producto> listar();

    Producto crear(Producto producto);
}
