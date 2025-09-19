package projeto.ToDoList.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;
import projeto.ToDoList.ToDoList.ENUM.prioridade;
import projeto.ToDoList.ToDoList.ENUM.status;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tarefas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class tarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    @Column(name = "prazo")
    private LocalDate prazo;

    @Column(name = "prioridade")
    private prioridade prioridade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private status status;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private usuarioModel usuario;
}
