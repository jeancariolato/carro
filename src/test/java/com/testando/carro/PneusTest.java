package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PneusTest {

    @Test
    public void testAjustarPressao() {

        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        pneu.ajustarPressao(28.0);

        assertNotEquals(32.0, pneu.verificarPressao());
    }

    @Test
    public void testPneuNovoUsado() {

        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        assertTrue(pneu.getEstado().equals("Usado"));
    }

}