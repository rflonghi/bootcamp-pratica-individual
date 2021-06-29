package main;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        GuardaRoupa gr = new GuardaRoupa();
        Integer codigo;

        List<Vestuario> lacoste = new ArrayList<Vestuario>();
        lacoste.add(new Vestuario("Lacoste", "Camiseta"));
        lacoste.add(new Vestuario("Lacoste", "Calça"));
        lacoste.add(new Vestuario("Lacoste", "Boné"));
        lacoste.add(new Vestuario("Lacoste", "Blusa"));
        lacoste.add(new Vestuario("Lacoste", "Saia"));
        codigo = gr.guardarVestuarios(lacoste);

        List<Vestuario> nike = new ArrayList<Vestuario>();
        nike.add(new Vestuario("Nike", "Camiseta"));
        nike.add(new Vestuario("Nike", "Calça"));
        nike.add(new Vestuario("Nike", "Boné"));
        codigo = gr.guardarVestuarios(nike);

        gr.mostrarVestuarios();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Lista removida: "+ codigo + "\n" + gr.devolverVestuarios(codigo).toString() + "\n");
        System.out.println("---------------------------------------------------------------------------------");
        gr.mostrarVestuarios();
    }
}
