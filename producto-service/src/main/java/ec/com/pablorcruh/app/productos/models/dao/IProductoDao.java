package ec.com.pablorcruh.app.productos.models.dao;

import ec.com.pablorcruh.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto, Long> {


}
