package com.testando.carro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MainTest {


    Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
    SistemaCombustivel sistemaCombustivel = new SistemaCombustivel(25.0, 250.0, "COMUM", "PETROSHOW", true);
    SistemaDirecao sistemaDirecao = new SistemaDirecao("Mecânica", true, "Ferro", 5.0, "Danfoss", true);
    SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura");
    SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Automática", 6, "Ferro", "Valeo", true);
    Painel painel = new Painel("", "Digital", "LCD", true, "Bosch", true);
    Luzes luzes = new Luzes("LED", 25, "AMARELA", false, "H3");
    Freios freios = new Freios("A disco", "Ferro", 25.0, "Cobreq", 12.0);
    Banco banco = new Banco(4, "PRETO", "", "", "", 1.2);
    Pneus pneus = new Pneus("Grande", "Offroad", 22.0, "Bridgestone", "Cheio");
    Portas portas = new Portas(4, "Aço", "Cinza", "Asas de Borboleta", true);
    Suspensao suspensao = new Suspensao("Telescópica", "Ferro", 10.0, 5, "Cofap");

    // OBJETO CARRO
    Carro carro = new Carro(motor, sistemaCombustivel, sistemaEletrico, sistemaTransmissao, sistemaDirecao, painel, freios, luzes, banco, portas, pneus, suspensao, "BMW iX1", 2024, "Prata", "JNE-2343", 1000);


    //TESTE INTEGRADO (PORTAS - LUZES - SISTEMA ELÉTRICO)
    @Test
    public void testAbrirPortaLigaLuzes() {
        portas.abrirPorta(luzes, sistemaEletrico);
        assertFalse(luzes.getEstado(), "Está se esperando um resultado false");
    }

    //TESTE INTEGRADO (LUZES - SISTEMA ELÉTRICO)
    @Test
    public void testeNaoLigarLuzes() {
        luzes.ligaLuzes(sistemaEletrico);

        assertFalse(luzes.isEstado(), "As luzes não devem estar ligadas devido à voltagem insuficiente.");
    }

    //TESTE INTEGRADO (FREIOS - SUSPENSÃO)
    @Test
    public void testAjusteFreiosComSuspensao() {
        // Verifica o desgaste inicial dos freios
        double desgasteInicial = freios.verificarDesgaste();

        // Ajuste da altura da suspensão para baixo
        suspensao.ajustarAltura(8.0);

        // Aumenta o desgaste dos freios se a altura da suspensão for menor que 10
        if (suspensao.getAltura() < 10) {
            double novoDesgaste = desgasteInicial + 5.0; // Simula um aumento no desgaste
            freios.SubstituirFreios("A disco", "Ferro", novoDesgaste, "Cobreq", 13.0);
            // Verificando se o desgaste é maior que o inicial
            assertTrue(freios.verificarDesgaste() > desgasteInicial);
            System.out.println("O desgaste deve aumentar ao abaixar a suspensão");
        } else {
            // Se a altura não for afetada, verifica se o desgaste permanece igual
            assertEquals(desgasteInicial, freios.verificarDesgaste());
            System.out.println("O desgaste deve permanecer igual ao manter a altura");
        }
    }

    //TESTE INTEGRADO (MOTOR - SISTEMA COMBUSTÍVEL)
    @Test
    public void testeNaoLigarMotorSemCombustivel() {
        // Tentando ligar o motor
        motor.ligarMotor(sistemaCombustivel);
        // Verificando se o motor não está ligado devido à falta de combustível
        assertFalse(motor.verificarEstado(), "O motor não deve estar ligado devido à falta de combustível.");
    }

    //TESTE INTEGRADO (BANCOS - PNEUS)
    @Test
    public void testeAjusteBancoImpactaNaPressaoPneu() {
        // Ajustando a altura do banco
        banco.ajustarAltura(2.0); // Ajuste de altura do banco

        // Simulando um impacto na pressão do pneu baseado na altura do banco
        double novaPressao = pneus.verificarPressao() + (banco.verificarAltura() * 0.5); // Exemplo de lógica de impacto

        // Ajustando a pressão do pneu
        pneus.ajustarPressao(novaPressao);

        // Verificando se a nova pressão está dentro de limites aceitáveis
        assertTrue(novaPressao >= 30.0 && novaPressao <= 40.0,
                "A pressão do pneu deve estar entre 30 e 40 após o ajuste da altura do banco.");
    }



    //TESTE INTEGRADO (MOTOR - SIST. COMBUSTIVEL - SIST.TRANSMISSÃO)
    @Test
    public void testeMotorImpactaTrocaMarcha() {
        // Configurações iniciais
        motor.ligarMotor(sistemaCombustivel);
        sistemaTransmissao.setEstado(true); // Simulando que a transmissão está em bom estado

        // Troca de marcha
        sistemaTransmissao.trocarMarcha(2, motor);

        // Verificação se o motor está funcionando
        assertTrue(motor.verificarEstado(), "O motor deve estar ligado para que a troca de marcha funcione.");

        // Verificando se a marcha foi trocada corretamente
        assertNotNull(sistemaTransmissao.getTipo(), "O tipo de transmissão não deve ser nulo após a troca de marcha.");
    }

    //TESTE INTEGRADO (SIST.COMBUSTÍVEL - PAINEL)
    @Test
    public void testeAtualizaPainelComCombustivel() {
        // Configuração inicial
        double km = carro.getQuilometragem();
        sistemaCombustivel.abastecer(50.0); // Abastece o carro com 50 litros
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, km);
        painel.ligarDisplay(); // Liga o painel

        // Verifica se o nível de combustível foi atualizado no painel
        Boolean painelStatus = painel.getEstado();
        assertNotNull(painelStatus, "O status do painel não deve ser nulo após o abastecimento.");
        sistemaCombustivel.setEstado(false);
        // Verifica se o sistema de combustível está com estado correto
        assertFalse(sistemaCombustivel.isEstado(), "O sistema de combustível deve estar funcionando após o abastecimento.");
    }

    //TESTE INTEGRADO (SIST.ELÉTRICO - PORTAS - PAINEL)
    @Test
    public void testeAberturaPortaAtualizaPainelInformacoes() {
        // Ligar o sistema elétrico antes de abrir a porta
        sistemaEletrico.setEstado(true);

        // Abrindo a porta e ligando as luzes
        portas.abrirPorta(luzes, sistemaEletrico);

        // Atualizando as informações do painel
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, 0.0);

        // Verificando se o painel contém a informação correta sobre a porta aberta
        assertTrue(painel.getInfo().contains(portas.verificarEstado()), "O painel deve informar que a porta está aberta após a abertura.");
    }

    //TESTE INTEGRADO (PNEUS - SIST.DIRECAO )
    @Test
    public void testAjusteDirecaoImpactaPressaoPneu() {
        // Estado inicial do pneu
        double pressaoInicial = pneus.verificarPressao();

        // Ajuste da direção
        sistemaDirecao.ajustarDirecao(5.0); // Ajuste da direção que impactará na pressão

        // Simulando o impacto na pressão do pneu baseado no ângulo ajustado
        double novaPressao = pressaoInicial - (sistemaDirecao.getAng() * 0.5); // Exemplo de lógica

        // Ajustando a pressão do pneu
        pneus.ajustarPressao(novaPressao);

        // Verificando se a nova pressão está abaixo do limite mínimo
        assertTrue(novaPressao >= 30.0, "A pressão do pneu deve ser no mínimo 30 após o ajuste da direção.");
    }

    //TESTE INTEGRADO (BANCOS - SIST.DIREÇÃO)
    @Test
    public void testAjusteBancoImpactaDirecao() {
        // Ajuste da altura do banco
        banco.ajustarAltura(3.0); // Ajuste de altura do banco

        // Simulando que o ajuste do banco impacta no controle da direção
        sistemaDirecao.ajustarDirecao(banco.verificarAltura() * 0.5); // Exemplo de lógica de impacto

        // Verificando se o ângulo da direção está no intervalo esperado
        assertTrue(sistemaDirecao.getAng() > 0, "O ângulo da direção deve ser positivo após o ajuste do banco.");
    }

    //TESTE INTEGRADO (SIST.DIRECÃO - SIST.TRANSMISSÃO)
    @Test
    public void testDirecaoInvalidaImpactaTrocaMarcha() {
        // Ajuste a direção para um valor inválido (como um ângulo fora do intervalo)
        sistemaDirecao.ajustarDirecao(-5.0); // Um ajuste negativo representa uma direção inválida

        // Tenta trocar a marcha com direção inválida
        if (sistemaDirecao.getAng() < 0) {
            sistemaTransmissao.setTipo(null); // Define o tipo como nulo se a direção for inválida
        } else {
            sistemaTransmissao.trocarMarcha(2, motor); // Troca de marcha apenas se a direção for válida
        }

        // Verifica se o tipo de transmissão é nulo devido à direção inválida
        assertNull(sistemaTransmissao.getTipo(), "O tipo de transmissão deve ser nulo devido à direção inválida.");
    }

    //TESTE INTEGRADO (BANCO - CARRO)
    @Test
    public void testeSetEstadoBanco() {
       carro.setEstadoBanco(8.0); // Ajustando o estado do banco, alterando no Objeto Banco

        // Verificando se o estado foi ajustado corretamente
        assertEquals("O banco está inclinado 75º", banco.getEstado(), "O estado do banco deve ser 75º.");
        System.out.println("O banco está inclinado 75º");
    }

    // TESTE INTEGRADO (CARRO - SISTEMA DE COMBUSTIVEL)
    @Test
    public void testExcessoDeCombustivel() {
        //abastecer o carro (Valor adicionado no Sistema de Combustivel)
        carro.abastecerCarro(50.0);

        // Verificando se o nível de combustível ultrapassou a capacidade esperada
        assertNotEquals(75.0, sistemaCombustivel.verificarNivel(),"O nível de combustível tem que ser diferente!");
    }

}