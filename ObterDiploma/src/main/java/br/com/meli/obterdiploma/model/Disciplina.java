package br.com.meli.obterdiploma.model;

import br.com.meli.obterdiploma.model.dto.DisciplinaDTO;

public class Disciplina {

    private String nome;

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DisciplinaDTO toDTO() {
        DisciplinaDTO dto = new DisciplinaDTO();
        dto.setNome(getNome());
        return dto;
    }
}
