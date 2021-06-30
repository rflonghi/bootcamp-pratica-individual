package main;

import java.util.Random;

public class FogoArtificio {

    private FogoArtificioTipo fogoArtificioTipo;

    public FogoArtificio() {
    }

    public FogoArtificio(FogoArtificioTipo fogoArtificioTipo) {
        this.fogoArtificioTipo = fogoArtificioTipo;
    }

    public FogoArtificioTipo getFogoArtificioTipo() {
        return fogoArtificioTipo;
    }

    public void setFogoArtificioTipo(FogoArtificioTipo fogoArtificioTipo) {
        this.fogoArtificioTipo = fogoArtificioTipo;
    }

    public void explodir() {
        Random random = new Random();
        System.out.print("B");
        int x = random.nextInt(9) + 1;
        for (int i = 0; i < x; i++)
            System.out.print("u");
        System.out.println("m!");
    }
}
