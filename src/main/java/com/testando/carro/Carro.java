package com.testando.carro;

public class Carro {

    private Motor motor;
    private SistemaCombustivel sistemaCombustivel;
    private Painel painel;
    private Freios freios;
    private Luzes luzes;

    public Carro(Motor motor, SistemaCombustivel sistemaCombustivel, Painel painel, Luzes luzes, Freios freios) {
        this.motor = motor;
        this.sistemaCombustivel = sistemaCombustivel;
        this.painel = painel;
        this.luzes = luzes;
        this.freios = freios;
    }

    public void exibirInformacoesPainel() {
        painel.exibirStatus(motor, sistemaCombustivel);
    }

    //METODOS DO SISTEMA DE FREIO
    public void ajustarFreios(){
        freios.ajustarFreio();
    }

    public void substituirPastilha(){
        freios.substituirPastilhas();
    }



}
