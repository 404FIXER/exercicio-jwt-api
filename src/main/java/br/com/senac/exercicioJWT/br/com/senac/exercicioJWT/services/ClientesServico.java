package br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.services;

import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.controllers.dtos.ClientesRequestDTO;
import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.modelos.Clientes;
import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.repositorios.ClientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServico {
    @Autowired
    private ClientesRepositorio clientesRepositorio;

    public void criar(ClientesRequestDTO cliente) {
        Clientes clientePersist = new Clientes();
        clientePersist.setNome(cliente.getNome());
        clientePersist.setSobrenome(cliente.getSobrenome());
        clientePersist.setDocumento(cliente.getDocumento());
        clientePersist.setEmail(cliente.getEmail());

        clientesRepositorio.save(clientePersist);
    }

    public List<Clientes> listarTodos() {
        return clientesRepositorio.findAll();
    }

    public Clientes listarById(Long id) {
        Optional<Clientes> clienteResult = clientesRepositorio.findById(id);
        if(clienteResult.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado!");
        }

        return clienteResult.get();
    }
}
