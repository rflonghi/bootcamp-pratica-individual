package br.com.meli.mod10_pratica_semmock.dto;

import br.com.meli.mod10_pratica_semmock.model.Subject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SubjectDTO {

    @NotNull
    @Size(min = 3, max = 50)
    @Pattern(regexp="^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]*$")
    private String subject;

    @NotNull
    @Size(min = 1, max = 2)
    @Pattern(regexp="^[0-9]*$")
    private Double note;

    public SubjectDTO() {
    }

    public SubjectDTO(String subject, Double note) {
        this.subject = subject;
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Subject toModel() {
        return new Subject(getSubject(), getNote());
    }
}
