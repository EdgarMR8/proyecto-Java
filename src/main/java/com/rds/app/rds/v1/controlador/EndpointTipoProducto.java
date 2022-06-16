package com.rds.app.rds.v1.controlador;

import com.rds.app.rds.v1.dto.TipoProDto;
import com.rds.app.rds.v1.entitis.TipoProducto;
import com.rds.app.rds.v1.servicios.ServicioTipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TipoProducto")
@CrossOrigin(origins = "*")
public class EndpointTipoProducto {
    @Autowired
    private ServicioTipoProducto servicio;
    @GetMapping
    public List<TipoProducto> selectAll() {return servicio.selectAll();}

    @PostMapping
    public String registrarTipoPrcd(@RequestBody TipoProDto tp){
        return this.servicio.registrarTipoPrdc(tp);
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar(@PathVariable Integer id){
        System.out.println("registro eliminado");
        return this.servicio.eliminarTipoPro(id);

    }
}
