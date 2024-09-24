package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortasTest {

    /**
     * Verifica se a porta é aberta corretamente e se seu estado muda para 'true'.
     */
    @Test
    void testPortaAberta() {
        Portas porta = new Portas(4, "Aço", "Preto", "Dianteira", false);
        Luzes luzes = new Luzes("LED", 25, "AMARELA", false, "H3");
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura");

        porta.abrirPorta(luzes, sistemaEletrico); // Abrir porta já set como 'true'
        assertTrue(porta.isEstado(), "A porta deve estar aberta.");
    }

    /**
     * Verifica se a porta é fechada corretamente e se seu estado muda para 'false'.
     */
    @Test
    void testPortaFechada() {
        Portas porta = new Portas(4, "Aço", "Preto", "Dianteira", true);
        porta.fecharPorta();
        assertFalse(porta.isEstado(), "A porta deve estar fechada.");
    }

}
