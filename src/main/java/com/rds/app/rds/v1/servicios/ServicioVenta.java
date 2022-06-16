package com.rds.app.rds.v1.servicios;


import com.rds.app.rds.v1.dto.VentaDto;
import com.rds.app.rds.v1.entitis.Venta;
import com.rds.app.rds.v1.repository.IVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ServicioVenta {
    @Autowired
    private IVenta db;
    public List<Venta> selectAll() { return db.listaVenta(); }

    public String registrarVenta(VentaDto vn){
        return this.db.registrarVenta(
            vn.getUsuario(),
            vn.getFecha(),
            vn.getFechaentrega(),
            vn.getEstatus(),
            vn.getTotal(),
            vn.getDireccionenvio(),
            vn.getNumerocontacto());
        }
    public String eliminarVenta( Integer id ){
        return this.db.eliminarVenta( id );
    }
    }

