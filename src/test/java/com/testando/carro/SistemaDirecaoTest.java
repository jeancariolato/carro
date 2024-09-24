package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaDirecaoTest {

    /**
     * Verifica se o resultado do ajuste de direção não é nulo.
     */
    @Test
    void ajusteDirecaoTeste() {
        SistemaDirecao direcao = new SistemaDirecao("Hidráulica", true, "Alumínio", 14.5, "MarcaX", true);

        double resultado = direcao.ajustarDirecao(30.0);

        assertNotNull(resultado, "O resultado do ajuste de direção não deveria ser nulo.");
    }

    /*
     * Verifica se todos os atributos são atualizados corretamente após a substituição do componente.
     */
    @Test
    void substituirComponenteTeste() {
        SistemaDirecao direcao = new SistemaDirecao("Hidráulica", true, "Alumínio", 14.5, "MarcaX", true);

        direcao.substituirComponente("Elétrica", false, "Aço", 12.0, "MarcaY");

        assertEquals("Elétrica", direcao.getTipo(), "O tipo deveria ser 'Elétrica'.");
        assertFalse(direcao.isAssistido(), "A direção assistida deveria ser 'false'.");
        assertEquals("Aço", direcao.getMaterial(), "O material deveria ser 'Aço'.");
        assertEquals(12.0, direcao.getRelacao(), "A relação deveria ser 12.0.");
        assertEquals("MarcaY", direcao.getMarca(), "A marca deveria ser 'MarcaY'.");
    }
}
