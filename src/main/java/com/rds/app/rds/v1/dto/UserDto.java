package com.rds.app.rds.v1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer Id ;
    private Integer idRoll;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;


}
