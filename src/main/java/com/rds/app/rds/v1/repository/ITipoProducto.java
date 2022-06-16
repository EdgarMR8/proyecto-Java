package com.rds.app.rds.v1.repository;



import com.rds.app.rds.v1.entitis.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITipoProducto extends JpaRepository<TipoProducto, Integer> {
    @Query( value = "{ call SP_TipoProducto_SEL() }",nativeQuery=  true)
    List<TipoProducto> listaTipoProdducto();

    @Query( value = "{ call SP_TipoProducto_DEL( :id ) }",nativeQuery=  true)
    String eliminarTipoPro (@Param("id") Integer id);

    @Query( value = "{ call SP_TipoProducto_INSERT(:nom) }",nativeQuery=  true)
    String registrarTipoPrdc(
            @Param("nom") String nombre);
}
