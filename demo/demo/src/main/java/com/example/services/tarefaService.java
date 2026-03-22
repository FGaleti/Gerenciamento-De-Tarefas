package services;

import model.Tarefa;
import org.springframework.stereotype.Service;
import repositories.TarefaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa atualizar(Long id, Tarefa tarefaAtualizada) {
        tarefaAtualizada.setId(id);
        return tarefaRepository.save(tarefaAtualizada);
    }

    public boolean deletarPorId(Long id) {
        if (!tarefaRepository.existsById(id)) {
            return false;
        }
        tarefaRepository.deleteById(id);
        return true;
    }
}
