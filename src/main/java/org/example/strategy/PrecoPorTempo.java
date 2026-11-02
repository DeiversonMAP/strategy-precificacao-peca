package org.example.strategy;

public class PrecoPorTempo implements IEstrategiaPreco {

    private static final double VALOR_POR_HORA = 8.0;

    @Override
    public double calcular(double gramas, double horas) {
        return horas * VALOR_POR_HORA;
    }
}
