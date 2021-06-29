package Aula4.Exercicio4;

public abstract class Funcionario {
    private Cargos cargo;

    public Funcionario() {
    }

    public Funcionario(Cargos cargo) {
        this.cargo = cargo;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public abstract Double pagarSalario(Double horasTrabalhadas);
}
