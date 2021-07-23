package br.com.meli.mod13aula3.dtos;

import com.sun.istack.NotNull;

import java.util.Date;

public class DateRequestDTO {

    @NotNull
    private Date date;

    public DateRequestDTO() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
