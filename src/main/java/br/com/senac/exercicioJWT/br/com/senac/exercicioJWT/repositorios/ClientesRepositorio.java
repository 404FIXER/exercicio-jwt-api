package br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.repositorios;

import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.modelos.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepositorio extends JpaRepository <Clientes, Long> {
}
