package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuspensaoTest {
    @Test
    void ajustarAlturaTeste(){
        Suspensao suspensao = new Suspensao("Hidráulica", "Aço", 10.0, 5, "MarcaZ");
        suspensao.ajustarAltura(12);
        assertEquals(12.5, suspensao.getAltura(), "A Altura da suspensão deveria ser 12.5");
    }

    @Test
    void compararSuspensoes(){
        Suspensao suspensao1 = new Suspensao("Mecânica", "Alumínio", 9.0, 4, "MarcaB");
        Suspensao suspensao2 = new Suspensao("Hidráulica", "Aço", 10.5, 5, "MarcaA");

        assertNotEquals(suspensao1,suspensao2, "As suspensões não podem ser iguais.");
    }


}