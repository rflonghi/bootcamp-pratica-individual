package br.com.meli.obterdiploma.model.dto;

import br.com.meli.obterdiploma.model.Aluno;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {

    private String nome;
    private List<AlunoDisciplinaDTO> alunoDisciplina;

    public AlunoDTO() {
    }

    public AlunoDTO(String nome, List<AlunoDisciplinaDTO> alunoDisciplina) {
        this.nome = nome;
        this.alunoDisciplina = alunoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AlunoDisciplinaDTO> getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(List<AlunoDisciplinaDTO> alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public Aluno toModel() {
        Aluno aluno = new Aluno();
        aluno.setNome(getNome());
        aluno.setAlunoDisciplina(alunoDisciplina.stream().map(AlunoDisciplinaDTO::toModel).collect(Collectors.toList()));
        return aluno;
    }
}
