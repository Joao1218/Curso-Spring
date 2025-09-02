package github.CursoSpring.produtosApi.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_produtos")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    public ProductModel() {
    }

    public ProductModel(Double preco, String descricao, String nome, Long id) {
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
