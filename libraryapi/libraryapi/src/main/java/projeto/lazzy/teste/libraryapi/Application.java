package projeto.lazzy.teste.libraryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projeto.lazzy.teste.libraryapi.model.Autor;
import projeto.lazzy.teste.libraryapi.repository.AutorRepository;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);
		exemploSalvarRegistro(repository);

	}

	public static void exemploSalvarRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setName("João");
		autor.setDataNascimento(LocalDate.of(2006,8,12));
		autor.setNacionalidade("Brasileiro");
		var autorSalvo = autorRepository.save(autor);
		System.out.println("Id autor: " + autorSalvo);
	}
}
