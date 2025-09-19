package projeto.ToDoList.ToDoList.DTO;

import projeto.ToDoList.ToDoList.ENUM.prioridade;
import projeto.ToDoList.ToDoList.ENUM.status;
import projeto.ToDoList.ToDoList.model.tarefasModel;

import java.time.LocalDate;

public record tarefasDTO(String nome, String descricao, LocalDate prazo, prioridade prioridade, status status) {
    public tarefasDTO{
        tarefasModel tarefas = new tarefasModel();
        tarefas.setNome(this.nome());
        tarefas.setDescricao(this.descricao());
        tarefas.setPrazo(this.prazo());
        tarefas.setPrioridade(this.prioridade());
        tarefas.setStatus(this.status());
    }
}
