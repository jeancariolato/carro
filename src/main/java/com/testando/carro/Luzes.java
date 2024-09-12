package com.testando.carro;

public class Luzes {
    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado;
    private String modelo;

    public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.cor = cor;
        this.estado = estado;
        this.modelo = modelo;
    }

    // METODO PARA LIGAR OU DESLIGAR
    public void onOff(boolean estado){
        if(estado == true){
            ligaLuzes();
        } else {
            desligaLuzes();
        }
    }

    public void ligaLuzes() {
        System.out.println("AS LUZES DO CARRO ESTÃO LIGADAS!");
        estado = true;
    }

    public void desligaLuzes() {
        System.out.println("AS LUZES DO CARRO ESTÃO DESLIGADAS!");
        estado = false;
    }

    public void ajustarIntensidade(int novaIntensidade) {
        novaIntensidade = intensidade;
        System.out.println("A INTENSIDADE DAS LUZES ESTÃO EM:" + novaIntensidade);
    }

}
