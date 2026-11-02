package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcamentoPecaTest {

    @Test
    void deveDelegarCalculoParaEstrategiaInformada() {
        OrcamentoPeca orcamento = new OrcamentoPeca("Busto", 100, 5, new PrecoPorMaterial());
        assertEquals(50.0, orcamento.calcularPreco(), 0.001);
    }

    @Test
    void devePermitirTrocarEstrategiaEmTempoDeExecucao() {
        OrcamentoPeca orcamento = new OrcamentoPeca("Busto", 100, 5, new PrecoPorMaterial());
        assertEquals(50.0, orcamento.calcularPreco(), 0.001);

        orcamento.setEstrategia(new PrecoPorTempo());
        assertEquals(40.0, orcamento.calcularPreco(), 0.001);

        orcamento.setEstrategia(new PrecoMisto());
        assertEquals(55.0, orcamento.calcularPreco(), 0.001);
    }

    @Test
    void deveManterNomeDaPeca() {
        OrcamentoPeca orcamento = new OrcamentoPeca("Chaveiro", 10, 1, new PrecoMisto());
        assertEquals("Chaveiro", orcamento.getNomePeca());
    }
}
