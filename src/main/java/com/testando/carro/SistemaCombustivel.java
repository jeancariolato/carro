package com.testando.carro;

public class SistemaCombustivel {

    private double nivelDeCombustivel;
    private double capacidade;
    private String tipoDeCombustivel;
    private String marca;
    private boolean estado;

    public SistemaCombustivel(double nivelDeCombustivel, double capacidade, String tipoDeCombustivel, String marca, boolean estado) {
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

    public void subtistuirTanque(double nivelDeCombustivel, double capacidade, String tipoDeCombustivel, String marca, boolean estado) {
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.capacidade = capacidade;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.marca = marca;
        this.estado = estado;
        System.out.println("Tanque trocado!");
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

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
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
