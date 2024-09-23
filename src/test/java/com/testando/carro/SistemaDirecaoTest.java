package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaDirecaoTest {

    @Test
    void ajusteDirecaoTeste(){
        SistemaDirecao direcao = new SistemaDirecao("Hidráulica", true, "Alumínio", 14.5, "MarcaX", true);

        double resultado = direcao.ajustarDirecao(30.0);

        assertNotNull(resultado, "O resultado do ajuste de direção não deveria ser nulo.");

    }

    @Test
    void substituirComponenteTeste(){

        SistemaDirecao direcao = new SistemaDirecao("Hidráulica", true, "Alumínio", 14.5, "MarcaX", true);

        direcao.substituirComponente("Elétrica", false, "Aço", 12.0, "MarcaY");

        assertAll("Verificar todas as mudanças de componentes",
                () -> assertEquals("Elétrica", direcao.getTipo(), "O tipo deveria ser 'Elétrica'."),
                () -> assertFalse(direcao.isAssistido(), "A direção assistida deveria ser 'false'."),
                () -> assertEquals("Aço", direcao.getMaterial(), "O material deveria ser 'Aço'."),
                () -> assertEquals(12.0, direcao.getRelacao(), "A relação deveria ser 12.0."),
                () -> assertEquals("MarcaY", direcao.getMarca(), "A marca deveria ser 'MarcaY'.")
        );
    }



}