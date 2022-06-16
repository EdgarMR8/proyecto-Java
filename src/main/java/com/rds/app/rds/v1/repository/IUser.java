package com.rds.app.rds.v1.repository;


import com.rds.app.rds.v1.entitis.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUser extends JpaRepository<User, Integer> {
    @Query( value = "{ call SP_Usuario_SEL() }",nativeQuery=  true)
    List<User> listaUsuarios();

    @Query( value = "{ call SP_Usuario_DEL( :id) }",nativeQuery=  true)
    List<User>eliminarUsuarios(@Param("id") Integer id);
    @Query( value = "{ call SP_Usuario_INSERT(:rol, :name, :ape, :em, :pwd) }",nativeQuery=  true)
    String registrarUsuario(
            @Param("rol") Integer rol,
           @Param("name") String nombre,
            @Param("ape") String apellido,
            @Param("em") String email,
            @Param("pwd") String password);

    Optional<User> findByEmailAndPassword(String email, String password);
}
