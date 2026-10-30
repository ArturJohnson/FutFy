package com.seduc2.futfy.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "jogadores")
public class Jogador {

    public enum Posicao {
        GOLEIRO, DEFENSOR, MEIO_CAMPO, ATACANTE
    }

    public enum PeDominante {
        CANHOTO, DIESTRO, AMBIDESTRO
    }

    public enum CondicaoFisica {
        EM_DIA, LESIONADO, REPOUSO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Posicao posicao;

    private Integer numeroCamisa;

    @Enumerated(EnumType.STRING)
    private PeDominante peDominante;

    private LocalDate dataNascimento;

    private Double peso;

    private String nacionalidade;

    private Boolean titular;

    @Enumerated(EnumType.STRING)
    private CondicaoFisica condicaoFisica;

    @Column(length = 1000)
    private String observacoes;

    public Jogador() {}

    public Jogador(String nome, Posicao posicao, Integer numeroCamisa, PeDominante peDominante,
                   LocalDate dataNascimento, Double peso, String nacionalidade,
                   Boolean titular, CondicaoFisica condicaoFisica, String observacoes) {
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.peDominante = peDominante;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.titular = titular;
        this.condicaoFisica = condicaoFisica;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Posicao getPosicao() { return posicao; }
    public void setPosicao(Posicao posicao) { this.posicao = posicao; }

    public Integer getNumeroCamisa() { return numeroCamisa; }
    public void setNumeroCamisa(Integer numeroCamisa) { this.numeroCamisa = numeroCamisa; }

    public PeDominante getPeDominante() { return peDominante; }
    public void setPeDominante(PeDominante peDominante) { this.peDominante = peDominante; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public Boolean getTitular() { return titular; }
    public void setTitular(Boolean titular) { this.titular = titular; }

    public CondicaoFisica getCondicaoFisica() { return condicaoFisica; }
    public void setCondicaoFisica(CondicaoFisica condicaoFisica) { this.condicaoFisica = condicaoFisica; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}
