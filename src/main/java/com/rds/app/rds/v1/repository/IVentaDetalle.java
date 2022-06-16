package com.rds.app.rds.v1.repository;

import com.rds.app.rds.v1.entitis.Venta;
import com.rds.app.rds.v1.entitis.VentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IVentaDetalle extends JpaRepository<VentaDetalle, Integer> {
    @Query( value = "{ call SP_VentaDetalle_SEL() }",nativeQuery=  true)
    List<VentaDetalle> listaVenta();

    @Query( value = "{ call SP_VentaDetalle_DEL( :id ) }",nativeQuery=  true)
    String eliminarVenDetalle(@Param("id") Integer id);

    @Query( value = "{ call SP_VentaDetalle_INSERT( :idv, :idp,:can, :sub, :des ) }",nativeQuery=  true)
    String registrarVenDetalle(
            @Param("idv") Integer idVenta,
            @Param("idp") Integer idProd,
            @Param("can") String cantidad,
            @Param("sub") String subtotal,
            @Param("des") String descripcion);
}
