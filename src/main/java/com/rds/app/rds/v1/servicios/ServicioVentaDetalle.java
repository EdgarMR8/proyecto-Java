package com.rds.app.rds.v1.servicios;

import com.rds.app.rds.v1.dto.VentaDetalleDto;
import com.rds.app.rds.v1.entitis.VentaDetalle;
import com.rds.app.rds.v1.repository.IVentaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ServicioVentaDetalle {
    @Autowired
    private IVentaDetalle db;
    public List<VentaDetalle> selectAll() { return db.listaVenta(); }

    public String registrarVenDetalle (VentaDetalleDto vnd){
        return this.db.registrarVenDetalle(
                vnd.getVenta(),
                vnd.getProd(),
                vnd.getCantidad(),
                vnd.getSubtotal(),
                vnd.getDescripcion()
        );
    }
    public String eliminarVenDetalle( Integer id ){
        return this.db.eliminarVenDetalle(id);
    }
}
