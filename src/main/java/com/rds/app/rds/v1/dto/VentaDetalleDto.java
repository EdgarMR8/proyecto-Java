package com.rds.app.rds.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaDetalleDto {
    private Integer Id;
    private Integer venta;
    private Integer prod;
    private String cantidad;
    private String subtotal;
    private String descripcion;
}
