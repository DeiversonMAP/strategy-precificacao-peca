package org.example.strategy;

public class OrcamentoPeca {

    private final String nomePeca;
    private final double gramas;
    private final double horas;
    private IEstrategiaPreco estrategia;

    public OrcamentoPeca(String nomePeca, double gramas, double horas, IEstrategiaPreco estrategia) {
        this.nomePeca = nomePeca;
        this.gramas = gramas;
        this.horas = horas;
        this.estrategia = estrategia;
    }

    public void setEstrategia(IEstrategiaPreco estrategia) {
        this.estrategia = estrategia;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public double calcularPreco() {
        return estrategia.calcular(gramas, horas);
    }
}
