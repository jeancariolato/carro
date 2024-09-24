package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuzesTest {

    /**
     * Testa o ajuste da intensidade das luzes quando estão ligadas.
     * Verifica se a intensidade não é alterada quando o valor fornecido é maior que o máximo permitido.
     */
    @Test
    public void testAjustarIntensidadeLuzesLigadas() {
        Luzes luzes = new Luzes("LED", 50, "Branco", true, "Modelo Z");

        luzes.ajustarIntensidade(100);

        assertEquals(50, luzes.getIntensidade(), "A intensidade das luzes deve permanecer em 50.");
    }

    /**
     * Verifica se as luzes não são ligadas quando a voltagem do sistema elétrico é
     * inferior ao necessário.
     */
    @Test
    public void testeNaoLigarLuzes() {
        // VOLTAGEM INSUFICIENTE (voltagem < 12)
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura"); // supondo que 5V é insuficiente
        Luzes luzes = new Luzes("LED", 50, "Branco", false, "Modelo X");

        luzes.ligaLuzes(sistemaEletrico);

        assertFalse(luzes.isEstado(), "As luzes não devem estar ligadas devido à voltagem insuficiente.");
    }
}
