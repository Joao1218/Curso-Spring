package projeto.lazzy.teste.libraryapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import projeto.lazzy.teste.libraryapi.DTO.autorDTO;
import projeto.lazzy.teste.libraryapi.model.Autor;
import projeto.lazzy.teste.libraryapi.services.autorServide;

import java.net.URI;

@RestController
@RequestMapping("/autores")
// http://localhost:8080/autores

public class autorController {
    @Autowired
    private autorServide autor;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody autorDTO autor2){
        Autor autorEntidade = autor2.mapearAutor();
        autor.salvarAutor(autorEntidade);
        URI localtion = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorEntidade.getId())
                .toUri();
        return ResponseEntity.created(localtion).build();
    }

}
