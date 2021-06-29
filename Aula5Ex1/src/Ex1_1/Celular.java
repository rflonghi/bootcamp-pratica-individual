package Ex1_1;

public class Celular implements Precedence<Celular> {

    private Integer numero;
    private String holder;

    public Celular() {
    }

    public Celular(Integer numero, String holder) {
        this.numero = numero;
        this.holder = holder;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precedenceA(Celular celular) {
        return getNumero().compareTo(celular.getNumero());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", holder='" + holder + '\'' +
                '}';
    }
}
