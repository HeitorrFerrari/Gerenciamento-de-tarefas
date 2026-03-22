package com.mh.GerenciamentoDeTarefas.services;

import com.mh.GerenciamentoDeTarefas.models.TarefaModel;
import com.mh.GerenciamentoDeTarefas.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaModel> buscarTodasTarefas(){
        return tarefaRepository.findAll();
    }

    public TarefaModel criarTarefa(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }

    public TarefaModel buscarId(Long id) {
        return tarefaRepository.findById(id).get();
    }

    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}