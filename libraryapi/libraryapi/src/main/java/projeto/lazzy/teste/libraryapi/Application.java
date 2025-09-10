package projeto.lazzy.teste.libraryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projeto.lazzy.teste.libraryapi.model.Autor;
import projeto.lazzy.teste.libraryapi.repository.AutorRepository;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args);
	}
}
