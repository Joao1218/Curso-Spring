package projeto.ToDoList.ToDoList.DTO;

import projeto.ToDoList.ToDoList.model.usuarioModel;

import java.time.LocalDate;

public record usuarioDTO(String nome, LocalDate dataNascimento, String email, String password) {
    public usuarioDTO{
        usuarioModel usuario = new usuarioModel();
        usuario.setNome(this.nome());
        usuario.setDataNasicmento(this.dataNascimento());
        usuario.setEmail(this.email());
        usuario.setPassword(this.password());
    }
}
