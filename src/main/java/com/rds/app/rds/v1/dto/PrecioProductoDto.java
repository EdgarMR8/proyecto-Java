package com.rds.app.rds.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class PrecioProductoDto {

    private Integer Id;
    private Integer pro;
    private Double precio;
    private Byte activo;
}
