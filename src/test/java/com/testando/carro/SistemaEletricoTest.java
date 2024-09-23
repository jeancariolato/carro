package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaEletricoTest {

    @Test
    void verificarBateriaTeste(){
        SistemaEletrico sistema = new SistemaEletrico(12.0, 50.0, "Ácido-Chumbo", true, "MarcaX");

        sistema.verificarBateria();

        assertTrue(sistema.getVoltagem() < 12, "A voltagem deve estar abaixo de 12 para a bateria estar em mau estado.");
    }

    @Test
    void estadoSistemaTeste(){
        SistemaEletrico sistema = new SistemaEletrico(10.0, 50.0, "Ácido-Chumbo", true, "MarcaX");

        assertTrue(sistema.getEstado(), "O Sistema deveria ser ligado!");
    }



}