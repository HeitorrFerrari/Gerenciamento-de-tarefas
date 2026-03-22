package com.mh.GerenciamentoDeTarefas.repositories;

import com.mh.GerenciamentoDeTarefas.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {

}
