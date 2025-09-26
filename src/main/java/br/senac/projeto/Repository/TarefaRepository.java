package br.senac.projeto.Repository;

import br.senac.projeto.DTO.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TarefaRepository {
    private final List<TarefaDTO> tarefas = new ArrayList<>();
    private Long contadorId = 1L;

    public TarefaDTO salvar(TarefaDTO tarefa) {
        tarefa.setId(contadorId++);
        tarefas.add(tarefa);
        return tarefa;
    }

    public List<TarefaDTO> listarTodas() {
        return tarefas;
    }

    public TarefaDTO buscarPorId(Long id) {
        TarefaDTO tarefa = null;
        for (TarefaDTO t : tarefas) {
            if(t.getId().equals(id)){
                tarefa = t;
            }
        }
        return tarefa;
    }

    public void remover(Long id) {
        for (TarefaDTO t : tarefas) {
            if(t.getId().equals(id)){
                tarefas.remove(t);
            }
        }
    }
}
