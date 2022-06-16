package com.rds.app.rds.v1.repository;

import com.rds.app.rds.v1.entitis.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IVenta extends JpaRepository<Venta, Integer> {
    @Query( value = "{ call SP_Venta_SEL() }",nativeQuery=  true)
    List<Venta> listaVenta();

    @Query( value = "{ call SP_Venta_DEL( :id) }",nativeQuery=  true)
    String eliminarVenta(@Param("id") Integer id);

    @Query( value = "{ call SP_Venta_INSERT( :us, :fe , :fech, :est, :tol, :dir, :nm ) }",nativeQuery=  true)
    String registrarVenta(

            @Param("us") Integer  idUsu,

            @Param("fe") String fecha,

            @Param("fech") String fechaentrega,

            @Param("est") String estatus,

            @Param("tol") Double total,

            @Param("dir") String direccionenvio,

            @Param("nm") String numerocontacto);
}
