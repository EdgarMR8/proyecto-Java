package com.rds.app.rds.v1.repository;



import com.rds.app.rds.v1.entitis.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProducto extends JpaRepository<Producto, Integer> {
    @Query( value = "{ call SP_Producto_SEL(:tipo) }",nativeQuery=  true)
    List<Producto>listaProducto(@Param("tipo") Integer tipo);

    @Query( value = "{ call SP_Producto_DEL( :id ) }",nativeQuery=  true)
    List<Producto> eliminarProducto(@Param("id") Integer id);

    @Query( value = "{ call SP_Producto_INSERT( :id, :nom, :des, :img, :act ) }",nativeQuery=  true)
    String registrarProducto(

            @Param("id") Integer idTipo,

            @Param("nom") String nombre,

            @Param("des") String descripcion,

            @Param("img") String imagen,

            @Param("act") Byte activo);
}
