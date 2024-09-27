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
        //sistemaEletrico.setVoltagem(3.0);
        sistemaEletrico.setVoltagem(12.0);
        //portas.abrirPorta(luzes, sistemaEletrico);
        portas.fecharPorta();
        assertFalse(luzes.getEstado(), "Está se esperando um resultado false");
    }

    //TESTE INTEGRADO (FREIOS - SUSPENSÃO)
    @Test
    public void testAjusteFreiosComSuspensao() {
        // Verifica o desgaste inicial dos freios
        double desgasteInicial = freios.verificarDesgaste();
        // Ajuste da altura da suspensão para baixo
        //suspensao.ajustarAltura(12.0, freios);
        suspensao.ajustarAltura(8.0, freios);
        assertTrue(freios.verificarDesgaste() > desgasteInicial);
    }

    //TESTE INTEGRADO (MOTOR - SISTEMA COMBUSTÍVEL)
    @Test
    public void testeNaoLigarMotorSemCombustivel() {
        // Tentando ligar o motor
        //sistemaCombustivel.setNivelDeCombustivel(200);
        sistemaCombustivel.setNivelDeCombustivel(0);
        motor.ligarMotor(sistemaCombustivel);
        // Verificando se o motor não está ligado devido à falta de combustível
        assertFalse(motor.verificarEstado(), "O motor não deve estar ligado devido à falta de combustível.");
    }

    //TESTE INTEGRADO (BANCOS - PNEUS - SISTEMA DIREÇÃO)
    @Test
    public void testeAjusteBancoImpactaNaPressaoPneu() {
        double pressaoInicial = pneus.verificarPressao();
        System.out.println(pressaoInicial);
        //sistemaDirecao.ajustarDirecao(0.5);
        //banco.ajustarAltura(0.5); // Ajuste de altura do banco
        banco.ajustarAltura(2.0);
        sistemaDirecao.ajustarDirecao(1.5);
        pneus.ajustarPressao(pressaoInicial, sistemaDirecao, banco);
        double pressaoFinal = pneus.verificarPressao();
        System.out.println(pressaoFinal);
        assertNotEquals(pressaoInicial, pressaoFinal, "A pressão do pneu diferente após o ajuste da altura e direção.");
    }



    //TESTE INTEGRADO (MOTOR - SIST. COMBUSTIVEL - SIST.TRANSMISSÃO - SIST. DIREÇÃO)
    @Test
    public void testeMotorImpactaTrocaMarcha() {
        // Verificação se o motor está funcionando
        sistemaCombustivel.setNivelDeCombustivel(2);
        //sistemaCombustivel.setNivelDeCombustivel(0);
        motor.ligarMotor(sistemaCombustivel);
        //sistemaDirecao.ajustarDirecao(0.0);
        sistemaDirecao.ajustarDirecao(1.0);
        sistemaTransmissao.trocarMarcha("2", motor, sistemaDirecao);
        assertNotNull(sistemaTransmissao.getMarcha(), "O tipo de transmissão não deve ser nulo após a troca de marcha.");
    }

    //TESTE INTEGRADO (SIST.COMBUSTÍVEL - PAINEL)
    @Test
    public void testeAtualizaPainelComCombustivel() {
        // Configuração inicial
        double km = carro.getQuilometragem();
        sistemaCombustivel.setNivelDeCombustivel(0.0);
        sistemaCombustivel.abastecer(50.0); // Abastece o carro com 50 litros
        //sistemaCombustivel.abastecer(5.0)
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, km);
        painel.ligarDisplay(); // Liga o painel

        // Verifica se o nível de combustível foi atualizado no painel
        String infoCompleta = painel.getInfo();
        String nivelCombustivel = infoCompleta.substring(infoCompleta.indexOf("Nível de Combustivel: "), infoCompleta.indexOf("\n", infoCompleta.indexOf("Nível de Combustivel: ")));
        assertEquals(nivelCombustivel, "Nível de Combustivel: 50.0L");
    }

    //TESTE INTEGRADO (SIST.ELÉTRICO - PORTAS - PAINEL)
    @Test
    public void testeAberturaPortaAtualizaPainelInformacoes() {
        // Ligar o sistema elétrico antes de abrir a porta
        //sistemaEletrico.setEstado(false);
        sistemaEletrico.setEstado(true);

        // Abrindo a porta e ligando as luzes
        portas.abrirPorta(luzes, sistemaEletrico);
        //portas.fecharPorta();

        // Atualizando as informações do painel
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico, 0.0);

        // Verificando se o painel contém a informação correta sobre a porta aberta
        assertTrue(painel.getInfo().contains("A porta está aberta!"), "O painel deve informar que a porta está aberta após a abertura.");
    }


    //TESTE INTEGRADO (BANCO - CARRO)
    @Test
    public void testeSetEstadoBanco() {
       carro.setEstadoBanco(4.0); // Ajustando o estado do banco, alterando no Objeto Banco
        // carro.setEstadoBanco(8.0);

        // Verificando se o estado foi ajustado corretamente
        assertEquals("O banco está inclinado 75º", banco.getEstado(), "O estado do banco deve ser 75º.");
    }

    // TESTE INTEGRADO (CARRO - SISTEMA DE COMBUSTIVEL)
    @Test
    public void testExcessoDeCombustivel() {
        //abastecer o carro (Valor adicionado no Sistema de Combustivel)
        sistemaCombustivel.setNivelDeCombustivel(0.0);
        carro.abastecerCarro(50.0);
        //carro.abastecerCarro(75.0);
        // Verificando se o nível de combustível ultrapassou a capacidade esperada
        assertNotEquals(75.0, sistemaCombustivel.verificarNivel(),"O nível de combustível tem que ser diferente!");
    }

}