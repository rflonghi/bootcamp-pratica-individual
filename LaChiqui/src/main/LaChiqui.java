package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LaChiqui {

    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<Convidado>();
        convidados.add(new Convidado(ConvidadoTipo.MELI, "João"));
        convidados.add(new Convidado(ConvidadoTipo.MELI, "Maria"));
        convidados.add(new Convidado(ConvidadoTipo.STANDART, "Paulo"));
        convidados.add(new Convidado(ConvidadoTipo.STANDART, "Carla"));

        List<FogoArtificio> fogosArtificio = new ArrayList<FogoArtificio>();
        fogosArtificio.add(new FogoArtificio(FogoArtificioTipo.INDIVIDUAL));
        fogosArtificio.add(new FogoArtificio(FogoArtificioTipo.INDIVIDUAL));
        fogosArtificio.add(new FogoArtificio(FogoArtificioTipo.INDIVIDUAL));
        fogosArtificio.add(new FogoArtificio(FogoArtificioTipo.PACOTE));
        fogosArtificio.add(new FogoArtificio(FogoArtificioTipo.PACOTE));

        apagarVela(convidados, fogosArtificio);
    }

    public static void apagarVela(List<Convidado> convidados, List<FogoArtificio> fogosArtificio) {
        for (FogoArtificio f : fogosArtificio) {
            if (f.getFogoArtificioTipo().equals(FogoArtificioTipo.INDIVIDUAL))
                f.explodir();
            else {
                Random random = new Random();
                int qtd = random.nextInt(5) + 1;
                for (int i = 0; i < qtd; i++)
                    f.explodir();
            }
        }
        for (Convidado c : convidados) {
            if (c.getConvidadoTipo().equals(ConvidadoTipo.MELI))
                System.out.println(c.getNome() + ": Viva la Chiqui !!");
        }
    }
}
