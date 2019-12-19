package ec.com.pablorcruh.app.productos.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "productos")
@Data
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    public Producto(){}
}
