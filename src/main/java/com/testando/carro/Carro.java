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
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;


    public Carro(Motor motor, SistemaCombustivel sistemaCombustivel, SistemaEletrico sistemaEletrico, SistemaTransmissao sistemaTransmissao, SistemaDirecao sistemaDirecao, Painel painel, Freios freios, Luzes luzes, Banco banco, Portas portas, Pneus pneus, Suspensao suspensao, String modelo, int ano, String cor, String placa, double quilometragem) {
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
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    //METODOS DO CARRO

    public void ligar(){
        motor.ligarMotor(sistemaCombustivel);
        luzes.ligaLuzes();
    }
    public void desligar(){
        motor.desligarMotor();
        luzes.desligaLuzes();
    }
    public void atualizarQuilometragem(double km){
        quilometragem = km;
    }

    //METODOS DO PAINEL
    public void ligarDisplay() {
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico);
        painel.ligarDisplay();
    }
    public void desligarDisplay(){
        painel.desligarDisplay();
    }
    public void atualizarInformacoes(){
        painel.atualizarInformacoes(motor, sistemaCombustivel, luzes, portas, suspensao, banco, sistemaEletrico);
        painel.ligarDisplay();
    }

    //METODOS DO SISTEMA DE FREIO
    public void ajustarFreios(){
        freios.ajustarFreio();
    }
    public void substituirPastilha(){
        freios.substituirPastilhas();
    }
    public void verificarDesgaste(){
        freios.verificarDesgaste();
    }

    // METODOS PARA O BANCO
    public void ajustarAlturaBanco(double novaAltura){
        banco.ajustarAltura(novaAltura);
    }
    public void verificarEstadoBanco() {

        banco.verificarEstado();
    }
    public void ajustarEncostoBanco(String posicao){
        banco.ajustarEncosto(posicao);
    }

    // METODOS PARA AS LUZES

    public void ligandoLuzes(boolean estado){
        boolean e = estado;
        luzes.onOff(e);
    }
    public void ajustarIntensidade(int novaIntensidade){
        luzes.ajustarIntensidade(novaIntensidade);
    }

    // METODOS DO SISTEMA DE COMBUSTIVEL
    public void abastecerCarro(double gasolina){
        sistemaCombustivel.abastecer(gasolina);
    }
    public void substituirTanque(double nivelDeCombustivel, double capacidade, String tipoDeCombustivel, String marca, boolean estado){
        sistemaCombustivel.subtistuirTanque(nivelDeCombustivel, capacidade, tipoDeCombustivel, marca, estado);
    }
    public void verificarNivel(){
        System.out.println("O nivel do sistema de combustivel está em " +
        sistemaCombustivel.verificarNivel());
    }

    //METODOS PARA O MOTOR

    public void verificarEstadoMotor(){
        System.out.println("O estado do motor é: " + motor.verificarEstado());
    }

    //METODOS PARA OS PNEUS

    public void substituirPneu(String tamanho, String tipo, double pressao, String marca, String estado){
        pneus.substituir(tamanho, tipo, pressao, marca, estado);
    }

    public void verificarPressao(){
        System.out.println("O estado da pressão dos pneus é: " + pneus.verificarPressao());
    }
    public void ajustarPressao(double pressao){
        pneus.ajustarPressao(pressao);
    }

    //METODOS PARA AS PORTAS
    public void abrirPorta(){
        portas.abrirPorta(luzes);
    }
    public void fecharPorta(){
        portas.fecharPorta();
    }
    public void verificarEstadoPorta(){
        portas.verificarEstado();
    }

    //METODOS PARA O SISTEMA DE DIREÇAO

    public void ajustarDirecao(double angulo){
        sistemaDirecao.ajustarDirecao(angulo);
    }

    public void verificarEstadoDirecao(){
        sistemaDirecao.verificarEstado();
    }
    public void substituirComponenteDirecao(String tipo, boolean assistido, String material, Double relacao, String marca){
        sistemaDirecao.substituirComponente(tipo, assistido, material, relacao, marca);
    }

    //METODOS PARA O SISTEMA ELETRICO

    //METODOS PARA O SISTEMA DE TRANSMISSAO

    //METODOS PARA A SUSPENSAO



}
