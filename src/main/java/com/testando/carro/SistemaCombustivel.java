package com.testando.carro;

public class SistemaCombustivel {
    private String tipoDeCombustivel;
    private Double capacidade;
    private Double nivelDeCombustivel;

    private String marca;

    private Boolean estado;

    public SistemaCombustivel(String tipoDeCombustivel, Double capacidade, Double nivelDeCombustivel, String marca, Boolean estado) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    public void verificarNivel(Double gasLevel){
        gasLevel = nivelDeCombustivel;
        //IF E ELSE (combustivel < 10 ou combustivel > 10)
    }

    public void abastecer(Double quantidade){
        //QUANTIDADE < CAPACIDADE
    }

    public void substituirTanque(){
        //SETAR UM TANQUE DO ZERO (OBJETO DA CLASSE/CONSTRUTOR)
    }
}
