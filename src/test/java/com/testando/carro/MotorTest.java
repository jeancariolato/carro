package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    /**
     * Verifica se o tipo, marca e potência do motor foram corretamente inicializados.
     */
    @Test
    public void testeMotorNaoNulo() {
        // Arrange: Criar um motor
        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", false);

        assertNotNull(motor.getTipo(), "O tipo do motor não deve ser nulo.");
        assertNotNull(motor.getMarca(), "A marca do motor não deve ser nula.");
        assertNotNull(motor.getPotencia(), "A potência do motor não deve ser nula.");
    }

    /**
     * Verifica se o estado do motor é alterado corretamente após ser desligado.
     */
    @Test
    public void testeDesligarMotor() {
        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", true);

        motor.desligarMotor();

        assertFalse(motor.verificarEstado(), "O motor deve estar desligado");
    }
}
