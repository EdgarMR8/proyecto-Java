package com.rds.app.rds.v1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VentaDto {
    private Integer Id;

   private Integer usuario;

    private String fecha;

    private String fechaentrega;

    private String estatus;

    private Double total;

    private String direccionenvio;

    private String numerocontacto;
}
