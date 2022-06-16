package com.rds.app.rds.v1.servicios;

import com.rds.app.rds.v1.dto.PrecioProductoDto;
import com.rds.app.rds.v1.dto.ProductoDto;
import com.rds.app.rds.v1.entitis.Producto;
import com.rds.app.rds.v1.repository.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ServicioProductos {
    @Autowired
    private IProducto db;
    public List<Producto> selectAll(Integer tipo) { return db.listaProducto(tipo); }

    public String registrarProducto(ProductoDto pr){
        return this.db.registrarProducto(
                pr.getTipo(),
                pr.getNombre(),
                pr.getDescripcion(),
                pr.getImagen(),
                pr.getActivo());
    }
    public void eliminarProducto( Integer id ){
        this.db.deleteById( id );
    }
}
