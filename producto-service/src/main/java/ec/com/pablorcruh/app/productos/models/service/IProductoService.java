package ec.com.pablorcruh.app.productos.models.service;

import ec.com.pablorcruh.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService{

    List<Producto> findAll();

    Producto findById(Long id);
}
