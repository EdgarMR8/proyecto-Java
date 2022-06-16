package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "VentaDetalle")

public class VentaDetalle {
    @javax.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;
    @Column(name = "Cantidad")
    private String cantidad;
    @Column(name = "SubTotal")
    private String subtotal;
    @Column(name = "Descripcion")
    private String descripcion;

}
