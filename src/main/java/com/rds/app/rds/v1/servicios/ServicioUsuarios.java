package com.rds.app.rds.v1.servicios;

import com.rds.app.rds.v1.dto.UserDto;
import com.rds.app.rds.v1.entitis.User;
import com.rds.app.rds.v1.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class ServicioUsuarios {
    @Autowired
    private IUser db;

    public List<User> selectAll() {
        return db.listaUsuarios();
    }

    public String registrarUsuario(UserDto user){
       return this.db.registrarUsuario(
                user.getIdRoll(),
                user.getNombre(),
                user.getApellidos(),
                user.getEmail(),
                user.getPassword());
    }
    public void eliminarUsuario( Integer id ){
        this.db.deleteById( id );
    }

    public User findByEmailAndPassword(String email, String password){
        Optional<User> usuario = this.db.findByEmailAndPassword(email, password);
        if (usuario.isPresent()) {
            return usuario.orElseThrow();
        }
        return null;
    }
}
