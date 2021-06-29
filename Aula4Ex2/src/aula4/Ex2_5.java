package aula4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex2_5 {
    public static class Data {
        private Integer dia;
        private Integer mes;
        private Integer ano;

        public Data() {
        }

        public Data(Integer dia, Integer mes, Integer ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        public Integer getDia() {
            return dia;
        }

        public void setDia(Integer dia) {
            this.dia = dia;
        }

        public Integer getMes() {
            return mes;
        }

        public void setMes(Integer mes) {
            this.mes = mes;
        }

        public Integer getAno() {
            return ano;
        }

        public void setAno(Integer ano) {
            this.ano = ano;
        }

        public boolean correctDate(Integer dia, Integer mes, Integer ano) {
            if (dia >= 1 && mes >= 1 && mes <= 12 && ano >= 1)
                return true;
            else
                return false;
        }

        public void addDay(Integer dias) {
            GregorianCalendar calendar = new GregorianCalendar();
            Date date = new Date(ano, mes, dia);
            calendar.setTime(date);
            calendar.set(Calendar.YEAR, ano);
            calendar.add(Calendar.DAY_OF_MONTH, dias);
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            mes = calendar.get(Calendar.MONTH);
            ano = calendar.get(Calendar.YEAR);
        }

        @Override
        public String toString() {
            return "Data (dd/mm/aaaa):" + "\n" +
                    dia + "/" + mes + "/" + ano;
        }
    }
}
