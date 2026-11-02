package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecoMistoTest {

    @Test
    void deveSomarMaterialETempo() {
        IEstrategiaPreco estrategia = new PrecoMisto();
        assertEquals(55.0, estrategia.calcular(100, 5), 0.001);
    }
}
