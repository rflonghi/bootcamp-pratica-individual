package br.com.meli.mod6aula1_ativcomp.model;

import br.com.meli.mod6aula1_ativcomp.dto.ProdutoDTO;
import com.sun.istack.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Size(min = 3, max = 50)
    private String nome;

    @NotNull
    private Double preco;

    @NotNull
    @Size(min = 3, max = 300)
    private String descricao;

    public Produto() {
    }

    public Long getId() {
        return id;
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

    public ProdutoDTO toDTO() {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setId(getId());
        produtoDTO.setNome(getNome());
        produtoDTO.setPreco(getPreco());
        produtoDTO.setDescricao(getDescricao());
        return produtoDTO;
    }
}
