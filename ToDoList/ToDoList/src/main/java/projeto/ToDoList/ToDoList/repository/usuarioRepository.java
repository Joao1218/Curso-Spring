package projeto.ToDoList.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.ToDoList.ToDoList.model.usuarioModel;

import java.util.UUID;

public interface usuarioRepository extends JpaRepository<usuarioModel, UUID> {
}
