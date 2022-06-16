package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "Usuario")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "id_roll", referencedColumnName = "Id")
    private Roll idRoll;

    private String nombre;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "Email")
    private String email;
    private String password;
}
