package org.example.strategy;

public class PrecoPorMaterial implements IEstrategiaPreco {

    private static final double VALOR_POR_GRAMA = 0.50;

    @Override
    public double calcular(double gramas, double horas) {
        return gramas * VALOR_POR_GRAMA;
    }
}
