package com.rds.app.rds.v1.controlador;

import com.rds.app.rds.v1.dto.VentaDetalleDto;
import com.rds.app.rds.v1.entitis.VentaDetalle;
import com.rds.app.rds.v1.servicios.ServicioVentaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VentaDetalle")
@CrossOrigin(origins = "*")
public class EndpointVentaDetalle {
    @Autowired
    private ServicioVentaDetalle servicio;
    @GetMapping
    public List<VentaDetalle> selectAll() {return servicio.selectAll();}

    @PostMapping
    public String registrarVenDetalle(@RequestBody VentaDetalleDto vnd){
        return this.servicio.registrarVenDetalle(vnd);
    }
    @DeleteMapping("/delete/{id}")
    public String eliminar(@PathVariable Integer id){
        System.out.println("registro eliminado");
       return this.servicio.eliminarVenDetalle(id);

    }
}
