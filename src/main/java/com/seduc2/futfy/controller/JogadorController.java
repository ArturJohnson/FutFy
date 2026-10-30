package com.seduc2.futfy.controller;

import com.seduc2.futfy.entity.Jogador;
import com.seduc2.futfy.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
@CrossOrigin(origins = "*")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public List<Jogador> listarTodos() {
        return jogadorService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Jogador> cadastrar(@RequestBody Jogador jogador) {
        Jogador novoJogador = jogadorService.salvar(jogador);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoJogador);
    }
}