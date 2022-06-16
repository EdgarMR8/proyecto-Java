package com.rds.app.rds.v1.controlador;

import com.rds.app.rds.v1.dto.RollDto;
import com.rds.app.rds.v1.entitis.Roll;
import com.rds.app.rds.v1.servicios.ServicioRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roll")
@CrossOrigin(origins = "*")
public class EndpointRoll {

    @Autowired
    private ServicioRoll servicio;
    @GetMapping
    public List<Roll> selectAll() {return servicio.selectAll();}

    @PostMapping
    public String registrarRoll(@RequestBody RollDto rdt) {
    return this.servicio.registrarRoll(rdt);
    }
    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        System.out.println(id);
        this.servicio.eliminarRoll(id);
        System.out.println("registro eliminado");
    }
}
