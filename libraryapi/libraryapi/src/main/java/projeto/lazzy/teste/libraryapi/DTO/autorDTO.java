package projeto.lazzy.teste.libraryapi.DTO;

import projeto.lazzy.teste.libraryapi.model.Autor;

import java.time.LocalDate;

public record autorDTO(String nome, LocalDate dataNascimento, String nacionalidade) {

    public Autor mapearAutor(){
        Autor autor = new Autor();
        autor.setName(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
