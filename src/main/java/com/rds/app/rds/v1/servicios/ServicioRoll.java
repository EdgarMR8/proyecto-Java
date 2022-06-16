package com.rds.app.rds.v1.servicios;


import com.rds.app.rds.v1.dto.RollDto;
import com.rds.app.rds.v1.dto.UserDto;
import com.rds.app.rds.v1.entitis.Roll;
import com.rds.app.rds.v1.repository.IRoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ServicioRoll {
    @Autowired
    private IRoll db;
    public List<Roll> selectAll() { return db.listaRoll(); }

    public String registrarRoll(RollDto rdt) {
    return  this.db.registrarRoll(
       rdt.getNombre());
    }

    public void eliminarRoll( Integer id ){
        this.db.deleteById( id );
    }

}
