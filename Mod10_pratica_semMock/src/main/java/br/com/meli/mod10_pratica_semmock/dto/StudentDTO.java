package br.com.meli.mod10_pratica_semmock.dto;

import br.com.meli.mod10_pratica_semmock.model.Student;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDTO {

    @NotNull
    @Size(min = 3, max = 50)
    @Pattern(regexp = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]*$")
    private String name;

    @NotNull
    private List<SubjectDTO> subjects;

    public StudentDTO() {
    }

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

    public Student toModel() {
        return new Student(getName(), subjects.stream().map(SubjectDTO::toModel).collect(Collectors.toList()));
    }
}
