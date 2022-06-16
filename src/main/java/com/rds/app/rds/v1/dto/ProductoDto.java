package com.rds.app.rds.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Integer Id;

    private Integer tipo;

    private String nombre;

    private String descripcion;

    private String imagen;

    private Byte activo;

}
