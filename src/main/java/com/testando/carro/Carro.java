package com.testando.carro;

public class Carro {

    private Motor motor;
    private SistemaCombustivel sistemaCombustivel;
    private Painel painel;
    private Freios freios;
    private Luzes luzes;
    private Banco banco;
    private Portas portas;
    private Pneus pneus;
  

    public Carro(Motor motor, SistemaCombustivel sistemaCombustivel, Painel painel, Luzes luzes, Portas portas, Freios freios, Banco banco, Pneus pneus) {
        this.motor = motor;
        this.sistemaCombustivel = sistemaCombustivel;
        this.painel = painel;
        this.luzes = luzes;
        this.portas = portas;
        this.freios = freios;
        this.banco = banco;
        this.pneus = pneus;
        
    }

    //METODOS DO PAINEL
    public void exibirInformacoesPainel() {
        painel.exibirStatus(motor, sistemaCombustivel, luzes, portas);
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
