package Aula4.Exercicio4;

public class program {
    public static void main(String[] args) {
        Funcionario pj = new PJ(Cargos.TECNICO);
        Double salario = pj.pagarSalario(40.0 * 4);
        System.out.printf("Tecnico PJ: R$%.2f\n", salario);
        Funcionario clt = new CLT(Cargos.TECNICO);
        salario = clt.pagarSalario(40.0 * 4);
        System.out.printf("Tecnico CLT: R$%.2f\n", salario);
    }
}
