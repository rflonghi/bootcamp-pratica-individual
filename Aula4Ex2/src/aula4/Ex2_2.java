package aula4;

public class Ex2_2 {

    public static class Counter {

        private Integer valor;

        public Counter() {
        }

        public Counter(Integer valor) {
            this.valor = valor;
        }

        public Counter(Counter c) {
            Counter counter = new Counter(c.getValor());
        }

        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }

        public Integer aumentar(Integer valor) {
            setValor(getValor() + valor);
            return getValor();
        }

        public Integer diminuir(Integer valor) {
            setValor((getValor() - valor));
            return getValor();
        }
    }
}
