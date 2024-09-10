package com.testando.carro;

public class SistemaCombustivel {

    private double nivelDeCombustivel;
    private double capacidade;
    private double tipoDeCombustivel;
    private String marca;
    private boolean estado;

    public SistemaCombustivel(double nivelDeCombustivel, double capacidade, double tipoDeCombustivel, String marca, boolean estado) {
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.capacidade = capacidade;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    public double verificarNivel(){
        return nivelDeCombustivel;

    }

    public void abastecer(Double quantidade){
            if ((quantidade+nivelDeCombustivel)<=capacidade){
                nivelDeCombustivel += quantidade;
            }
            else {
                System.out.println("A quantidade de combustivel está acima da capacidade do tanque.");
            }
    }

    public void subtistuirTanque(double nivelDeCombustivel, double capacidade, double tipoDeCombustivel, String marca, boolean estado) {
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.capacidade = capacidade;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(double tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
