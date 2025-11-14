package br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepositorio extends JpaRepository<br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.modelos.Usuarios, Long> {
    Optional<br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.modelos.Usuarios> findByEmail(String email);
}
