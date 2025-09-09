package projeto.lazzy.teste.libraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.lazzy.teste.libraryapi.model.Autor;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
