package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    /**
     * Verifica se o estado inicial é nulo e se pode ser alterado para um valor não nulo.
     */
    @Test
    public void testeEstadoNulo() {
        Banco banco = new Banco(1, "Tecido", "Cinza", "Fixo", null);
        
        assertNull(banco.getEstado());

        banco.setEstado("Usado");
        assertNotNull(banco.getEstado());
    }

    /**Verifica se o estado pode ser atualizado corretamente e se o valor anterior
     * é diferente do novo estado.
     */
    @Test
    public void testeDeEstadoEquals() {
        Banco banco = new Banco(1, "Tecido", "Cinza", "Fixo", "Novo");

        banco.setEstado("Usado");

        assertNotEquals("Novo", banco.getEstado());
        assertEquals("Usado", banco.getEstado());
    }
}
