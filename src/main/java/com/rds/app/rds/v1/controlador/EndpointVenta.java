package com.rds.app.rds.v1.controlador;

import com.rds.app.rds.v1.dto.VentaDto;
import com.rds.app.rds.v1.entitis.Venta;
import com.rds.app.rds.v1.servicios.ServicioVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Venta")
@CrossOrigin(origins = "*")
public class EndpointVenta {
    @Autowired
    private ServicioVenta servicio;
    @GetMapping
    public List<Venta> selectAll() {return servicio.selectAll();}

    @PostMapping
    public String registrarVenta(@RequestBody VentaDto vn){
        return this.servicio.registrarVenta(vn);
    }
    @DeleteMapping("/delete/{id}")
    public String eliminar(@PathVariable Integer id){
        System.out.println("registro eliminado");
        return this.servicio.eliminarVenta(id);

    }
}
