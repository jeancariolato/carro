package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuspensaoTest {

    /**
     * Verifica se a altura ajustada está correta.
     */
    @Test
    void ajustarAlturaTeste() {
        Suspensao suspensao = new Suspensao("Hidráulica", "Aço", 10.0, 5, "MarcaZ");

        // Ajusta a altura para 12
        suspensao.ajustarAltura(12);

        // A altura esperada após ajuste deve ser 12.5
        assertEquals(12.5, suspensao.getAltura(), "A Altura da suspensão deveria ser 12.5");
    }

    /**
     * Verifica se as duas instâncias de suspensão não são iguais.
     */
    @Test
    void compararSuspensoes() {
        Suspensao suspensao1 = new Suspensao("Mecânica", "Alumínio", 9.0, 4, "MarcaB");
        Suspensao suspensao2 = new Suspensao("Hidráulica", "Aço", 10.5, 5, "MarcaA");

        // As duas suspensões devem ser diferentes
        assertNotEquals(suspensao1, suspensao2, "As suspensões não podem ser iguais.");
    }
}
