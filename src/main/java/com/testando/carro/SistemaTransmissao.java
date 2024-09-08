package com.testando.carro;

public class SistemaTransmissao {
    private String tipo;
    private int numeroMarchas;
    private String material;

    private String marca;

    private Boolean estado;

    public SistemaTransmissao(String tipo, int numeroMarchas, String material, String marca, Boolean estado) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public void trocarMarcha(int marcha){
        //RECEBE O VALOR ATUAL DA MARCHA
    }

    public void verificarEstado(){

    }

    public void substituirComponente(String componente){
        //SETAR SISTEMA DE TRANSMISSAO DO ZERO(OBJETO DA CLASSE/CONTRSUTOR)
    }
}
