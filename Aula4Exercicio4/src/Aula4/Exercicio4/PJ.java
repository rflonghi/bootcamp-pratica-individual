package Aula4.Exercicio4;

public class PJ extends Funcionario {

    public PJ() {
    }

    public PJ(Cargos cargo) {
        super(cargo);
    }

    public Double pagarSalario(Double horasTrabalhadasMes) {
        if (getCargo().equals(Cargos.TECNICO))
            return (horasTrabalhadasMes * getCargo().getSalarioCargo() / 20 / 8);
        else if (getCargo().equals(Cargos.ANALISTA))
            return ((horasTrabalhadasMes + 4 * 4) * getCargo().getSalarioCargo() / 20 / 8);
        else if (getCargo().equals(Cargos.GERENTE))
            return ((horasTrabalhadasMes + 4 * 4) * getCargo().getSalarioCargo() / 20 / 8);
        else
            return (horasTrabalhadasMes * getCargo().getSalarioCargo() / 20 / 8);
    }
}
