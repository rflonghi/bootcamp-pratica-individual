package br.com.meli.starwars.entity.dto;

public class PersonagemDTO {

    private String name;

    public PersonagemDTO() {
    }

    public PersonagemDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
