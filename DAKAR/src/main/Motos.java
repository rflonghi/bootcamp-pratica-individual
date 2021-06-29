package main;

public class Motos extends Veiculo{

    public Motos() {
    }

    public Motos(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300.0, 2);
    }
}
