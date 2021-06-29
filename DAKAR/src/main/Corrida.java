package main;

import java.util.List;

public class Corrida {
    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private Socorrista socorristaCarro;
    private Socorrista socorristaMoto;

    public Corrida() {
    }

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(Double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        if (quantidadeVeiculosPermitidos < listaVeiculos.size())
            listaVeiculos.add(new Carros(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registrarMoto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        if (quantidadeVeiculosPermitidos < listaVeiculos.size())
            listaVeiculos.add(new Motos(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        for (Veiculo veiculo: listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaVeiculos.remove(veiculo);
                break;
            }
        }
    }

    public Veiculo vencedor() {
        double max = 0.0;
        int vencedorId = 0;
        for (Veiculo v : listaVeiculos) {
            double result = v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if (result > max)
                vencedorId = listaVeiculos.indexOf(v);
        }
        return (listaVeiculos.get(vencedorId));
    }

    public void socorrerCarro(String documento) {
        int id = 0;
        for (Veiculo veiculo : listaVeiculos){
            if (veiculo.getPlaca().equals(documento))
                id = listaVeiculos.indexOf(veiculo);
        }
        socorristaCarro.socorrer(listaVeiculos.get(id));
        removerVeiculo(listaVeiculos.get(id));
    }

    public void socorrerMoto(String documento) {
        int id = 0;
        for (Veiculo veiculo : listaVeiculos){
            if (veiculo.getPlaca().equals(documento))
                id = listaVeiculos.indexOf(veiculo);
        }
        socorristaMoto.socorrer(listaVeiculos.get(id));
        removerVeiculo(listaVeiculos.get(id));
    }
}
