package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecoPorMaterialTest {

    @Test
    void deveCalcularPrecoSomentePeloMaterial() {
        IEstrategiaPreco estrategia = new PrecoPorMaterial();
        assertEquals(50.0, estrategia.calcular(100, 5), 0.001);
    }

    @Test
    void deveIgnorarHorasDeImpressao() {
        IEstrategiaPreco estrategia = new PrecoPorMaterial();
        assertEquals(estrategia.calcular(100, 1), estrategia.calcular(100, 20), 0.001);
    }
}
