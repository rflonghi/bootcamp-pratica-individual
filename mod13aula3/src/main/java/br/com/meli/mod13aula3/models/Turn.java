package br.com.meli.mod13aula3.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Document(collection = "turn")
public class Turn {

    @Id
    private String id;

    private Date day;

    @ManyToOne(targetEntity = Diary.class, cascade = CascadeType.ALL)
    private Diary diary;

    @ManyToOne(targetEntity = TurnStatus.class, cascade = CascadeType.ALL)
    private TurnStatus turnStatus;

    @ManyToOne(targetEntity = Patient.class, cascade = CascadeType.ALL)
    private Patient patient;

    @OneToOne(targetEntity = Turn.class, cascade = CascadeType.ALL)
    private Turn oldTurn;

    public Turn() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public TurnStatus getTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Turn getOldTurn() {
        return oldTurn;
    }

    public void setOldTurn(Turn oldTurn) {
        this.oldTurn = oldTurn;
    }
}


