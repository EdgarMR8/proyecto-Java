package com.rds.app.rds.v1.controlador;


import com.rds.app.rds.v1.dto.UserDto;
import com.rds.app.rds.v1.entitis.User;
import com.rds.app.rds.v1.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class EndpointUsuario {

    @Autowired
    private ServicioUsuarios servicio;

    @GetMapping
    public List<User> selectAll(){
        return servicio.selectAll();
    }

    @PostMapping
    public String registrarUsuario(@RequestBody UserDto user){
        user.setIdRoll(2);
        return this.servicio.registrarUsuario(user);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        System.out.println(id);
        this.servicio.eliminarUsuario(id);
        System.out.println("registro eliminado");
    }


    @PostMapping("/login")
    public User findByEmailAndPassword(@RequestBody UserDto userDto){
        return this.servicio.findByEmailAndPassword( userDto.getEmail(), userDto.getPassword() );
    }
}
