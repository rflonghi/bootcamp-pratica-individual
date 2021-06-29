package main;

public class Carros extends Veiculo{

    public Carros() {
    }

    public Carros(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
            super(velocidade, aceleracao, anguloDeGiro, placa, 1000.0, 4);
    }
}
