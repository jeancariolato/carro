package com.testando.carro;

import com.testando.carro.Freios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreiosTest {


    /**
     * Verifica se o desgaste calculado é igual ao valor esperado de 3.5.
     */
    @Test
    void VerificarDesgastetest() {
        Freios freios = new Freios("A disco", "Ferro", 25.0, "Cobreq", 12.0);

        double desgaste = freios.verificarDesgaste();
        double esperado = 3.5;

        assertEquals(esperado, desgaste, "O nível de desgaste deve ser 3.5");
    }

    /**
     * Verifica se o desgaste calculado é maior que zero.
     */
    @Test
    void VerificarDesgastetest2() {
        Freios freios = new Freios("A disco", "Ferro", 25.0, "Cobreq", 1);

        double desgaste = freios.verificarDesgaste();

        assertTrue(desgaste > 0, "O nível de desgaste deve ser maior que zero");
    }
}
