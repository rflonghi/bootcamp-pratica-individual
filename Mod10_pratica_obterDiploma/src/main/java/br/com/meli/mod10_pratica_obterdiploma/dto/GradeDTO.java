package br.com.meli.mod10_pratica_obterdiploma.dto;

public class GradeDTO {

    private String message;
    private Double average;
    private StudentDTO student;

    public GradeDTO() {
    }

    public GradeDTO(String message, Double average, StudentDTO student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }

    public GradeDTO(StudentDTO student) {
        this.student = student;
        calculateAverage(student);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public void calculateAverage(StudentDTO student) {
        average = (student.getSubjects().stream().mapToDouble(SubjectDTO::getNote).sum() / student.getSubjects().size());
        average = Math.floor(average * 10.0)/10.0;
        message = String.format("Sua média foi de %.1f", average);
    }
}
