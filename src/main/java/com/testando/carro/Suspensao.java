package com.testando.carro;

public class Suspensao {
    private String tipo;
    private String material;
    private double altura;
    private int rigidez;
    private String marca;
    public void ajustarAltura(double altura){
        this.altura = altura;
    }
    public void verificarEstado(){
        System.out.println("Altura: " + altura + ", Rigidez: " + rigidez);
    }
    public void substituir(){
        System.out.println("Suspensão substituida.");
    }
}
