package org.example.strategy;

public class PrecoMisto implements IEstrategiaPreco {

    private static final double VALOR_POR_GRAMA = 0.30;
    private static final double VALOR_POR_HORA = 5.0;

    @Override
    public double calcular(double gramas, double horas) {
        return gramas * VALOR_POR_GRAMA + horas * VALOR_POR_HORA;
    }
}
