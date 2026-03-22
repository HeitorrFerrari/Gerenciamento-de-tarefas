package com.mh.GerenciamentoDeTarefas.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Tarefa")
@Table(name = "tb_tarefa")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "descricao_tarefa")
    private String descricao;
    @Column(name = "vencimento_tarefa")
    private LocalDate dataVencimento;
    private Boolean concluida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public TarefaModel(Long id, String descricao, LocalDate dataVencimento, Boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.concluida = concluida;


    }
}
