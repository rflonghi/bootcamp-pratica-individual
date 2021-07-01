package br.com.meli.obterdiploma.model.dto;

import br.com.meli.obterdiploma.model.AlunoDisciplina;

public class AlunoDisciplinaDTO {

    private DisciplinaDTO disciplina;
    private Double nota;

    public AlunoDisciplinaDTO() {
    }

    public AlunoDisciplinaDTO(DisciplinaDTO disciplina, Double nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public DisciplinaDTO getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaDTO disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public AlunoDisciplina toModel() {
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina();
        alunoDisciplina.setDisciplina(getDisciplina().toModel());
        alunoDisciplina.setNota(getNota());

        return alunoDisciplina;
    }
}
