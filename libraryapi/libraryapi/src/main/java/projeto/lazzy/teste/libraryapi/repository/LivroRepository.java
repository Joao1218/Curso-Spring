package projeto.lazzy.teste.libraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.lazzy.teste.libraryapi.model.Livro;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
    
}
