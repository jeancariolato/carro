package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuzesTest {

    @Test
    public void testAjustarIntensidadeLuzesLigadas() {

        Luzes luzes = new Luzes("LED", 50, "Branco", true, "Modelo Z");

        luzes.ajustarIntensidade(100);

        assertEquals(50, luzes.getIntensidade());

    }

    @Test
    public void testeNaoLigarLuzes() {
        //VOLTAGEM INSUFICIENTE (voltagem<12)
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura"); // supondo que 5V é insuficiente
        Luzes luzes = new Luzes("LED", 50, "Branco", false, "Modelo X");

        luzes.ligaLuzes(sistemaEletrico);

        assertFalse(luzes.isEstado());
    }

}