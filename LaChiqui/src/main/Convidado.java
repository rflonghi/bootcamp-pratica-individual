package main;

public class Convidado {
    private ConvidadoTipo convidadoTipo;
    private String nome;

    public Convidado() {
    }

    public Convidado(ConvidadoTipo convidadoTipo, String nome) {
        this.convidadoTipo = convidadoTipo;
        this.nome = nome;
    }

    public ConvidadoTipo getConvidadoTipo() {
        return convidadoTipo;
    }

    public void setConvidadoTipo(ConvidadoTipo convidadoTipo) {
        this.convidadoTipo = convidadoTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
