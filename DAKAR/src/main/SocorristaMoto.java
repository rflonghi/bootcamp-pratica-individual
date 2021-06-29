package main;

public class SocorristaMoto extends Socorrista{
    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo moto " + veiculo.getPlaca());
    }
}
