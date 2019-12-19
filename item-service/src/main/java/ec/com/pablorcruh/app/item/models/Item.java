package ec.com.pablorcruh.app.item.models;

import lombok.Data;

@Data

public class Item {

    public Item(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    private Producto producto;

    private Integer cantidad;

    public Item(){}

    public Double getTotal(){
        return producto.getPrecio() * cantidad.doubleValue();
    }

}
