package com.testando.carro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel(125.0, 250.0, "COMUM", "PETROSHOW", true);
        SistemaDirecao sistemaDirecao = new SistemaDirecao("Mecânica", true, "Ferro", 5.0, "Danfoss", true);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura");
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Automática", 6, "Ferro", "Valeo", true);
        Painel painel = new Painel("", "Digital", "LCD", true, "Bosch", true);
        Luzes luzes = new Luzes("LED", 25, "AMARELA", false, "H3");
        Freios freios = new Freios("A disco", "Ferro", 25.0, "Cobreq", 12.0);
        Banco banco = new Banco(4, "PRETO", "", "", "");
        Pneus pneus = new Pneus("Grande", "Offroad", 22.0, "Bridgestone", "Cheio");
        Portas portas = new Portas(4, "Aço", "Cinza", "Asas de Borboleta", true);
        Suspensao suspensao = new Suspensao("Telescópica", "Ferro", 10.0, 5, "Cofap");

        // OBJETO CARRO
        Carro carro = new Carro(motor, sistemaCombustivel, sistemaEletrico, sistemaTransmissao, sistemaDirecao, painel, freios, luzes, banco, portas, pneus, suspensao, "BMW iX1", 2024, "Prata", "JNE-2343", 1000);

    @Test
    void testeAtualizarKM() {
        carro.fecharPorta();

        carro.atualizarQuilometragem(); //Mathrandom

        assertNotEquals(1000, carro.getQuilometragem());
    }

    /**
     * Verifica se o estado inicial é nulo e se pode ser alterado para um valor não nulo.
     */
    @Test
    public void testeEstadoNulo() {
        banco.setEstado();
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
        SistemaEletrico sistemaEletrico = new SistemaEletrico(0.0, 105.0, "Niquel", true, "Moura"); // supondo que 5V é insuficiente
        Luzes luzes = new Luzes("LED", 50, "Branco", false, "Modelo X");

        luzes.ligaLuzes(sistemaEletrico);

        assertFalse(luzes.isEstado(), "As luzes não devem estar ligadas devido à voltagem insuficiente.");
    }
    /**
     * Verifica se o tipo, marca e potência do motor foram corretamente inicializados.
     */
    @Test
    public void testeMotorNaoNulo() {
        // Arrange: Criar um motor
        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", false);

        assertNotNull(motor.getTipo(), "O tipo do motor não deve ser nulo.");
        assertNotNull(motor.getMarca(), "A marca do motor não deve ser nula.");
        assertNotNull(motor.getPotencia(), "A potência do motor não deve ser nula.");
    }

    /**
     * Verifica se o estado do motor é alterado corretamente após ser desligado.
     */
    @Test
    public void testeDesligarMotor() {
        Motor motor = new Motor("V8", 450, 6.2, "Ferrari", true);

        motor.desligarMotor();

        assertFalse(motor.verificarEstado(), "O motor deve estar desligado");
    }
    /**
     * Verifica se a pressão do pneu é alterada corretamente após o ajuste.
     */
    @Test
    public void testAjustarPressao() {
        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        pneu.ajustarPressao(28.0);

        assertNotEquals(32.0, pneu.verificarPressao(), "A pressão do pneu deve ser diferente de 32.0 após o ajuste.");
    }

    /**
     * Verifica se o estado do pneu foi definido corretamente como "Novo".
     */
    @Test
    public void testPneuNovoUsado() {
        Pneus pneu = new Pneus("15", "Esportivo", 32.0, "Michelin", "Novo");

        assertTrue(pneu.getEstado().equals("Usado"), "O estado do pneu deve ser 'Usado'.");
    }
    /**
     * Verifica se a porta é aberta corretamente e se seu estado muda para 'true'.
     */
    @Test
    void testPortaAberta() {
        Portas porta = new Portas(4, "Aço", "Preto", "Dianteira", false);
        Luzes luzes = new Luzes("LED", 25, "AMARELA", false, "H3");
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura");

        porta.abrirPorta(luzes, sistemaEletrico); // Abrir porta já set como 'true'
        assertTrue(porta.isEstado(), "A porta deve estar aberta.");
    }

    /**
     * Verifica se a porta é fechada corretamente e se seu estado muda para 'false'.
     */
    @Test
    void testPortaFechada() {
        Portas porta = new Portas(4, "Aço", "Preto", "Dianteira", true);
        porta.fecharPorta();
        assertFalse(porta.isEstado(), "A porta deve estar fechada.");
    }
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
    /**
     * Verifica se a voltagem está abaixo de 12 para considerar a bateria em mau estado.
     */
    @Test
    void verificarBateriaTeste() {
        SistemaEletrico sistema = new SistemaEletrico(12.0, 50.0, "Ácido-Chumbo", true, "MarcaX");

        sistema.verificarBateria();

        assertTrue(sistema.getVoltagem() < 12, "A voltagem deve estar abaixo de 12 para a bateria estar em mau estado.");
    }

    /**
     * Verifica se o sistema elétrico está ligado.
     */
    @Test
    void estadoSistemaTeste() {
        SistemaEletrico sistema = new SistemaEletrico(10.0, 50.0, "Ácido-Chumbo", true, "MarcaX");

        assertTrue(sistema.getEstado(), "O Sistema deveria ser ligado!");
    }
    /**
     * Verifica se o número de marchas não pode ser 6.
     */
    @Test
    void trocarMarchaTeste() {
        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        motor.verificarEstado(); // Verifica o estado do motor (embora o resultado não esteja sendo usado aqui)

        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        // O número de marchas não deve ser 6, já que foi definido como 5
        assertNotEquals(6, sistemaTransmissao.getNumeroMarchas(), "O número de marchas não pode ser 6");
    }

    /**
     * Verifica se o sistema de transmissão está desligado.
     */
    @Test
    void estadoTransmissaoTeste() {
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Manual", 5, "Aço", "MarcaY", true);

        boolean estado = sistemaTransmissao.getEstado();

        // O estado do sistema deve ser 'false' para indicar que está desligado
        assertFalse(estado, "O sistema de transmissão deveria estar desligado!");
    }
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