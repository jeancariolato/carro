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
    public void onOff(boolean estado, SistemaEletrico sistemaeletrico){
        if(estado == true){
            ligaLuzes(sistemaeletrico);
        } else {
            desligaLuzes();
        }
    }

    public void ligaLuzes(SistemaEletrico sistemaeletrico) {
        if(sistemaeletrico.getVoltagem()>=12){
            estado = true;
            System.out.println("AS LUZES DO CARRO ESTÃO LIGADAS!");
        }
        else{
            System.out.println("NÃO FOI POSSIVEL LIGAR AS LUZES.");
        }
    }

    public void desligaLuzes() {
        System.out.println("AS LUZES DO CARRO ESTÃO DESLIGADAS!");
        estado = false;
    }

    public void ajustarIntensidade(int novaIntensidade) {
        if(estado=true){
            this.intensidade = novaIntensidade;
            System.out.println("A INTENSIDADE DAS LUZES ESTÃO EM:" + novaIntensidade);
        }
        else {
            System.out.println("AS LUZES NÃO ESTÃO LIGADAS");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
