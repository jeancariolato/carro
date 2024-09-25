package com.testando.carro;

public class SistemaDirecao {
    private String tipo;

    private boolean assistido;

    private String material;

    private Double relacao;

    private String marca;
    private boolean estado;
    double ang = 0;

    public SistemaDirecao(String tipo, boolean assistido, String material, Double relacao, String marca, boolean estado) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
        this.estado = estado;
    }

    public double getAng() {
        return ang;
    }

    public Double ajustarDirecao(Double angulo){
        Double ang = angulo;
        System.out.println("O angulo da direção:" + ang);
        return ang;
    }

    public void verificarEstado(){
        if(estado == true){
            System.out.println("O sistema de direção está funcionando");
        }
        else{
            System.out.println("O sistema de direção não está funcionando");
        }
    }

    public void substituirComponente(String tipo, boolean assistido, String material, Double relacao, String marca) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getRelacao() {
        return relacao;
    }

    public void setRelacao(Double relacao) {
        this.relacao = relacao;
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
