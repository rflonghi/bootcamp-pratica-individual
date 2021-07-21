package br.com.meli.aula2107hql.models;

import br.com.meli.aula2107hql.enums.TurnStatusEnum;

import javax.persistence.*;

@Entity
@Table(name = "turn_status")
public class TurnStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TurnStatusEnum turnStatusEnum;

    private String description;

    public TurnStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TurnStatusEnum getTurnStatusEnum() {
        return turnStatusEnum;
    }

    public void setTurnStatusEnum(TurnStatusEnum turnStatusEnum) {
        this.turnStatusEnum = turnStatusEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
