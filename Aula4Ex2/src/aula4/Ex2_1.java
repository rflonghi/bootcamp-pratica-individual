package aula4;

public class Ex2_1 {

    public static class ContaCorrente {

        private Long numero;
        private Integer agencia;
        private Double saldo;

        public ContaCorrente() {
        }

        public ContaCorrente(Long numero, Integer agencia, Double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.saldo = saldo;
        }

        public ContaCorrente(ContaCorrente cc) {
           ContaCorrente contaCorrente = new ContaCorrente(cc.getNumero(), cc.getAgencia(), cc.getSaldo());
        }

        public void deposito(Double valorDepositado) {
            setSaldo(getSaldo() + valorDepositado);
        }

        public void saque(Double valorSacado) {
            setSaldo(getSaldo() - valorSacado);
        }

        public void devolucao(Double valorDevolvido) {
            setSaldo(getSaldo() + valorDevolvido);
        }

        public void transferencia(ContaCorrente cc, Double valorDeposito) {
            setSaldo(getSaldo() - valorDeposito);
            cc.setSaldo(getSaldo() + valorDeposito);
        }

        public Long getNumero() {
            return numero;
        }

        public void setNumero(Long numero) {
            this.numero = numero;
        }

        public Integer getAgencia() {
            return agencia;
        }

        public void setAgencia(Integer agencia) {
            this.agencia = agencia;
        }

        public Double getSaldo() {
            return saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }
    }
}
