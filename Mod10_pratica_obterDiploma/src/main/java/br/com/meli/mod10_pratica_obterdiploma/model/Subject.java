package br.com.meli.mod10_pratica_obterdiploma.model;

public class Subject {

    private String subject;
    private Double note;

    public Subject() {
    }

    public Subject(String subject, Double note) {
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
}