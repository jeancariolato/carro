package com.testando.carro;

public class Carro {

    private Motor motor;
    private SistemaCombustivel sistemaCombustivel;
    private SistemaEletrico sistemaEletrico;
    private SistemaTransmissao sistemaTransmissao;
    private SistemaDirecao sistemaDirecao;
    private Painel painel;
    private Freios freios;
    private Luzes luzes;
    private Banco banco;
    private Portas portas;
    private Pneus pneus;
    private Suspensao suspensao;


    public Carro(Motor motor, SistemaCombustivel sistemaCombustivel, SistemaEletrico sistemaEletrico, SistemaTransmissao sistemaTransmissao, SistemaDirecao sistemaDirecao, Painel painel, Freios freios, Luzes luzes, Banco banco, Portas portas, Pneus pneus, Suspensao suspensao) {
        this.motor = motor;
        this.sistemaCombustivel = sistemaCombustivel;
        this.sistemaEletrico = sistemaEletrico;
        this.sistemaTransmissao = sistemaTransmissao;
        this.sistemaDirecao = sistemaDirecao;
        this.painel = painel;
        this.freios = freios;
        this.luzes = luzes;
        this.banco = banco;
        this.portas = portas;
        this.pneus = pneus;
        this.suspensao = suspensao;
    }

    //METODOS DO PAINEL
    public void exibirInformacoesPainel() {
        painel.exibirStatus(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico);
    }

    //METODOS DO SISTEMA DE FREIO
    public void ajustarFreios(){
        freios.ajustarFreio();
    }

    public void substituirPastilha(){
        freios.substituirPastilhas();
    }

    // METODOS PARA O BANCO
    public void ajustarAlturaBanco(double novaAltura){
        banco.ajustarAltura(novaAltura);
    }

    public void ligandoLuzes(boolean estado){
        boolean e = estado;
        luzes.onOff(e);
    }

    // METODOS DO SISTEMA DE COMBUSTIVEL
    public void abastecerCarro(double gasolina){
        sistemaCombustivel.abastecer(gasolina);
    }



}
