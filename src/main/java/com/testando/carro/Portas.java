package com.testando.carro;

public class Portas {
    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private boolean estado;



    public void verificarEstado(boolean estado){
        this.estado = estado;

        if(estado==true) {
            System.out.println("A porta está aberta!");
            System.out.println("------------------------");
        }
        else {
            System.out.println("A porta está fechada!");
            System.out.println("------------------------");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

}
