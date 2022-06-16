package com.rds.app.rds.v1.controlador;


import com.rds.app.rds.v1.dto.PrecioProductoDto;
import com.rds.app.rds.v1.dto.ProductoDto;
import com.rds.app.rds.v1.entitis.Producto;
import com.rds.app.rds.v1.servicios.ServicioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
@CrossOrigin(origins = "*")
public class EndpointProducto {
    @Autowired
    private ServicioProductos servicio;
    @GetMapping("/tipo/{tipo}")
    public List<Producto> selectAll(@PathVariable Integer tipo) {return servicio.selectAll(tipo);}

    @PostMapping
    public String registrarProducto (@RequestBody ProductoDto pr) {
        return this.servicio.registrarProducto(pr);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        this.servicio.eliminarProducto(id);
        System.out.println("registro eliminado");
    }
}
