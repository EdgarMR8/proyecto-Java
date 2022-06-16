package com.rds.app.rds.v1.repository;

import com.rds.app.rds.v1.entitis.PrecioProducto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPrecioProducto extends JpaRepository<PrecioProducto, Integer>{

    @Query( value = "{ call SP_PrecioProducto_SEL() }",nativeQuery=  true)
    List<PrecioProducto> listaPrecioProductos();

    @Query( value = "{ call SP_PrecioProducto_DEL( :id ) }",nativeQuery=  true)
    String eliminarPrecioProducto(@Param("id") Integer id);

    @Query( value = "{ call SP_PrecioProducto_INSERT( :pro, :pre, :act ) }",nativeQuery=  true)
    String registrarPrecioProducto(
            @Param("pro") Integer idPro,
            @Param("pre") Double precio,
            @Param("act")   Byte activo);
}
