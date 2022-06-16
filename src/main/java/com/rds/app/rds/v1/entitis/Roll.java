package com.rds.app.rds.v1.entitis;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table( name = "Roll")
public class Roll {
    @javax.persistence.Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer Id;
    @Column(name = "Nombre")
    private String nombre;
}
