package br.com.meli.obterdiploma.model.dto;

import br.com.meli.obterdiploma.model.Disciplina;

public class DisciplinaDTO {

    private String nome;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina toModel() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(getNome());
        return disciplina;
    }
}
