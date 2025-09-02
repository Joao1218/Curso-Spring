package github.CursoSpring.produtosApi.Controller;

import github.CursoSpring.produtosApi.Model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Produtos")
public class ProductController {

    @PostMapping("/Cadastrar")
    public void salvarProduto(@RequestBody ProductModel produto){
        System.out.println("Produto recebido: " + produto);
    }
}
