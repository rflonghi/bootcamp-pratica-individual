package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> roupas = new HashMap<Integer, List<Vestuario>>();

    public GuardaRoupa() {
    }

    public GuardaRoupa(Map<Integer, List<Vestuario>> roupas) {
        this.roupas = roupas;
    }

    public Map<Integer, List<Vestuario>> getroupas() {
        return roupas;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        roupas.put(roupas.size(), listaDeVestuario);
        return roupas.size() - 1;
    }

    public void mostrarVestuarios() {
        for (int i = 0; i < roupas.size(); i++)
            System.out.println("Lista: "+ i + "\n" + roupas.get(i).toString() + "\n");
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> temp = roupas.get(id);
        roupas.remove(id);
        return temp;
    }
}
