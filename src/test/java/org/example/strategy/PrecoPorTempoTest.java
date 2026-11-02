package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecoPorTempoTest {

    @Test
    void deveCalcularPrecoSomentePeloTempo() {
        IEstrategiaPreco estrategia = new PrecoPorTempo();
        assertEquals(40.0, estrategia.calcular(100, 5), 0.001);
    }

    @Test
    void deveIgnorarGramasDeFilamento() {
        IEstrategiaPreco estrategia = new PrecoPorTempo();
        assertEquals(estrategia.calcular(10, 5), estrategia.calcular(500, 5), 0.001);
    }
}
