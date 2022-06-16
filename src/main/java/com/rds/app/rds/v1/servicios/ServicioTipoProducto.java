package com.rds.app.rds.v1.servicios;

import com.rds.app.rds.v1.dto.TipoProDto;
import com.rds.app.rds.v1.entitis.TipoProducto;
import com.rds.app.rds.v1.repository.ITipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioTipoProducto {
    @Autowired
    private ITipoProducto db;
    public List<TipoProducto> selectAll() { return db.listaTipoProdducto(); }

    public String registrarTipoPrdc(TipoProDto tp) {
        return this.db.registrarTipoPrdc(tp.getNombre()) ;
    }

    public String eliminarTipoPro (Integer id){
        return this.db.eliminarTipoPro(id);
}
}
