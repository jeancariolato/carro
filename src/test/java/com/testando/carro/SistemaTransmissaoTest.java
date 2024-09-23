package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTransmissaoTest {

    @Test
    void trocarMarchaTeste(){
        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        motor.verificarEstado();
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        assertNotEquals(6, sistemaTransmissao.getNumeroMarchas(), "O número de marchas não pode ser 6");

    }

    @Test
    void estadoTransmissaoTeste(){
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        boolean estado = sistemaTransmissao.getEstado();

        assertFalse(estado, "O sistema de transmissão deveria estar desligado!");
    }



}