package com.rds.app.rds.v1.servicios;

import com.rds.app.rds.v1.dto.PrecioProductoDto;
import com.rds.app.rds.v1.entitis.PrecioProducto;
import com.rds.app.rds.v1.repository.IPrecioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ServicioPrecioProductos {
    @Autowired
    private IPrecioProducto db;
    public List<PrecioProducto> selectAll() { return db.listaPrecioProductos(); }

    public String registrarPrecioProducto(PrecioProductoDto prpr){
        return this.db.registrarPrecioProducto(
                prpr.getPro(),
                prpr.getPrecio(),
                prpr.getActivo());
    }
    public String eliminarPrecioProducto( Integer id ){
        return this.db.eliminarPrecioProducto(id);
    }
}
