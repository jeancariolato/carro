package com.testando.carro;

public class SistemaCombustivel {

    private double nivelDeCombustivel;


    public SistemaCombustivel(Double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
    }

    //RETORNAR NIVEL DE COMBUSTIVEL
    public double getNivelCombustivel(){
        return nivelDeCombustivel;

    }

    public void abastecer(Double quantidade){
        //QUANTIDADE < CAPACIDADE
    }

    public void substituirTanque(){
        //SETAR UM TANQUE DO ZERO (OBJETO DA CLASSE/CONSTRUTOR)
    }
}
