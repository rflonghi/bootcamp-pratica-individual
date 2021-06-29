package Aula4.Exercicio4;

public class CLT extends Funcionario {

    public CLT() {
    }

    public CLT(Cargos cargo) {
        super(cargo);
    }

    public Double pagarSalario(Double horasTrabalhadasMes) {
        if (getCargo().equals(Cargos.TECNICO))
            return (getCargo().getSalarioCargo() * 1.05);
        else if (getCargo().equals(Cargos.ANALISTA))
            return (getCargo().getSalarioCargo() * 1.08);
        else if (getCargo().equals(Cargos.GERENTE))
            return (getCargo().getSalarioCargo() * 1.125);
        else
            return (getCargo().getSalarioCargo() * 1.03);
    }
}
