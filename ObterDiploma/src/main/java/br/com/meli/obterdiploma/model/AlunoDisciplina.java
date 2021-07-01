package br.com.meli.obterdiploma.model;

import br.com.meli.obterdiploma.model.dto.AlunoDisciplinaDTO;

public class AlunoDisciplina {

    private Disciplina disciplina;
    private Double nota;

    public AlunoDisciplina() {
    }

    public AlunoDisciplina(Disciplina disciplina, Double nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public AlunoDisciplinaDTO toDTO() {
        return null;
    }
}
