package Aula4.Exercicio4;

public enum Cargos {
    TECNICO(3200), ANALISTA(4000), GERENTE(6000), DIRETOR(15000);

    public int salarioCargo;

    Cargos(int salario) {
        salarioCargo = salario;
    }

    public int getSalarioCargo() {
        return salarioCargo;
    }
}
