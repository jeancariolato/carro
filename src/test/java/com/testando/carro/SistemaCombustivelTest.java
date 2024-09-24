package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaCombustivelTest {

    /**
     * Verifica se o nível de combustível é atualizado corretamente ao abastecer.
     */
    @Test
    void abastecerDentroDaCapacidade() {
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel(10, 50, "Gasolina", "MarcaA", true);

        sistemaCombustivel.abastecer(20.0);

        assertEquals(20.0, sistemaCombustivel.verificarNivel(), "O nível de combustível é menor do que o esperado");
    }

    /**
     * Verifica se todos os atributos são atualizados corretamente após a substituição do tanque.
     */
    @Test
    void testeSubstituirTanque() {
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel(10, 50, "Gasolina", "MarcaA", true);

        sistemaCombustivel.subtistuirTanque(5.0, 40.0, "Diesel", "MarcaB", false);

        assertEquals(5.0, sistemaCombustivel.verificarNivel(), "O nível de combustível deveria ser 5 após substituir o tanque.");
        assertEquals(40.0, sistemaCombustivel.getCapacidade(), "A capacidade do tanque deveria ser 40 após a substituição.");
        assertEquals("Diesel", sistemaCombustivel.getTipoDeCombustivel(), "O tipo de combustível deveria ser Diesel após a substituição.");
        assertEquals("MarcaB", sistemaCombustivel.getMarca(), "A marca do tanque deveria ser MarcaB após a substituição.");
        assertFalse(sistemaCombustivel.isEstado(), "O estado deveria ser falso após a substituição.");
    }
}
