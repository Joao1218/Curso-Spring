package projeto.ToDoList.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.ToDoList.ToDoList.model.tarefasModel;

import java.util.UUID;

public interface tarefasRepository extends JpaRepository<tarefasModel, UUID> {

}
