package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTransmissaoTest {

    /**
     * Verifica se o número de marchas não pode ser 6.
     */
    @Test
    void trocarMarchaTeste() {
        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        motor.verificarEstado(); // Verifica o estado do motor (embora o resultado não esteja sendo usado aqui)

        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        // O número de marchas não deve ser 6, já que foi definido como 5
        assertNotEquals(6, sistemaTransmissao.getNumeroMarchas(), "O número de marchas não pode ser 6");
    }

    /**
     * Verifica se o sistema de transmissão está desligado.
     */
    @Test
    void estadoTransmissaoTeste() {
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        boolean estado = sistemaTransmissao.getEstado();

        // O estado do sistema deve ser 'false' para indicar que está desligado
        assertFalse(estado, "O sistema de transmissão deveria estar desligado!");
    }
}
