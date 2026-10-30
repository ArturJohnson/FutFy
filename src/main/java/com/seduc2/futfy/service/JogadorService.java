package com.seduc2.futfy.service;

import com.seduc2.futfy.entity.Jogador;
import com.seduc2.futfy.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    public Jogador salvar(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
}