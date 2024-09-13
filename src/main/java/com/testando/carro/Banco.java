package com.testando.carro;

public class Banco {
    private int quantidade;
    private String material;

    private String cor;
    private String tipo;
    private String estado;

    public Banco(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String ajustarEncosto(String posicao) {
        String position = posicao;
        return position;
    }

    public double ajustarAltura(double novaAltura) {

        double alturaMinima = 0.5; 
        double alturaMaxima = 2.0; 

     
        if (novaAltura < alturaMinima) {
            System.out.println("A ALTURA DO BANCO ESTÁ NO MÍNIMO! " + alturaMinima);
            System.out.println("---------------------------------------------");
            return alturaMinima; 
           
        } else if (novaAltura > alturaMaxima) {
            System.out.println("A ALTURA DO BANCO ESTÁ NO MÁXIMO! " + alturaMaxima);
            System.out.println("---------------------------------------------");
            return alturaMaxima; 
        }

        return novaAltura;
    }

    public void verificarEstado() {
        double var = (Math.random() * 10 ) + 1;
        if(var<2.5){
            System.out.println("O banco está inclinado 90º" + "\n------------------------");
        }
        if(var>2.5||5>var){
            System.out.println("O banco está inclinado 75º" + "\n------------------------");
        }
        if(var>5||7.5>var){
            System.out.println("O banco está inclinado 50º" + "\n------------------------");
        }
        if(var>7.5||10>var){
            System.out.println("O banco está inclinado 35º" + "\n------------------------");
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
