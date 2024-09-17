package com.testando.carro;

public class Main {
    public static void main(String[] args) {
        // CONSTRUINDO UM 'CARRO'
        Motor motor = new Motor("Teste", 1000, 12.0, "MARCA", true);
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel(125.0, 250.0, "COMUM", "PETROSHOW", true);
        SistemaDirecao sistemaDirecao = new SistemaDirecao("Mecânica", true, "Ferro", 5.0, "Danfoss", true);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 105.0, "Niquel", true, "Moura");
        SistemaTransmissao sistemaTransmissao = new SistemaTransmissao("Automática", 6, "Ferro", "Valeo", true);
        Painel painel = new Painel();
        Luzes luzes = new Luzes("LED", 25, "AMARELA", false, "H3");
        Freios freios = new Freios("A disco", "Ferro", 25.0, "Cobreq", 12.0);
        Banco banco = new Banco(4, "PRETO", "", "", "");
        Pneus pneus = new Pneus("Grande", "Offroad", 22.0, "Bridgestone", "Cheio");
        Portas portas = new Portas(4, "Aço", "Cinza", "Asas de Borboleta", true);
        Suspensao suspensao = new Suspensao("Telescópica", "Ferro", 10.0, 5, "Cofap");


        // OBJETO CARRO
        Carro carro = new Carro(motor,sistemaCombustivel, sistemaEletrico, sistemaTransmissao, sistemaDirecao, painel, freios, luzes, banco, portas, pneus, suspensao, "BMW iX1", 2024, "Prata", "JNE-2343", 0);

        // FREIOS
        carro.substituirPastilha();
        carro.ajustarFreios();

        // COMBUSTIVEL
        carro.abastecerCarro(25.0);

        // BANCO
        carro.ajustarAlturaBanco(2.0);

        // LUZES
        carro.ligandoLuzes(false);

        // PAINEL
        carro.exibirInformacoesPainel();

    }
}
