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

    }

}
