package com.rds.app.rds.v1.controlador;

import com.rds.app.rds.v1.dto.PrecioProductoDto;
import com.rds.app.rds.v1.entitis.PrecioProducto;
import com.rds.app.rds.v1.servicios.ServicioPrecioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PrecioProductos")
@CrossOrigin(origins = "*")

public class EndpointPrecioProducto {
    @Autowired
    private ServicioPrecioProductos servicio;
    @GetMapping
    public List<PrecioProducto> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public String registrarPrecioProducto(@RequestBody PrecioProductoDto prpr){
        return this.servicio.registrarPrecioProducto(prpr);
    }
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        System.out.println(id);
        this.servicio.eliminarPrecioProducto(id);
        System.out.println("registro eliminado");
    }
}
