package com.rds.app.rds.v1.repository;

import com.rds.app.rds.v1.entitis.Roll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRoll extends JpaRepository<Roll, Integer> {
    @Query( value = "{ call SP_Roll_SEL() }",nativeQuery=  true)
    List<Roll> listaRoll();

    @Query( value = "{ call SP_Roll_DEL( :id) }",nativeQuery=  true)
    List<Roll> eliminarRoll(@Param("id") Integer id);

    @Query( value = "{ call SP_Roll_INSERT( :nom) }",nativeQuery=  true)
    String registrarRoll(
         @Param("nom") String nombre);
}
