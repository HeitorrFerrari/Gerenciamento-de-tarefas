package com.mh.GerenciamentoDeTarefas.controllers;

import com.mh.GerenciamentoDeTarefas.models.TarefaModel;
import com.mh.GerenciamentoDeTarefas.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<TarefaModel> criarTarefa(@RequestBody TarefaModel tarefaModel){
        TarefaModel request = tarefaService.criarTarefa(tarefaModel);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(request.getId())
                .toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<TarefaModel>> buscarTodasTarefas(){
        List<TarefaModel> request = tarefaService.buscarTodasTarefas();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public TarefaModel buscarId(@PathVariable Long id) {
        return tarefaService.buscarId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarTarefa(@PathVariable Long id){
        tarefaService.deletarTarefa(id);
        return ResponseEntity.noContent().build();
    }
}