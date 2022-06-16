package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "Venta")

public class Venta {
    @javax.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;

    @Column(name = "Fecha")
    private String fecha;

    @Column(name = "FechaEntrega")
    private String FechaEntrega;

    @Column(name = "Estatus")
    private String estatus;
    @Column(name = "Total")
    private Double total;
    @Column(name = "Direccionenvio")
    private String direccionenvio;
    @Column(name = "NumeroContacto")
    private String numerocontacto;

}
