package br.com.meli.obterdiploma.model;

import br.com.meli.obterdiploma.model.dto.AlunoDTO;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno {
    private String nome;
    private List<AlunoDisciplina> alunoDisciplina;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AlunoDisciplina> getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(List<AlunoDisciplina> alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public AlunoDTO toDTO() {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setNome(getNome());
        alunoDTO.setAlunoDisciplina(alunoDisciplina.stream().map(AlunoDisciplina::toDTO).collect(Collectors.toList()));
        return alunoDTO;
    }
}
