package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @Test
    public void testeEstadoNulo() {
        Banco banco = new Banco(1, "Tecido", "Cinza", "Fixo", null);

        assertNull(banco.getEstado());

        banco.setEstado("Usado");
        assertNotNull(banco.getEstado());
    }

    @Test
    public void testeDeEstadoEquals() {
        Banco banco = new Banco(1, "Tecido", "Cinza", "Fixo", "Novo");

        banco.setEstado("Usado");

        assertNotEquals("Novo", banco.getEstado());
        assertEquals("Usado", banco.getEstado());
    }

}