package br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.controllers;

import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.controllers.dtos.ClientesRequestDTO;
import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.modelos.Clientes;
import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.repositorios.ClientesRepositorio;
import br.com.senac.exercicioJWT.br.com.senac.exercicioJWT.services.ClientesServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
@CrossOrigin
public class ClientesControlador {

    @Autowired
    ClientesServico clientesServico;

    @PostMapping("/criar")
    public ResponseEntity<Void> cadastrarCliente(@RequestBody ClientesRequestDTO cliente) {
        System.out.println(cliente.toString());
        clientesServico.criar(cliente);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Clientes>> listarTodos() {
        return ResponseEntity.ok(clientesServico.listarTodos());
    }
    }

