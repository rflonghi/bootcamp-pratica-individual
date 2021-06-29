package main;

public class SocorristaCarro extends Socorrista {
    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo carro " + veiculo.getPlaca());
    }
}
