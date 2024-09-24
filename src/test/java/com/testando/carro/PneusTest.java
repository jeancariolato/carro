package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PneusTest {

    /**
     * Verifica se a pressão do pneu é alterada corretamente após o ajuste.
     */
    @Test
    public void testAjustarPressao() {
        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        pneu.ajustarPressao(28.0);

        assertNotEquals(32.0, pneu.verificarPressao(), "A pressão do pneu deve ser diferente de 32.0 após o ajuste.");
    }

    /**
     * Verifica se o estado do pneu foi definido corretamente como "Novo".
     */
    @Test
    public void testPneuNovoUsado() {
        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        assertTrue(pneu.getEstado().equals("Usado"), "O estado do pneu deve ser 'Usado'.");
    }
}
