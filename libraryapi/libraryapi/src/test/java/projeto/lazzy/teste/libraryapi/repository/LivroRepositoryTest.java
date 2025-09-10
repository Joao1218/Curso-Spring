package projeto.lazzy.teste.libraryapi.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import projeto.lazzy.teste.libraryapi.model.Livro;

import static org.junit.jupiter.api.Assertions.*;

class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;

    @Test
    public void salvarTest(){
        Livro livro = new Livro();

    }

}