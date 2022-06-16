package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "Producto")

public class Producto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "Id_tipoProducto", referencedColumnName = "Id")
    private TipoProducto tipoProducto;

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Imagen")
    private String imagen;
    @Column(name = "Activo")
    private Byte     activo;
}
