package br.com.meli.mod6aula1_ativcomp.dto;

import br.com.meli.mod6aula1_ativcomp.model.Produto;
import com.sun.istack.NotNull;
import javax.validation.constraints.Size;

public class ProdutoDTO {

    private Long id;
    private String nome;
    private Double preco;
    private String descricao;

    public ProdutoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto toModel() {
        Produto produto = new Produto();
        produto.setNome(getNome());
        produto.setPreco(getPreco());
        produto.setDescricao(getDescricao());
        return produto;
    }
}
