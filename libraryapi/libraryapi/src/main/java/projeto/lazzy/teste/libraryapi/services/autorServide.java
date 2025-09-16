package projeto.lazzy.teste.libraryapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.lazzy.teste.libraryapi.DTO.autorDTO;
import projeto.lazzy.teste.libraryapi.model.Autor;
import projeto.lazzy.teste.libraryapi.repository.AutorRepository;

@Service
public class autorServide {
    @Autowired
    AutorRepository repository;

    public void salvarAutor(Autor autor){
        repository.save(autor);
    }
}
