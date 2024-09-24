package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    @Test
    public void testeMotorNaoNulo() {
        // Arrange: Criar um motor
        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", false);

        assertNotNull(motor.getTipo());
        assertNotNull(motor.getMarca());
        assertNotNull(motor.getPotencia());
    }

    @Test
    public void testeDesligarMotor() {

        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", true);

        motor.desligarMotor();

        assertFalse(motor.verificarEstado());
    }

}