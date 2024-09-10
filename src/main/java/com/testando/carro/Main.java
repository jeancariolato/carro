package com.testando.carro;

public class Main {
    public static void main(String[] args) {
        //CONSTRUINDO UM 'CARRO'
        Motor motor = new Motor(1000,"Teste",12.0,"MARCA", true);
        SistemaCombustivel sistemaCombustivel = new SistemaCombustivel("COMUM", 200,100,"PETROSHOW", true);
        Painel painel = new Painel();
        Luzes luzes = new Luzes("LED",25, "AMARELA", false, "H3");
        Freios freios = new Freios("","", 25.0,"", 12.0);
        Suspensao suspensao = new Suspensao();
        Banco banco = new Banco(4,"PRETO","","","");
        Pneus pneu = new Pneus("Grande", "Offroad", 22.0, "Bridgestone", "Cheio");

        //OBJETO CARRO
        Carro carro = new Carro(motor, sistemaCombustivel, painel, luzes, freios, banco);

        //PAINEL
        carro.exibirInformacoesPainel();

        //FREIOS
        carro.substituirPastilha();
        carro.ajustarFreios();

        //

    }
}
