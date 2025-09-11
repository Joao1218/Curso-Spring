package projeto.lazzy.teste.libraryapi.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import projeto.lazzy.teste.libraryapi.model.Autor;
import projeto.lazzy.teste.libraryapi.model.GeneroLivro;
import projeto.lazzy.teste.libraryapi.model.Livro;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;

    @Test
    public void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("Slaaaaaaaaaaaa");
        livro.setPreco(BigDecimal.valueOf(234.50));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Abobrinhas");
        livro.setDataPublicacao(LocalDate.of(1994,2,12));

        Autor autor = new Autor();
        autor.setName("Maria");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1951, 1, 31));

        livro.setAutor(autor);

        repository.save(livro);
    }

}