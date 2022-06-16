package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "PrecioProducto")

public class PrecioProducto {

    @javax.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;
    @Column(name = "Precio")
    private Double precio;
    @Column(name = "Activo")
    private Byte activo;


}
