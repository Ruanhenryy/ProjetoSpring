package br.senac.projeto.Controller;

import br.senac.projeto.DTO.TarefaDTO;
import br.senac.projeto.Repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository repository;

    public TarefaController(TarefaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public TarefaDTO criar(@RequestBody TarefaDTO tarefa) {
        return repository.salvar(tarefa);
    }

    @GetMapping("/listar")
    public List<TarefaDTO> listar() {
        return repository.listarTodas();
    }

    @GetMapping("/{id}")
    public TarefaDTO buscarPorId(@PathVariable Long id) {
        return repository.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public TarefaDTO atualizar(@PathVariable Long id, @RequestBody TarefaDTO dto) {
        TarefaDTO tarefa = repository.buscarPorId(id);
        if (tarefa != null) {
            tarefa.setTitulo(dto.getTitulo());
            tarefa.setDescricao(dto.getDescricao());
            tarefa.setConcluida(dto.getConcluida());
        }
        return tarefa;
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        TarefaDTO tarefa = repository.buscarPorId(id);
        if (tarefa != null) {
            repository.remover(id);
            return "Tarefa removida com sucesso!";
        }
        return "Tarefa não encontrada!";
    }
}