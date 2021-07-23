package br.com.meli.mod14_aula3.models;

import br.com.meli.mod14_aula3.enums.TurnStatusEnum;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;

@Document(collection = "turnStatus")
public class TurnStatus {

    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private TurnStatusEnum turnStatusEnum;

    private String description;

    public TurnStatus() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
